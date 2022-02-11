package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Springjdbctemplete2postgreSqlApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbctemplate; 
	
	public static void main(String[] args) {
		SpringApplication.run(Springjdbctemplete2postgreSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO student (name,email) VALUES("+" 'pavan', 'sai@gmail.com')";
				
	    int rows = jdbctemplate.update(sql);
	    if (rows > 0) {
	    	System.out.println ("A new row has been inserted.");
	    }
	}

}
