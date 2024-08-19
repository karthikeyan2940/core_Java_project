package Order;

import User.Customer;

public class Order {
	Order order1=new Order();
	
	
	
	private String orderId;
	private Customer user;
	public Customer getUser() {
		
		return user;
	}
	public void setUser(Customer user) {
		this.user = user;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


}
