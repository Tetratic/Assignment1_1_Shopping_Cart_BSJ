/**
    A class that defines an Item to be put in a ShoppingCart object.
    @author Brian Johnston
    @version 1.0
*/
public class Item {
	
	public String name,id;
	public double price;
	public boolean inStock, discount;
	public double percentOff;
	
	public Item() {
		setName("");
		setID("");
		setInStock(false);
		setDiscount(false);
		setPercentOff(0.);
		
		setPrice(0.); //last for the purpose of establishing the discount first
	}
	public Item(String name, String id, double price, boolean inStock, boolean discount, double percentOff) {
		setName(name);
		setID(id);
		setInStock(inStock);
		setDiscount(discount);
		setPercentOff(percentOff);
		
		setPrice(price); //last for the purpose of establishing the discount first
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public double getPrice() {
		double p = 0;
		if(discount == false) {
			p = price;
		}
		else if(discount == true) {
			p = (1-percentOff)*price;
		}
		return p;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public boolean isDiscount() {
		return discount;
	}
	public void setDiscount(boolean discount) {
		this.discount = discount;
	}
	public double getPercentOff() {
		return percentOff;
	}
	public void setPercentOff(double percentOff) {
		this.percentOff = percentOff;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", id=" + id + ", price=" + price + ", inStock=" + inStock + ", discount="
				+ discount + ", percentOff=" + percentOff + "]";
	}
	
}
