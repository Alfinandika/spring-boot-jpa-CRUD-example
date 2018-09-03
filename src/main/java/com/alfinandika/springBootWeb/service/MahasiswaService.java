package com.alfinandika.springBootWeb.service;

import com.alfinandika.springBootWeb.model.Mahasiswa;
import com.alfinandika.springBootWeb.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MahasiswaService {

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    public List<Mahasiswa> findAll(){
        return mahasiswaRepository.findAll();
    }

    public Mahasiswa findOne(Long id) {
        return mahasiswaRepository.getOne(id);
    }

    public Mahasiswa save(Mahasiswa mhs){
        return mahasiswaRepository.saveAndFlush(mhs);
    }

    public void delete(Long id){
        mahasiswaRepository.deleteById(id);
    }
}
