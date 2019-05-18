package br.com.colibri.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "br.com.colibri","br.com.colibri.controllers","br.com.colibri.repositories","br.com.colibri.models"})
@ComponentScan({"br.com.colibri","br.com.colibri.controllers","br.com.colibri.repositories","br.com.colibri.models"})
@Import({SecurityConfigurations.class})
@EntityScan("br.com.colibri.models")
@EnableJpaRepositories("br.com.colibri.repositories")
public class Configuracao{
	
	
	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}
}
