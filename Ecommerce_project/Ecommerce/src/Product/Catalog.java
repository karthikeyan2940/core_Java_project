package Product;

public class Catalog {
	private Product[] ListofAllProducts;
	Category  cat1= new Category();
	Category cat2= new Category();
	Category cat3= new Category();
	
	

	public Product[] getListofAllProducts() {
        cat1.setCategoryName("Cloths");
		cat2.setCategoryName("Electronics");
		cat3.setCategoryName("Furniture");
		
		
		Product product1=new Product();
		product1.setProductId("1");
		product1.setProductName("Shirt");
		product1.setProductcost("100");
		product1.setCategory("Cloths");
		
		
		Product product2=new Product();
		product2.setProductId("2");
		product2.setProductName("Shorts");
		product2.setProductcost("200");
		product2.setCategory("Cloths");
		

		Product product3=new Product();
		product3.setProductId("3");
		product3.setProductName("Computer");
		product3.setProductcost("2000");
		product3.setCategory("Electronics");
		

		Product product4=new Product();
		product4.setProductId("4");
		product4.setProductName("Lap top");
		product4.setProductcost("2000");
		product4.setCategory("Electronics");
		

		Product product5=new Product();
		product5.setProductId("5");
		product5.setProductName("Table");
		product5.setProductcost("1000");
		product5.setCategory("Furniture");
		

		Product product6=new Product();
		product6.setProductId("6");
		product6.setProductName("Drawer");
		product6.setProductcost("2000");
		product6.setCategory("Furniture");
		
		
		
		
		
		ListofAllProducts=new Product[6];
		ListofAllProducts[0]=product1;
		ListofAllProducts[1]=product2;
		ListofAllProducts[2]=product3;
		ListofAllProducts[3]=product4;
		ListofAllProducts[4]=product5;
		ListofAllProducts[5]=product6;
		
		 
		
		return ListofAllProducts;
	}

	public void setListofAllProducts(Product[] listofAllProducts) {
		ListofAllProducts = listofAllProducts;
	}

}
