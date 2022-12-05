package com.act.product.service.impl;

import com.act.core.EntityDtoMapper.EntityDtoMapper;
import com.act.product.model.Product;
import com.act.product.repo.ProductRepo;
import com.act.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;
    private EntityDtoMapper mapper;

    @Override
    public Product addProduct(Product product) {

        return   productRepo.save(product);
    }

    @Override
    public Optional<Product> getProduct(Long id) {
        Optional<Product> product = productRepo.findById(id);
        return product;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList = productRepo.findAll();
        return productList;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
