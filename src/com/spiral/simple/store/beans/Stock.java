/**
 * 
 */
package com.spiral.simple.store.beans;

import java.util.Date;

/**
 * @author Esaie MUHASA
 *
 */
public class Stock extends DBEntity {

	private static final long serialVersionUID = -2582753576092604646L;
	
	private Product product;
	private double quantity;
	private double buyingPrice;
	private String salesUnit;
	private double defaultUnitPrice;
	private Date date;
	private Date manufacturingDate;
	private Date expiryDate;
	private String description;

	/**
	 * 
	 */
	public Stock() {
		super();
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the quantity
	 */
	public double getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the buyingPrice
	 */
	public double getBuyingPrice() {
		return buyingPrice;
	}

	/**
	 * @param buyingPrice the buyingPrice to set
	 */
	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	/**
	 * @return the salesUnit
	 */
	public String getSalesUnit() {
		return salesUnit;
	}

	/**
	 * @param salesUnit the salesUnit to set
	 */
	public void setSalesUnit(String salesUnit) {
		this.salesUnit = salesUnit;
	}

	/**
	 * @return the defaultUnitPrice
	 */
	public double getDefaultUnitPrice() {
		return defaultUnitPrice;
	}

	/**
	 * @param defaultUnitPrice the defaultUnitPrice to set
	 */
	public void setDefaultUnitPrice(double defaultUnitPrice) {
		this.defaultUnitPrice = defaultUnitPrice;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void initDate (long date) {
		this.date = buildDate(date);
	}

	/**
	 * @return the manufacturingDate
	 */
	public Date getManufacturingDate() {
		return manufacturingDate;
	}
	
	public void initManufacturingDate (long date) {
		manufacturingDate = buildDate(date);
	}

	/**
	 * @param manufacturingDate the manufacturingDate to set
	 */
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	/**
	 * @return the expiryDate
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public void initExpiryDate (long date) {
		expiryDate = buildDate(date);
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
