package SpringShoppingListPkg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import SpringShoppingListPkg.SpringShoppingListPkg.beans.ListItem;
import SpringShoppingListPkg.SpringShoppingListPkg.repository.ListItemRepository;

@SpringBootApplication
public class SpringShoppingListApplication
{
	public static void main(String[] args) {
		SpringApplication.run(SpringShoppingListApplication.class, args);
	}
	/**
	@Autowired
	ListItemRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new
				AnnotationConfigApplicationContext(BeanConfiguration.class);
		//Using an existing bean
		ListItem c = appContext.getBean("contact", ListItem.class);
		c.setItemName("Crackers");
		c.setStore("Walmart");
		repo.save(c);
		//Creating a bean to use – not managed by Spring
		ListItem d = new ListItem("TV", "Costco");
		repo.save(d);
		List<ListItem> allMyItems = repo.findAll();
		for(ListItem items: allMyItems) 
		{
			System.out.println(people.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
	*/
}

