package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data


public class Movie {

	private Integer movieId;

	private String movieName;
	private Genre genre;
	private Boolean isAvailable;
	
	

}