package Product;

import User.Seller;

public class Product {
	private String productId;
	private String productcost;
	private String productName;
	private String Category;
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	private Seller seller;
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductcost() {
		return productcost;
	}
	public void setProductcost(String productcost) {
		this.productcost = productcost;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
