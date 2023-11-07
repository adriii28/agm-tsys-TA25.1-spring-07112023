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

import com.example.demo.dto.Fabricante;
import com.example.demo.services.IFabricateService;

@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	IFabricateService iFSer;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return iFSer.listarFabricantes();
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante listarFabricanteById(@PathVariable(name="id") Integer id) {
		return iFSer.listarById(id);
	}
	
	@PostMapping("/fabricantes")
	public Fabricante guardarNuevo(@RequestBody Fabricante f) {
		return iFSer.guardarNuevo(f);
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="id") Integer id, @RequestBody Fabricante f) {
		Fabricante f1 = iFSer.listarById(id);
		Fabricante f2 = new Fabricante();
		
		f1.setCodigo(f.getCodigo());
		f1.setNombre(f.getNombre());
		
		f2 = iFSer.actualizarFabricante(f1);
		return f2;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void deleteFabricante(@PathVariable(name="id") Integer id) {
		iFSer.deleteFabricante(id);
	}
}
