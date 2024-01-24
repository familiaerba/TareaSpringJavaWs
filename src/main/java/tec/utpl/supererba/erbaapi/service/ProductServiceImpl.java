package tec.utpl.supererba.erbaapi.service;

import lombok.RequiredArgsConstructor;
import tec.utpl.supererba.erbaapi.entity.Product;
import tec.utpl.supererba.erbaapi.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product deleteProduct(Long id) {
        Product productDB = getProduct(id);

        if (null == productDB){
            return null;
        }

        productRepository.delete(productDB);
        return productDB;
    }

    @Override
    public Product updateStock(Long id, Double quantity) {
        Product productDB = getProduct(id);

        if (null == productDB){
            return null;
        }
        Double stock = productDB.getStock() + quantity;
        productDB.setStock(stock);
        return productRepository.save(productDB);
    }
}
