package com.example.ReactiveMongo.Utils;

import org.springframework.beans.BeanUtils;

import com.example.ReactiveMongo.Entity.Product;
import com.example.ReactiveMongo.Model.ProductDto;

public class AppUtils {

	public static ProductDto entityToDto(Product product) {
		ProductDto productDto = new ProductDto();
		BeanUtils.copyProperties(product, productDto);
		return productDto;
	}
	
	public static Product dtoToEntity(ProductDto productDto) {
		Product product = new Product();
		BeanUtils.copyProperties(productDto, product);
		return product;
	}
}
