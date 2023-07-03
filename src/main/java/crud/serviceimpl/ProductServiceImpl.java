package crud.serviceimpl;

import crud.dao.ProductDao;
import crud.service.ProductService;

public class ProductServiceImpl implements ProductService {

	private ProductDao productdao;

	@Override
	public String editProduct(int id) {
		this.productdao.editProduct(id);
		return "edit";
	}

}
