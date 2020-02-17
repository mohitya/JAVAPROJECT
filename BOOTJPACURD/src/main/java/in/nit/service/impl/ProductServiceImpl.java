package in.nit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.model.Product;
import in.nit.repository.ProductRepository;
import in.nit.service.IProductService;
@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	private ProductRepository repo;

	public List<Product> getAllProducts() {
		
		return repo.findAll();
	}

	public void deleteProducts(Integer id) {
		repo.deleteById(id);
	}

	public Optional<Product> getOneProduct(Integer id) {
		
		return repo.findById(id);
	}

}
