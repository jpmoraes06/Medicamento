package com.test.medicamento.entiti;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.test.entiti.Medicamento;

class MedicamentoTest {
	
	private Medicamento medicamento;
	
	@BeforeEach
	void setUp() {
		//Arrange
		medicamento = new Medicamento(1l,"Joao Paulo","Texto","20/05");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		medicamento.setId(2l);
		//Assert
		assertEquals(2L,medicamento.getId());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		medicamento.setNome("rivotril");
		assertEquals("rivotril", medicamento.getNome());
    
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo bula")
	void testEmail() {
		medicamento.setBula("Texto");
		assertEquals("Texto", medicamento.getBula());
    
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo data")
	void testTelefone() {
		medicamento.setDataValidade("20/05");
		assertEquals("20/05", medicamento.getDataValidade());
    
	}
	
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testContructorAll() {
		Medicamento novoMedicamento = new Medicamento(3L, "Matheus","text","10/09");
		assertAll("novoHospede",
				()-> assertEquals(3L, novoMedicamento.getId()),
		        ()-> assertEquals("Matheus", novoMedicamento.getNome()),
		        ()-> assertEquals("text", novoMedicamento.getBula()),
		        ()-> assertEquals("10/09", novoMedicamento.getDataValidade())
		        
			);
		        
	}
};
	
	

