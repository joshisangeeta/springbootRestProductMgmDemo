package com.sj.resttemplate.service;



import java.util.List;

import com.sj.resttemplate.model.Product;

public interface ProductService {
     Product addProduct(Product product);
     Product getProduct(int id);
     List<Product> getAllProducts();


}
