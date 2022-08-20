package beans;

public class SaleBean {
	private int price, qty;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getAmount() {
		int amount = this.qty * this.price;
		if (amount > 10000)
			 amount = amount * 90 / 100;
		
		return amount;
	}
}
