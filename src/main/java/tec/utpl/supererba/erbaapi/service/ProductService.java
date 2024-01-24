package tec.utpl.supererba.erbaapi.service;

import java.util.List;

import tec.utpl.supererba.erbaapi.entity.Product;

public interface ProductService {

    public List<Product> listAllProducts();
    public Product getProduct(Long id);
    public Product createProduct(Product product);
    public Product deleteProduct(Long id);
    public Product updateStock(Long id, Double quantity);
    
}
