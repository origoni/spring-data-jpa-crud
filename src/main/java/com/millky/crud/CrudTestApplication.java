package com.millky.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.orm.jpa.EntityScan;
//import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

//@EntityScan(basePackageClasses = { CrudTestApplication.class, Jsr310JpaConverters.class })
@SpringBootApplication
public class CrudTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudTestApplication.class, args);
	}
}
