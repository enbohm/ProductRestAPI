package com.test.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;

import com.test.entity.Attribute;
import com.test.entity.Campaign;
import com.test.entity.TvChannel;

@Stateless
public class ProductService {

	public List<TvChannel> getAllTvChannels() {
		List<TvChannel> result = new ArrayList<>();
		result.add(new TvChannel("tcm:42000"));
		result.add(createTvChannel("tcm:4400"));
		return result;
	}

	public TvChannel getProductWithId(String id) {
		return createTvChannel(id);
	}

	private TvChannel createTvChannel(String id) {
		return new TvChannel(id, Arrays.asList(new Attribute("HD", "true"),
				new Attribute("24/7", "false")), new Campaign("0 kr", "Free first year"));
	}
}