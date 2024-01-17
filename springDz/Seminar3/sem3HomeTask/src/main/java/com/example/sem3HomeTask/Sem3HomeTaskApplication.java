package com.example.sem3HomeTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sem3HomeTaskApplication {

	/**
	 *   Добавляет и сортирует Users, но не видит методы по пути /cal и /filter.
	 *   Не видит пути хотя указываю
	 */

	public static void main(String[] args) {
		SpringApplication.run(Sem3HomeTaskApplication.class, args);
	}

}
