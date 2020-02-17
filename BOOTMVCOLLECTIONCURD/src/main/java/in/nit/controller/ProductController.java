package in.nit.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.Product;

@Controller
@RequestMapping("/product")
public class ProductController {
	private List<Product> list=new ArrayList<>();
	{
		/**
		 * Instance Init Block
		 * executed before constructor only once
		 */
		list.add(new Product(10, "A", 3.3));
		list.add(new Product(11, "B", 4.3));
		list.add(new Product(12, "C", 5.3));
		list.add(new Product(13, "D", 6.3));
	}
	/**
	 * Send List data to UI
	 * and display as HTML table
	 * URL /view - GET
	 * showProducts()- ProductsData
	 */
			@RequestMapping("/view")
	public String showProducts(Model model)
	{
		model.addAttribute("list",list);
		return "ProductData";
	}
	/**
	 * Read ReqParam-eid
	 * remove object from above List
	 * method: removeProduct()
	 * Input: ?eid=Data
	 * URL : /delete - GET
	 *
	 */
	@RequestMapping("/delete")
	public String removeProduct(
			@RequestParam("eid")Integer id
			)
	{
		Iterator<Product> itr=list.iterator();
		while (itr.hasNext()) {
			Product p = itr.next();
			if(p.getProdId()==id) {
				itr.remove();
				break;
			}
		}
		//Resp.sendRedirect(URL)
		//Goto URL :/view
		return "redirect:view";
	}
	/**
	 * Display Product Register page
	 * on enter URL : /register - GET
	 * showRegPage
	 */
	@RequestMapping("/register")
	public String showRegPage() {
		return "ProductRegister";
	}
	/***
	 * Add one method to Read Form Data
	 * @ModelAttribute ClassName objName
	 * send success message to UI(Model)
	 * URL : /save , Type : POST
	 * method : saveProduct
	 */
	@RequestMapping(value = "/save",method=RequestMethod.POST)
	public String saveProduct(
			@ModelAttribute Product product,
			Model model
			)
	{
		list.add(product);
		model.addAttribute("msg", "Successfully added");
		return "ProductRegister";
	}
}

