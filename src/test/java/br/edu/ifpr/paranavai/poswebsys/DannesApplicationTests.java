package br.edu.ifpr.paranavai.poswebsys;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import br.com.dannes.cadastro.dannes.PopulacaoInicialBanco;

@SpringBootTest
class DannesApplicationTests {
	
	@MockBean
	PopulacaoInicialBanco populacaoInicialBanco;

	@Test
	void contextLoads() {
	}

}
