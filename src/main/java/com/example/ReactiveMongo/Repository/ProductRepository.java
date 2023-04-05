package com.example.ReactiveMongo.Repository;

import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.example.ReactiveMongo.Entity.Product;
import com.example.ReactiveMongo.Model.ProductDto;

import reactor.core.publisher.Flux;
 

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String >{

	Flux<ProductDto> findByPriceBetween(Range<Double> priceRange);

	
}
