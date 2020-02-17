package in.nit.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.Product;
import in.nit.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private IProductService service;
	@RequestMapping("/all")
	public String showPage(Model model) {
		List<Product> list=service.getAllProducts();
		model.addAttribute("list",list);
		return "ProductData";
	}
	@RequestMapping("/delete/{id}")
	public String daleteData(@PathVariable("id")Integer id,Model model) {
		service.deleteProducts(id);
		List<Product> list=service.getAllProducts();
		model.addAttribute("list",list);
		model.addAttribute("msg","one row deleted");
		return "redirect:../all";
		
	}
	@RequestMapping("/view/{id}")
  public String getOneProduct(@PathVariable("id")Integer id,Model model) {
	Optional<Product> opt=service.getOneProduct(id);
	if(opt.isPresent()) {
		model.addAttribute("ob",opt.get());
	}else {
		model.addAttribute("msg","no data found");
	}
	  return "ProductOne";
	  
  }
}
