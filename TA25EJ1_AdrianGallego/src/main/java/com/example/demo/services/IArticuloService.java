package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Articulo;
public interface IArticuloService {
	
	//Listar
	public List<Articulo> listarArticulos();
	
	//Listar por id
	public Articulo listarById(Integer id);
	
	//Guardar
	public Articulo guardarNuevo(Articulo a);
	
	//Actualizar
	public Articulo actualizarArticulo(Articulo a);

	//Borrar
	public void eliminarArticulo(Integer id);
}
