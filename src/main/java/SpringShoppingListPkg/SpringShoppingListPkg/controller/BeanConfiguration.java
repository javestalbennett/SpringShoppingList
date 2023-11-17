/**
 * @author Joshua Vestal-Bennett - javestalbennett
 * CIS175 - Fall 2023
 * Nov 17, 2023
*/
package SpringShoppingListPkg.SpringShoppingListPkg.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import SpringShoppingListPkg.SpringShoppingListPkg.beans.ListItem;


@Configuration
public class BeanConfiguration {
	@Bean
	public ListItem listItem() {
		ListItem bean = new ListItem( );
		bean.setItemName("Soap");
		bean.setStore("Target");
		return bean;
	}
}
