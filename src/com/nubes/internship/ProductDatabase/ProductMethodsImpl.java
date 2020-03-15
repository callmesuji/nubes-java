package com.nubes.internship.ProductDatabase;

import java.util.List;
import java.util.Scanner;

public class ProductMethodsImpl implements ProductMethods {
	Scanner sc = new Scanner(System.in);
	ProductDao productdao = new ProductDaoImpl();
	IDGenerator idgen = new IDGenerator();

	@Override
	public void addProducts() {
		System.out.println("ENTER PRODUCT NAME");
		String pname = sc.nextLine();
		System.out.println("ENTER PRODUCT PRICE");
		Double price = sc.nextDouble();
		System.out.println("ENTER PRODUCT DISCOUNT");
		Double discount = sc.nextDouble();
		sc.nextLine();
		Integer id = idgen.getnewid();
		Product product = new Product(id, pname, price, discount);
		productdao.addProduct(product);

	}

	@Override
	public List<Product> showProducts() {
		List<Product> list = productdao.showProducts();
		if (list.isEmpty()) {
			System.out.println("NO PRODUCTS TO SHOW PLEASE ADD PRODUCTS");
		} else {
			System.out.println("<<=----**----=>> YOU CHOOSE TO VIEW PRODUCTS! <<=----**----=>>");
			System.out.println(" " + " ID      " + "    NAME        " + "     PRICE    " + "      DISCOUNT   ");
			System.out.println("------------------------------------------------------------------");

			for (Product pro : list) {
				System.out.println(" " + pro.getPid() + "	   ||   " + pro.getPname().toUpperCase() + "	  ||	"
						+ pro.getPrice() + "	  ||   " + pro.getDiscount());
			}
		}
		return null;
	}

	@Override
	public void deleteProducts(int pid) {
		productdao.deleteProduct(pid);
	}

	@Override
	public void updateProducts(int pid) {
		if (productdao.checkproduct(pid)) {
			System.out.println("ENTER NEW PRODUCT NAME ");
			String pname = sc.nextLine();
			System.out.println("ENTER PRODUCT PRICE ");
			Double price = sc.nextDouble();
			System.out.println("ENTER PRODUCT DISCOUNT ");
			Double discount = sc.nextDouble();
			System.out.println("UPDATED SUCCESSFULLY");
			Product u_product = new Product(pid, pname, price, discount);
			productdao.updateProduct(u_product);
		} else {
			System.out.println("Enter Valid ID Input");
		}

	}

	@Override
	public List<Product> searchProducts(int pid) {
		List<Product> list = productdao.searchProduct(pid);
		if (productdao.checkproduct(pid)) {
			productdao.searchProduct(pid);
			if (list.isEmpty()) {
				System.out.println("NO PRODUCTS TO DISPLAY!");
			} else {
				System.out.println("<<=----**----=>> YOU CHOOSE TO SEARCH PRODUCTS! <<=----**----=>>");
				System.out.println(" " + " ID      " + "    NAME        " + "     PRICE    " + "      DISCOUNT   ");
				System.out.println("------------------------------------------------------------------");

				for (Product product : list) {
					System.out.println(" " + product.getPid() + "	   ||   " + product.getPname().toUpperCase()
							+ "	  ||	" + product.getPrice() + "	  ||   " + product.getDiscount());
				}
			}
		} else {
			System.out.println("Enter Vaid ID");
		}
		return null;
	}

}
