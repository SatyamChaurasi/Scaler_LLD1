package inventoryManagementSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {
	
	private LinkedList<Item> recentlyViewedItem;
	private Integer MAX_SIZE = 3;
	
	public RecentlyViewedItems(LinkedList<Item> recentlyViewedItem) {
		this.recentlyViewedItem = recentlyViewedItem;
	}
	
	public void addRecentlyViewedItem(Item item) {
		//remove the item if its already present
		recentlyViewedItem.remove(item); // if exists removes and returns true, else returns false
		
		recentlyViewedItem.addFirst(item); // adding item at the start
        if(recentlyViewedItem.size() > MAX_SIZE) {
            recentlyViewedItem.removeLast(); // removing item from the last
        }
	}
	
	public List<Item> getRecentlyViewedItems() {
        return new ArrayList<>(recentlyViewedItem);
    }

}