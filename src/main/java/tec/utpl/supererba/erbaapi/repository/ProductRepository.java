package tec.utpl.supererba.erbaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tec.utpl.supererba.erbaapi.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
