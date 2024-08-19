package Order;

import Product.Product;

public class Cart {
	private String cartId;

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	private Product[] listofproduct;

	public Product[] getListofproduct() {
		return listofproduct;
	}

	public void setListofproduct(Product[] listofproduct) {
		this.listofproduct = listofproduct;
	}
	public Boolean checkOut() {
		return true;
		
	}

}
