package com.nubes.internship.ProductDatabase;

public class IDGenerator {
	ProductDaoImpl productdaoimpl = new ProductDaoImpl();
	public  Integer id = 1000;
	public Integer getnewid() {
		int c = productdaoimpl.getcount();
		if (c == 0) {
			return id + 1;
		} else {
			return id + c + 1;
		}
	}

}
