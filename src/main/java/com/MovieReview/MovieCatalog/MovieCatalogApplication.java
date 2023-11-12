package com.MovieReview.MovieCatalog;

import com.MovieReview.MovieCatalog.Service.CsvReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class MovieCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogApplication.class, args);
		CsvReader a = new CsvReader();
		a.hello();
	}


}
