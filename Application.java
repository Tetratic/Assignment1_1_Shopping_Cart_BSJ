/**
    A class that tests methods from ShoppingCart and Item.
    @author Brian Johnston
    @version 1.0
*/

import java.util.Arrays;
public class Application {

	public static void main(String[] args) {
		
		//Testing Item class
		System.out.println("============================");
		System.out.println(" Testing Item Class methods");
		System.out.println("============================");
		
		
		Item i1 = new Item();
		Item i2 = new Item("Banana","F3170",4.50,true,false,0.75);
		Item i3 = new Item("Hammer","T345",24.52,true,false,0);
		Item i4 = new Item("Cereal","F199",7.27,true,true,0.65);
		Item i5 = new Item("Hedge Trimmers","T662",14.90,true,true,0.35);
		
		
		System.out.println("Description of Item i1: " + i1.toString());
		
		//important method to test is getPrice() with and without discounts
		System.out.println("Price of Item i2: " + i2.getPrice()); //initial price of i2, 4.5
		i2.setPrice(10.);
		i2.setDiscount(true);
		System.out.println("Value of price field of Item i2: " +i2.price); //should be the current price of 10.
		System.out.println("Price of i2 with discount applied: " + i2.getPrice()); //should return price of 2.5 (1-.75)*10
		
		System.out.println("====================================");
		System.out.println(" Testing ShoppingCart Class methods");
		System.out.println("====================================");
		
		
		ShoppingCart smallCart = new ShoppingCart(3);
		ShoppingCart cart1 = new ShoppingCart();
		ShoppingCart cart2 = new ShoppingCart();//creates 3 ShoppingCarts for testing purposes
		
		System.out.println("Size of smallCart: " + smallCart.currentCartSize());//should be 0, as no items have been added to the cart
		System.out.println("Is smallCart empty?: " + smallCart.isEmpty());//should return true, as the cart is empty
		
		cart1.add(i1);
		cart1.add(i2);
		cart1.add(i3);
		cart1.add(i4);
		cart1.add(i5);//adds all 5 items to cart1
		
		System.out.println("Size of cart1: " + cart1.currentCartSize());//should be 5, with 5 items in the cart
		System.out.println("Is cart1 empty?: " + cart1.isEmpty());//should be false, as the cart has 5 items
		
		cart1.remove();//removes an item from cart1
		System.out.println("Size of cart1: " + cart1.currentCartSize());//should be 4 now that one items has been removed.
		
		Object[] ar = cart1.displayCart(); //returns toString() of the items in cart1.
		System.out.println("Array of Items in cart1: " + Arrays.toString(ar));
		System.out.println();
		cart1.remove(i1);//removes i1 from cart1
		ar = cart1.displayCart();
		System.out.println("Array of Items in cart1: " + Arrays.toString(ar));//prints the remaining 3 items in cart1: i2,i3,i4
		System.out.println();
		
		cart1.clearCart();
		ar = cart1.displayCart();
		System.out.println("Array of Items in cart1: " + Arrays.toString(ar));//empty cart, should print "[]"
		System.out.println();
		
		smallCart.add(i1);
		smallCart.add(i1);
		smallCart.add(i1);//adds 3 instances of i1 to smallCart
		
		System.out.println("Number of Item i1 in smallCart: " + smallCart.quantity(i1));//should return 3
		
		System.out.println("Does smallCart contain Item i1?: " + smallCart.has(i1));//should return true
		System.out.println("Does smallCart contain Item i2?: " + smallCart.has(i2));//should return false
		
		cart1.add(i2);
		cart1.add(i2);
		
		System.out.println("Price of i2: " + i2.getPrice()); //2.5
		ar = cart1.displayCart();
		System.out.println("Array of Items in cart1: " + Arrays.toString(ar));//should show 2 Item i2's in cart1
		System.out.println("TotalPrice of cart1: " + cart1.displayTotalPrice());//2*2.5=5.0
		
		cart1.add(i4);
		cart1.showDiscounts();//should display discounts for Items i2, i2, and i4
		
		
		
	}

}
