package com.nubes.internship.ProductDatabase;

import java.util.List;

public interface ProductDao {
	Product addProduct(Product product);

	List<Product> showProducts();

	Product deleteProduct(Integer pid);

	Product updateProduct(Product product);

	List<Product> searchProduct(Integer pid);

	boolean checkproduct(Integer id);

	int getcount();

}
