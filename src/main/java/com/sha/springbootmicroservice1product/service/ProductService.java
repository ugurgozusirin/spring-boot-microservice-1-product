package com.sha.springbootmicroservice1product.service;

import com.sha.springbootmicroservice1product.model.Product;
import com.sha.springbootmicroservice1product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

    public Product saveProduct(Product product){
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }
    public void deleteProduct(Long productId){
        productRepository.deleteById(productId);
    }
    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

}
