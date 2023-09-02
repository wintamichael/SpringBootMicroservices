package com.programmingtechie.productservice.service;

import com.programmingtechie.productservice.dto.ProductRequest;
import com.programmingtechie.productservice.model.Product;
import com.programmingtechie.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;
    public void createProduct(ProductRequest productRequest){
        Product product=Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getName())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
        log.info("product {} is saved", product.getId());

    }
}
