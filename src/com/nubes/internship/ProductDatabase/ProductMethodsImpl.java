package com.nubes.internship.ProductDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMethodsImpl implements ProductMethods {
	Scanner sc = new Scanner(System.in);
	ProductDao p = new ProductDaoImpl();

	@Override
	public void addProducts() {
		System.out.println("ENTER PRODUCT NAME");
		String pname = sc.nextLine();
		System.out.println("ENTER PRODUCT PRICE");
		Double price = sc.nextDouble();
		System.out.println("ENTER PRODUCT DISCOUNT");
		Double discount = sc.nextDouble();
		Product product = new Product(pname, price, discount);
		p.addProduct(product);

	}

	@Override
	public void showProducts() {
		p.showProducts();
	}

	@Override
	public void deleteProducts(int pid) {
		List<Product> ps = new ArrayList<>();
		for (Product P : ps) {
			if (P.getPid().equals(pid)) {
				p.deleteProduct(P);
			}
		}
//		Product product = new Product();

	}

	@Override
	public void updateProducts(int pid) {
		List<Product> ps = new ArrayList<>();
		for (Product uproduct : ps) {
			if (uproduct.getPid().equals(pid)) {
				System.out.println("ENTER NEW PRODUCT NAME ");
				String pname = sc.nextLine();
				System.out.println("ENTER PRODUCT ID ");
				Double price = sc.nextDouble();
				System.out.println("ENTER PRODUCT DISCOUNT ");
				Double discount = sc.nextDouble();
				Product u_product = new Product(pname, price, discount);
				p.updateProduct(u_product);
			}
		}

	}

	@Override
	public List<Product> searchProducts(int pid) {
		List<Product> list = new ArrayList<>();
		for (Product pro : list) {
			if (pro.getPid().equals(pid)) {
				p.searchProduct(pro);
			}
		}
		return null;
	}

}
