package vn.iotstar.model;

import java.util.Date;

public class productModel {
	private int productId;
	private String productName;
	private long productCode;
	private int categoryId;
	private String description;
	private double price;
	private int amount;
	private int stock;
	private String image;
	private int wishlist;
	private int status;
	private Date createDate;
	private int sellerId;
	private CategoryModel category;
	public productModel(int productId, String productName, long productCode, int categoryId, String description,
			double price, int amount, int stock, String image, int wishlist, int status,Date createdate, int sellerId,
			CategoryModel category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCode = productCode;
		this.categoryId = categoryId;
		this.description = description;
		this.price = price;
		this.amount = amount;
		this.stock = stock;
		this.image = image;
		this.wishlist = wishlist;
		this.status = status;
		this.createDate=createdate;
		this.sellerId = sellerId;
		this.category = category;
	}
	public productModel() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getProductCode() {
		return productCode;
	}
	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getWishlist() {
		return wishlist;
	}
	public void setWishlist(int wishlist) {
		this.wishlist = wishlist;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public CategoryModel getCategory() {
		return category;
	}
	public void setCategory(CategoryModel category) {
		this.category = category;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
