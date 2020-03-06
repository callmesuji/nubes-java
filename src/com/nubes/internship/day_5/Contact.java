package com.nubes.internship.day_5;

public class Contact {

	private Integer cid;
	private String name;
	private String mobile;
	private String city;

	public Contact(String name, String mobile, String city) {
		if (this.cid == null) {
			this.cid = IDGenerator.getNewId();
		}
		
		this.name = name;
		this.mobile = mobile;
		this.city = city;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", name=" + name + ", mobile=" + mobile + ", city=" + city + "]";
	}

}
