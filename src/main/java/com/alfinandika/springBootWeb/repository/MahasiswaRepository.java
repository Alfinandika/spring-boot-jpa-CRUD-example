package com.alfinandika.springBootWeb.repository;

import com.alfinandika.springBootWeb.model.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long> {
}
