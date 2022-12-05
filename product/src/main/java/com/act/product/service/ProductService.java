package com.act.product.service;

import com.act.product.model.Product;
import com.act.product.model.dto.ProductDto;


import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product addProduct(Product product);
    Optional<Product> getProduct(Long id);
    List<Product> getAllProduct();
    Product updateProduct(Long id , Product product);
    void deleteProduct(Long id);
}
