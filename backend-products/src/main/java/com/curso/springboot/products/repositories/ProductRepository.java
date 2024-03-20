package com.curso.springboot.products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.curso.springboot.products.entities.Product;
//aqui se declara la conexion para con angular
@CrossOrigin(origins = { "http://localhost:4200"})
@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository<Product, Long> {

}
