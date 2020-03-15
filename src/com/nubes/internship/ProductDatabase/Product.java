package com.nubes.internship.ProductDatabase;

public class Product {
	private Integer pid;
	private String pname;
	private Double price;
	private Double discount;

	public Product() {
	}

	public Product(Integer pid, String pname, Double price, Double discount) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", discount=" + discount + "]";
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

}
