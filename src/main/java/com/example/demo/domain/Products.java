package com.example.demo.domain;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private Long productId;
	
	@Column(name="product_name", nullable = false, length = 100)
	private String productName;
	
	@Column(name="brand", nullable = false)
    private String brand;

    @Column(name="sku_code", nullable = false, unique = true)
    private String skuCode;

    @Column(name="price",nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name="quantity",nullable = false)
    private Integer quantity;

    @Column(name="description",length = 500)
    private String description;

    @Column(name="available",nullable = false)
    private Boolean available;
    
    public Products() {
    	
    }

	public Products(Long productId, String productName, String brand, String skuCode, BigDecimal price,
			Integer quantity, String description, Boolean available) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.skuCode = skuCode;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.available = available;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", brand=" + brand + ", skuCode="
				+ skuCode + ", price=" + price + ", quantity=" + quantity + ", description=" + description
				+ ", available=" + available + "]";
	}
}
