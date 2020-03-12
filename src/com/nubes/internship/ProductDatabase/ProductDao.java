package com.nubes.internship.ProductDatabase;

import java.util.List;

public interface ProductDao {
	Product addProduct(Product product);

	List<Product> showProducts();

	Product deleteProduct(Product product);

	Product updateProduct(Product product);

	Product searchProduct(Product product);

}
