package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticuloDAO;
import com.example.demo.dto.Articulo;

@Service
public class IArticuloServiceImpl implements IArticuloService{

	@Autowired
	IArticuloDAO dao;
	
	@Override
	public List<Articulo> listarArticulos() {
		return dao.findAll();
	}

	@Override
	public Articulo listarById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public Articulo guardarNuevo(Articulo a) {
		return dao.save(a);
	}

	@Override
	public Articulo actualizarArticulo(Articulo a) {
		return dao.save(a);
	}

	@Override
	public void eliminarArticulo(Integer id) {
		dao.deleteById(id);
	}

}
