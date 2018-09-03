package com.alfinandika.springBootWeb.controller;

import com.alfinandika.springBootWeb.model.Mahasiswa;
import com.alfinandika.springBootWeb.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;

@Controller
public class MahasiswaController {

    @Autowired
    private MahasiswaService mahasiswaService;

    @GetMapping("/")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView("mahasiswa");
        mv.addObject("mahasiswa", mahasiswaService.findAll());

        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(Mahasiswa mahasiswa){
        ModelAndView mv = new ModelAndView("mahasiswaAdd");
        mv.addObject("mahasiswa", mahasiswa);

        return mv;
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid Mahasiswa mahasiswa, BindingResult bindingResult){
        mahasiswa.setJoinDate(new Date());
        if(bindingResult.hasErrors()){
            return add(mahasiswa);
        }else{
            mahasiswaService.save(mahasiswa);
            return findAll();
        }

    }

    @GetMapping("/edit/{id}")
    public  ModelAndView edit(@PathVariable("id") Long id){
        return add(mahasiswaService.findOne(id));
    }

    @GetMapping("/delete/{id}")
    public  ModelAndView delete(@PathVariable("id") Long id){
        mahasiswaService.delete(id);

        return findAll();
    }
}
