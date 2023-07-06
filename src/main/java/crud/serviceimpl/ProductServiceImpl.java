package crud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



 

import crud.dao.ProductDao;
import crud.model.Product;
import crud.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
private ProductDao productdao;
	public void deleteProduct(int id) {
		this.productdao.deleteProduct(id);
		
	}
	public void updateProduct(Product prodct) {	
	this.productdao.updateProduct(prodct);
	}
	public int createProduct(Product product) {
		// TODO Auto-generated method stub
		return this.productdao.createProduct(product);
	}
	public Product searchbyid(int id) {
		// TODO Auto-generated method stub
		return this.productdao.searchbyid(id);
	}
}
