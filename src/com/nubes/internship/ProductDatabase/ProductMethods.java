package com.nubes.internship.ProductDatabase;

import java.util.List;

public interface ProductMethods {
	void addProducts();

	void showProducts();

	void deleteProducts(int pid);

	void updateProducts(int pid);

	List<Product> searchProducts(int pid);

}
