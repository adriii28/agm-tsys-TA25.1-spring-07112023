package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Fabricante;

public interface IFabricateService {

	//Listar
	public List<Fabricante> listarFabricantes();
	
	//Listar por id
	public Fabricante listarById(Integer id);
	
	//Guardar nuevo
	public Fabricante guardarNuevo(Fabricante f);
	
	//Actualizar
	public Fabricante actualizarFabricante(Fabricante f);

	//Borrar
	public void deleteFabricante(Integer id);
}
