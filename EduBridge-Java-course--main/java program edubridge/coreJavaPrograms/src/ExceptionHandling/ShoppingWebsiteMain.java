package ExceptionHandling;

class Customer{
	int id;
	String name;
	double walletBalance;
	String address;
	
	public Customer(int id, String name, double walletBalance, String address) {
		super();
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}
}

class Item{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	
	
	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}
}

class ShoppinhWebsite{

	public String purchaseItem(Customer c1, Item item1) throws ItemOutOfStockException,InsufficientBalanceException{
		 if(!item1.isInStock)
			throw new ItemOutOfStockException("Item is out of stock");
		  else if(item1.price>c1.walletBalance) 
			throw new InsufficientBalanceException("Customer wallet balance is not sufficient");
		 else 
			return "Order succesfull";

}
}



class ItemOutOfStockException extends Exception{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  ItemOutOfStockException(String s) {
		super(s);
	}
	
}

class InsufficientBalanceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  InsufficientBalanceException(String s) {
		super(s);
	}
	
}
public class ShoppingWebsiteMain {
	public static void main(String[] args) throws ItemOutOfStockException, InsufficientBalanceException {
		
		Customer c1= new Customer(927392, "steve", 500.0, "USA");
		Item item1= new Item(27392, "T-Shirt", "U S polo", 800,false);
		ShoppinhWebsite sw= new ShoppinhWebsite();
		System.out.println(sw.purchaseItem(c1,item1));
	}

}

