package com.example.ReactiveMongo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class ProductDto {
	private String id;
	private String name;
	private int qty;
	private double price;
	
}
