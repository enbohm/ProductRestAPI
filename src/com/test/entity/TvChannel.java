package com.test.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.test.entity.api.Discountable;
import com.test.entity.api.Product;

@XmlRootElement
@XmlType(propOrder = { "id", "discount", "attributes", "campaing" })
public class TvChannel implements Discountable, Product {

	private String id;
	private List<Attribute> attributes = new ArrayList<Attribute>();
	private Integer discount = Integer.valueOf(42);
	private Campaign campaing;

	public TvChannel() {
	}

	public TvChannel(String id) {
		this.id = id;
	}

	public TvChannel(String id, List<Attribute> attributes, Campaign campaing) {
		this.id = id;
		this.attributes = attributes;
		this.campaing = campaing;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name = "productDiscount")
	public Integer getDiscount() {
		return discount;
	}

	@XmlElement(name = "attributes")
	public List<Attribute> getAttributes() {
		return this.attributes;
	}

	public Campaign getCampaing() {
		return campaing;
	}

	public void setCampaing(Campaign campaing) {
		this.campaing = campaing;
	}
}