package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Fabricante;

public interface IFabricateDAO extends JpaRepository<Fabricante, Integer>{

}
