package Ecommerce;

import java.util.Scanner;

import Product.Catalog;

import Order.Cart;
import Product.Product;
import User.Customer;

public class Store {
	public static void main(String[] args) {
		System.out.println("Welcome to the Ecomerce store");
		System.out.println("which user are you ? 1.Customer 2.Seller 3.Admin ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String typeofuser;
		if (choice == 1) {
			typeofuser = "Customer";
			Customer current = new Customer();
			System.out.println("What is your userId?");
			sc.nextLine();
			current.setUserId(sc.nextLine());
			System.out.println("Whai is your Password?");
			sc.nextLine();
			current.setPassword(sc.nextLine());
			if (current.Verify() == true) {
				System.out.println("User Verified");

				while (true) {

					System.out.println("Do you want to 1.View Product 2.View Cart 3.Contact Us 4.Exit");
					choice = sc.nextInt();
			//		System.out.println(sc.nextInt());
					if (choice == 1) {
					//	System.out.println(choice);
						Catalog catalog = new Catalog();
						Product[] allproducts = catalog.getListofAllProducts();
						for (int i = 0; i < allproducts.length; i++) {
							System.out.println(allproducts[i].getProductId() + " " + allproducts[i].getProductName()
									+ " " + allproducts[i].getProductcost());

						}

						System.out.println("Do you want any products to the cart? y/n");
						sc.nextLine();
						String addtocart = sc.nextLine();
						if (addtocart.equals("y")) {
							System.out.println("Input the productId that you want to add to cart ");
							String productId = sc.nextLine();
							Product[] cartProducts = new Product[1];
							for (int i = 0; i < allproducts.length; i++) {
								if (allproducts[i].getProductId().equals(productId))
									cartProducts[0] = allproducts[i];

							}
							Cart cart = new Cart();
							cart.setCartId("1");
							cart.setListofproduct(cartProducts);
							System.out.println(cartProducts[0].getProductName());
							current.setCart(cart);
							System.out.println("The Product is successfully added to the cart");
						}
					} else if (choice == 2) {
						Product[] cartProducts = current.getCart().getListofproduct();
						// System.out.println(current.getCart().getListofproduct());
						System.out.println(current.getCart().getCartId());
						for (int i = 0; i < cartProducts.length; i++) {
							// System.out.println(i);

							System.out.println(cartProducts[i].getProductId() + " " + cartProducts[i].getProductName()
									+ " " + cartProducts[i].getProductcost());
						}
						System.out.println("If you want to Checkout? Y/N");
						sc.nextLine();
						String Checkout = sc.nextLine();
						if (Checkout.equals("y"))
							if (current.getCart().checkOut())

								System.out.println("Your Order is placed Successfully.");
					} else if (choice == 3) {
						System.out.println("To Contact us ,please email on Store@ecommerce.com . ");

					} else if (choice == 4) {
						break;
					} else
						System.out.println("Invalid Choice, Try again");
				}
			}
		}

		else if (choice == 2) {
			typeofuser = "Seller";
			Customer current1 = new Customer();
			System.out.println("what is your UserId?");
			sc.nextLine();
			current1.setUserId(sc.nextLine());
			System.out.println("what is your Password?");
			sc.nextLine();
			current1.setPassword(sc.nextLine());
			if (current1.Verify() == true) {
				System.out.println("user Verified.");

				while (true) {
					System.out.println("Do you want to 1.View all the Product 2.Contact Us 3.Exit.");
					int choice1=sc.nextInt();
					//int choice1=sc.nextInt();
				//	System.out.println(choice1);
				    	if(choice1==1) {
				    		Catalog catalog2=new Catalog();
				    		Product[] allproducts= catalog2.getListofAllProducts();
				    		for(int i=0;i< allproducts.length;i++) {
				    			System.out.println(allproducts[i].getProductId()+" "+allproducts[i].getProductName()+ " "+ allproducts[i].getProductcost());
				    		}
				    		

					} 
				else if(choice1==2) {
						System.out.println("To Contact us ,please email on Store@ecommerce.com .");
						
					}
				else if(choice1==3) {
						break;
					}
					else {
						System.out.println("Invalid Choice, Try again");
				
				        }
					
				}

			}
		}
		

		else if (choice == 3) {
			typeofuser = "Admin";
			Customer admin = new Customer();

			while (true) {
				System.out.println("Do you want to view all the Products? y/n");
				sc.nextLine();
				String choice2 = sc.nextLine();
				if(choice2.equals("y")) {

				Catalog catalog1 = new Catalog();
				Product[] allproducts = catalog1.getListofAllProducts();
				for (int i = 0; i < allproducts.length; i++) {
					System.out.println(allproducts[i].getProductId() + " " + allproducts[i].getProductName() + " "
							+ allproducts[i].getProductcost());

				}
			}

		}
	}
		
		else {
			System.out.println(" Invalid user,Enter valid user.");
		}
		

	}
}
