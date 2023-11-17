/**
 * @author Joshua Vestal-Bennett - javestalbennett
 * CIS175 - Fall 2023
 * Nov 17, 2023
*/
package SpringShoppingListPkg.SpringShoppingListPkg.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import SpringShoppingListPkg.SpringShoppingListPkg.beans.ListItem;

public interface ListItemRepository extends JpaRepository<ListItem, Long>{}
