package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductsDao;
import com.example.demo.domain.Products;

@Service("productsService")
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired
	public ProductsDao dao;
	
	@Override
	public List<Products> getAllProducts(){
		return dao.findAll();
	}

}
