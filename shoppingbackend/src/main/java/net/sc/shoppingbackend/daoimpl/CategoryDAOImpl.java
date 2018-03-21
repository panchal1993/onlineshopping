package net.sc.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.sc.shoppingbackend.dao.CategoryDAO;
import net.sc.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		// Adding first category
		Category category = new Category();
		category.setId(1);
		category.setName("TV");
		category.setDescription("Its a freaking TV man");
		category.setImgURL("TV_1.png");

		categories.add(category);

		// Adding Second category
		Category category1 = new Category();
		category1.setId(2);
		category1.setName("Mobile");
		category1.setDescription("Its a freaking Phone man");
		category1.setImgURL("Mobile_1.png");

		categories.add(category1);

		// Adding Third category
		Category category2 = new Category();
		category2.setId(3);
		category2.setName("Laptop");
		category2.setDescription("Its a freaking Computer man");
		category2.setImgURL("Laptop_1.png");

		categories.add(category2);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		//int j = 0;
		return categories;
	}

	@Override
	public Category get(int id) {
		// loop to parse through the list
		
		for(Category category : categories) {
			if(category.getId()==id)
				return category;
		}
		
		return null;
	}

}
