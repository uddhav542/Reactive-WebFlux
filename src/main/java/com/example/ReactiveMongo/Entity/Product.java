package com.example.ReactiveMongo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Document(collection = "products")
public class Product {
	@Id
	private String id;
	private String name;
	private int qty;
	private double price;
	
}
