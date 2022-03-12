package com.codigorupestre.junit.eduardocastillo;

public class AdministracionUsuariosImpl implements AdministracionUsuarios {

	@Override
	public boolean crearUsuario(Usuario usuario) {
		System.out.println("Creando usuario " + usuario);
		
		System.out.println("Validar que el usuario no exista");
		
		System.out.println("Registrando usuario en base datos");
		
		System.out.println("Enviar email " + usuario.email + " al usuario de confirmacion");
		
		return true;
	}
	

}
