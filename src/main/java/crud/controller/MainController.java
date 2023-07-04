package crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import crud.dao.ProductDao;
import crud.model.Product;
import crud.service.ProductService;

@Controller
public class MainController {
	
	@Autowired
	private ProductService productService;
	
    @Autowired
    private ProductDao productDao;
	

	@RequestMapping("/")
	public String home(Model m) {

		return "addProduct";
	}

	@RequestMapping(value = "/addproduct", method = RequestMethod.POST)
	public String addData(Model m, Product prodct) {

		System.out.println(prodct);
		int i = productDao.createProduct(prodct);
		return "redirect:/viewemp";
	}

	@RequestMapping("/viewemp")
	public String viewemp(Model m) {
		List<Product> list = productDao.getProducts();

		System.out.println("list dfdfhd" + list);
		m.addAttribute("Product", list);
		return "index";
	}


	@RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable(value = "id") int id, Model m) {
		System.out.println("delete ID" + id);
		productDao.deleteProduct(id);
		return "redirect:/viewemp";

	}

	
	  @RequestMapping(value = "/editProduct/{id}", method = RequestMethod.GET)
	  public String edit(@PathVariable int id, Model m) {
	  System.out.println("edit comimg the page&&&&&&&&&&&&&&&&&&&" + id);
	  
	  Product list = productDao.editProduct(id);
	  System.out.println("id is coming from databases;" + list);
	  m.addAttribute("listbyid", list);
	  
	  return "edit";
	  
}
	 

	

  @RequestMapping(value = "/updateProduct", method = RequestMethod.GET) 
  public String updateProduct(Model m, Product prodct) {
  productService.updateProduct(prodct);
  
  System.out.println("data is uapadted recrd coming ************" + prodct);
  System.out.println("data has been updated*************************"); 
  
  return "redirect:/viewemp";
  
  
  }
 
	 
	 

	@RequestMapping("/back")
	public String back(Model m) {
		return "addProduct";
	}
	
	
	  @RequestMapping(value = "/search", method = RequestMethod.GET)
	  public String searchPage(Model m) {
		  
	    return "search";
	    
	  }

	  @RequestMapping(value = "/searchbyid", method = RequestMethod.GET)
	  public String searchById(@RequestParam(value = "id")int id,Model m) {
		  Product searchbyid = productDao.searchbyid(id);
		  m.addAttribute("searchbyid", searchbyid);
	      System.out.println("hello....."+id);
	  
	  return "search";
	  
	  
	  }
		 
	
	 

	}



