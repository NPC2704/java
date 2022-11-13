package vn.iotstar.service.impl;

import java.util.List;

import vn.iotsar.service.ICategorySERVICE;
import vn.iotstar.dao.impl.CategoryDAOimpl;
import vn.iotstar.model.CategoryModel;
import vn.iotstart.dao.ICategoryDAO;

public class CategoryServiceImpl implements ICategorySERVICE {
	ICategoryDAO cateDAO = new CategoryDAOimpl();

	@Override
	public List<CategoryModel> findAll() {

		return cateDAO.findAll();
	}

	@Override
	public void edit(CategoryModel newCategory) {
		// TODO Auto-generated method stub
		CategoryModel oldCate = cateDAO.get(newCategory.getCateId());
		oldCate.setCateName(newCategory.getCateName());
		oldCate.setImages(newCategory.getImages());
		cateDAO.edit(oldCate);
	}

	@Override
	public CategoryModel get(int id) {
		return cateDAO.get(id);
	}

	@Override
	public void insert(CategoryModel category) {
		// TODO Auto-generated method stub
		cateDAO.insert(category);
	}

	@Override
	public void delete(int id) {
		cateDAO.delete(id);
	}
}
