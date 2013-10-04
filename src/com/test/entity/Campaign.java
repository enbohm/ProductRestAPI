package com.test.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Campaign {

	private String discount;
	private String type;

	public Campaign() {
	}

	public Campaign(String discount, String type) {
		this.discount = discount;
		this.type = type;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
