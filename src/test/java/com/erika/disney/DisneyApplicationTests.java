package com.erika.disney;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.erika.disney.models.usuario_m;
import com.erika.disney.repositories.usuario_r;

@SpringBootTest
class DisneyApplicationTests {
	@Autowired
	private usuario_r user_r;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	public void crearUsuarioTest() {
		usuario_m usuario = new usuario_m();
		//usuario.setId(1);
		usuario.setName("admim");
		usuario.setPassword(encoder.encode("admin*"));
		usuario_m retorno = user_r.save(usuario);

		assertTrue(retorno.getPassword().equals(usuario.getPassword()));
	}

}
