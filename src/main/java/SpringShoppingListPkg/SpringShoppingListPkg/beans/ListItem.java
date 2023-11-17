/**
 * @author Joshua Vestal-Bennett - javestalbennett
 * CIS175 - Fall 2023
 * Nov 17, 2023
 */
package SpringShoppingListPkg.SpringShoppingListPkg.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class ListItem {
	private String itemName;
	private String store;
	
	// default no-args constructor
	public ListItem() {
		
	}
	
	// constructor
	public ListItem(String itemName, String store) 
	{

	}

	/**
	 * @return the objectName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param objectName the objectName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the store
	 */
	public String getStore() {
		return store;
	}

	/**
	 * @param store the store to set
	 */
	public void setStore(String store) {
		this.store = store;
	}
	
	@Override
	public String toString() {
		return "ListItem [itemName=" + itemName + ", store=" + store+ "]";
	}
}
