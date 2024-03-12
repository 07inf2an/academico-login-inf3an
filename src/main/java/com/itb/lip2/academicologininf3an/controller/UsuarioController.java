package com.itb.lip2.academicologininf3an.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itb.lip2.academicologininf3an.model.Usuario;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
	
	@GetMapping("/users")
	public List<Usuario> getUser() {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		Usuario us1 = new Usuario();
		us1.setId(1l);
		us1.setNome("Enzo Basile");
		us1.setEmail("enzo@gmail.com");
		
		Usuario us2 = new Usuario();
		us2.setId(2l);
		us2.setNome("Kauã Crispim");
		us2.setEmail("kaua@gmail.com");
		
		Usuario us3 = new Usuario();
		us3.setId(3l);
		us3.setNome("Idelsio Junitio");
		us3.setEmail("junito@gmail.com");
		
		usuarios.add(us3);
		usuarios.add(us2);
		usuarios.add(us1);
		
		return usuarios;
	}

}
