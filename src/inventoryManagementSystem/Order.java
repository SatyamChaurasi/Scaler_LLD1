package inventoryManagementSystem;

public class Order implements Comparable<Order> {
	
	private String orderId;
	private String itemId;
	private int quantity;
	private boolean isExpress;
	
	
	public Order(String orderId, String itemId, int quantity, boolean isExpress) {
		
		this.orderId = orderId;
		this.itemId = itemId;
		this.quantity = quantity;
		this.isExpress = isExpress;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isExpress() {
		return isExpress;
	}

	public void setExpress(boolean isExpress) {
		this.isExpress = isExpress;
	}



	@Override
	public int compareTo(Order order) {
		if(this.isExpress == order.isExpress) {
			return this.orderId.compareTo(order.orderId);
		} else if( this.isExpress == true) {
			return -1;
		}else {
			return 1;
		}
	}
	
	
}
