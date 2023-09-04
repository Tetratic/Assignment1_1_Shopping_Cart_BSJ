/**
    A class that defines an online shopping cart defined as an ArrayBag, as well as operations to perform to the cart.
    @author Brian Johnston
    @version 1.0
*/
public class ShoppingCart {

	public ArrayBag<Item> bag;
	
	/**Creates an empty cart with default size of 25.*/
	public ShoppingCart() {
		bag = new ArrayBag<Item>();
	}
	/**Creates an empty cart with the given size
	 * @param bag  An ArrayBag object with*/
	public ShoppingCart(int size) {
		bag = new ArrayBag<Item>(size);
	}
	
	/**Gets the number of Items in the cart.
	 * @return  The integer number of Items in the cart.*/
	public int currentCartSize() {
		return bag.getCurrentSize();
	}
	
	/**Checks to see if the cart has any entries
	 * @return  True if the cart has no Items objects in it.*/
	public boolean isEmpty() {
		return bag.isEmpty();
	}
	
	/**Adds a specified Item to the cart.
	 * @param  i The Item to be added to the cart.*/
	public void add(Item i) {
		bag.add(i);
	}
	
	/**Removes an unspecified Item from the Cart if there is one to remove.*/
	public void remove() {
		bag.remove();
	}
	
	/**Removes a specified Item from the Cart
	 * @param  i  The specific item to remove from the cart*/
	public void remove(Item i) {
		bag.remove(i);
	}
	
	/**Completely removes all Items in the cart.*/
	public void clearCart() {
		bag.clear();
	}
	
	/**Returns the amount of a specific Item in the cart.
	 * @param i  the specific item to return the quantity of.
	 * @return  The number of Item i that exist in the cart.*/
	public int quantity(Item i) {
		return bag.getFrequencyOf(i);
	}
	
	/**Checks to see if a specific Item is in the cart.
	 * @param i  The specific Item to check the cart for.
	 * @return True if Item i is in the cart.*/
	public boolean has(Item i) {
		return bag.contains(i);
	}
	
	/**Collects all the Items in the cart for the purposes of displaying them.
	 * @return  An Object array holding all the items in the cart.*/
	public Object[] displayCart() {
		return bag.toArray();
	}
	
	/**Calculates the total price of all Items in the cart.
	 * @return  A double with the total price of the entire cart.*/
	public double displayTotalPrice() {
		Object[] itemArray = bag.toArray();
		double t=0;
		for (Object i : itemArray) {
			t+=((Item) i).getPrice();
		}
		return t;
	}
	
	/**Prints any Item in the cart that has a discount associated with it.*/
	public void showDiscounts() {
		Object[] itemArray = bag.toArray();
		for (Object i : itemArray) {
			if (((Item) i).isDiscount() == true) {
				System.out.println( (((Item) i).name) + " has a discount of " + (((Item) i).percentOff) +"%.");
			}
		}
	}
	@Override
	public String toString() {
		return "ShoppingCart [bag=" + bag + "]";
	}
	
}
