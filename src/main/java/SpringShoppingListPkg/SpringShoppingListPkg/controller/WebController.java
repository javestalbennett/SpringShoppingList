/**
 * @author Joshua Vestal-Bennett - javestalbennett
 * CIS175 - Fall 2023
 * Nov 17, 2023
*/
package SpringShoppingListPkg.SpringShoppingListPkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import SpringShoppingListPkg.SpringShoppingListPkg.beans.ListItem;
import SpringShoppingListPkg.SpringShoppingListPkg.repository.ListItemRepository;

@Controller
public class WebController {
	@Autowired
	ListItemRepository repo;
	
	@GetMapping({ "/", "viewAll" })
	public String viewAllListItems(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewListItem(model);
		}
		model.addAttribute("contacts", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputListItem")
	public String addNewListItem(Model model) {
		ListItem c = new ListItem();
		model.addAttribute("newListItem", c);
		return "input";
	}

	@PostMapping("/inputListItem")
	public String addNewListItem(@ModelAttribute ListItem c, Model model) {
		repo.save(c);
		return viewAllListItems(model);
	}

}
