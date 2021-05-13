package br.senai.sp.jandira.viagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder; - descomentar para rodar em container
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; - descomentar para rodar em container

// rodar em arquivo jar
@SpringBootApplication
public class ViagemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViagemApplication.class, args);
	}

}


// pra rodar em container
//@SpringBootApplication
//public class ViagemApplication extends SpringBootServletInitializer {
//
//	public static void main(String[] args) {
//		SpringApplication.run(ViagemApplication.class, args);
//	}
//	
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(ViagemApplication.class);
//	}
//
//}
