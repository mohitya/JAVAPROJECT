package in.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
