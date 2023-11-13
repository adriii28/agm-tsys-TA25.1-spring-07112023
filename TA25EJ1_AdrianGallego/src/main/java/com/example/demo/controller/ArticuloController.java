package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Articulo;
import com.example.demo.services.IArticuloService;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	
	@Autowired
	IArticuloService iASer;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return iASer.listarArticulos();
	}
	
	@GetMapping("/articulos/{id}")
	public Articulo listarArticuloById(@PathVariable(name="id") Integer id) {
		return iASer.listarById(id);
	}
	
	@PostMapping("/articulos")
	public Articulo guardarArticulo(@RequestBody Articulo a) {
		return iASer.guardarNuevo(a);
	}
	
	@PutMapping("/articulos/{id}")
	public Articulo actualizarArticulo(@PathVariable(name="id") Integer id, @RequestBody Articulo a) {
		Articulo a1 = iASer.listarById(id);
		Articulo a2 = new Articulo();
		
		a1.setCodigo(a.getCodigo());
		a1.setNombre(a.getNombre());
		a1.setPrecio(a.getPrecio());
		a1.setF(a.getF());
		
		a2 = iASer.actualizarArticulo(a1);
		return a2;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void deleteArticulo(@PathVariable(name="id") Integer id) {
		iASer.eliminarArticulo(id);
	}

}
