package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.Fabricante;
import com.example.demo.dao.IFabricateDAO;

@Service
public class IFabricanteServiceImpl implements IFabricateService{

	@Autowired
	IFabricateDAO iFDao;
	
	@Override
	public List<Fabricante> listarFabricantes() {
		return iFDao.findAll();
	}

	@Override
	public Fabricante listarById(Integer id) {
		return iFDao.findById(id).get();
	}

	@Override
	public Fabricante guardarNuevo(Fabricante f) {
		return iFDao.save(f);
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante f) {
		return iFDao.save(f);
	}

	@Override
	public void deleteFabricante(Integer id) {
		iFDao.deleteById(id);
	}

}
