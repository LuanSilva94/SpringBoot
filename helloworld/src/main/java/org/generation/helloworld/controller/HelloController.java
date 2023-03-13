package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indiga para o spring que essa é uma classe controladora
@RestController

//indica um endpoit para nossa aplicação
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping ("/bsm")
	public String bsm() {
		return "- Persistência<br/>"
				+ "- Mentalidade de Crescimento<br/>"
				+ "- Orientação ao Futuro<br/>"
				+ "- Responsabilidade Pessoal<br/>"
				+ "- Trabalho em Equipe<br/>"
				+ "- Comunicação<br/>"
				+ "- Comunicação Não Violenta<br/>"
				+ "- Atenção para Detalhes<br/>"
				+ "- Proatividade";
	}
	
	@GetMapping ("/objetivo")
	public String objetivo() {
		return "Fazer um reforço em POO.<br/>"
				+"Entregar as tarefas da faculdade, junto as do curso sem atraso<br/>"
				+ "Executar exercício de lógico, para praticar.<br/>"
				+ "Compreender os conceitos de API e como construir e integrar APIs com outras aplicações.<br/>"
				+ "Entender um pouco melhor de banco de dados, pois ainda tenho algumas duvidas.<br/>";			
	}
}