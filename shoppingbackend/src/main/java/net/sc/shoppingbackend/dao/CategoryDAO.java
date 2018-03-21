package net.sc.shoppingbackend.dao;

import java.util.List;

import net.sc.shoppingbackend.dto.Category;

public interface CategoryDAO {

	
	List<Category> list();
	
	Category get(int id);
}
