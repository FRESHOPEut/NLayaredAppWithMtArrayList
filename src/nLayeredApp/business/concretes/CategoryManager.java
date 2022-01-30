package nLayeredApp.business.concretes;

import nLayeredApp.business.abstracts.CategoryService;
import nLayeredApp.core.collections.MyArrayList;
import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryManager implements CategoryService{
	
	private CategoryDao categoryDao;
	
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public void add(Category category) {
		this.categoryDao.add(category);
		
	}

	@Override
	public void update(Category category) {
		this.categoryDao.update(category);
		
	}

	@Override
	public void delete(Category category) {
		this.categoryDao.delete(category);
		
	}

	@Override
	public MyArrayList<Category> getAll() {
		return this.categoryDao.getAll();
	}

}
