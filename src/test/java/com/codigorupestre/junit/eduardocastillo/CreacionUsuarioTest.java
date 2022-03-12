package com.codigorupestre.junit.eduardocastillo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CreacionUsuarioTest {
	
	AdministracionUsuarios administracionUsuarios;
	
	
	@Test
	public void crearUsuarioTest() {
		administracionUsuarios = new AdministracionUsuariosImpl();
		
		Usuario usuario = new Usuario();
		usuario.nombre = "Eduardo";
		usuario.apellidos = "Castillo Mendoza";
		usuario.telefono = "55443344665";
		usuario.email = "ecastillo@cocinaonline.org";
		
		boolean usuarioCreado = administracionUsuarios.crearUsuario(usuario);
		
		assertTrue(usuarioCreado);
	}
	
	
	public void validarCreacionUsuario() {
		
		
	}

}
