package crud.service;
import crud.model.Product;

public interface ProductService {
	public int createProduct(Product product);
	public Product searchbyid(int id);
	public void updateProduct(Product prodct);
	public void deleteProduct(int id);
	
	

}
