
package crud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import crud.model.Product;

@Component
public class ProductDao {

	private static final String Product = null;
	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create

	@Transactional
	public int createProduct(Product product) {

		return (Integer) this.hibernateTemplate.save(product);

	}

	// getAll Products
	
	public List<Product> getProducts() {
		
		
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);

		return products;
	}

	// Delete single product

	@Transactional
	public void deleteProduct(int id) {
		Product p = this.hibernateTemplate.load(Product.class, id);

		this.hibernateTemplate.delete(p);
	}

	public Product editProduct(int id) {

		Product e = (Product) hibernateTemplate.get(Product.class, id);
		return e;

	}

	@Transactional
	public void updateProduct(Product prodct) {
		System.out.println("print tha page " + prodct);

		this.hibernateTemplate.update(prodct);

	}

	public crud.model.Product searchbyid(int id) {
		
		Product e = (Product) hibernateTemplate.get(Product.class, id);
		System.out.println("Search DAO......."+id);
		return e;
	}

}
