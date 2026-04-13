package br.com.ciudad.spring_boot_essentials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class,
		SecurityAutoConfiguration.class
})
public class SpringBootEssentialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEssentialsApplication.class, args);
	}

}