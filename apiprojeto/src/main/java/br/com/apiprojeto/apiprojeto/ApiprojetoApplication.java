package br.com.apiprojeto.apiprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ApiprojetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiprojetoApplication.class, args);
	}

}
