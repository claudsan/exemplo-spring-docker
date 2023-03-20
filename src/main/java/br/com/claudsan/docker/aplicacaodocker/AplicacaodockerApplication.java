package br.com.claudsan.docker.aplicacaodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "br.com.sonda.docker.aplicacaodocker.controller")
public class AplicacaodockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicacaodockerApplication.class, args);
	}

}
