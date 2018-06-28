package com.sixliu.credit.product.dao;

import java.util.List;

import com.sixliu.credit.product.entity.ProductType;

/**
*@author:MG01867
*@date:2018年6月15日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public interface ProductTypeDao {

	ProductType getById(String id);
	
	List<ProductType> listAll();
	
	int insert(ProductType productType);
}
