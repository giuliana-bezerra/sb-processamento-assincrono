package br.com.giulianabezerra.sbprocessamentoassincrono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbProcessamentoAssincronoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbProcessamentoAssincronoApplication.class, args);
		context.close();
	}

}
