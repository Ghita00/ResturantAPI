package com.example.demo;

import com.example.demo.Table.UserTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //managment the request
@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	//return a get request, only one for mapping
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/greeting")
	public List<UserTable> hello(){
		return List.of(
				new UserTable(1, "marco", "rossi", null),
				new UserTable(2, "luca", "verdi", null),
				new UserTable(3, "luisa", "bianchi", null)
		);
	}

}
