package in.nit.service;

import java.util.List;
import java.util.Optional;

import in.nit.model.Product;

public interface IProductService {
List<Product> getAllProducts();
void deleteProducts(Integer id);
 Optional<Product> getOneProduct(Integer id);
}
