package vn.iotstar.service.impl;

import java.util.List;

import vn.iotsar.service.IProductServices;
import vn.iotstar.dao.impl.ProductDaoImpl;
import vn.iotstar.model.productModel;
import vn.iotstart.dao.IProductDAO;

public class ProductServiceImpl implements IProductServices {
	IProductDAO productDAO=new ProductDaoImpl();
	@Override
	public List<productModel> findAll() {
		// TODO Auto-generated method stub
		return productDAO.findAll();
	}

	@Override
	public List<productModel> findTopOne() {
		// TODO Auto-generated method stub
		return productDAO.findTopOne();
	}

	@Override
	public List<productModel> findLastProduct() {
		// TODO Auto-generated method stub
		return productDAO.findLastProduct();
	}

	@Override
	public List<productModel> findBestAmount() {
		// TODO Auto-generated method stub
		return productDAO.findBestAmount();
	}

	@Override
	public List<productModel> SelectProduct(int id) {
		return productDAO.SelectProduct(id);
	}

	@Override
	public List<productModel> products(int id) {
		return productDAO.products(id);
	}

	@Override
	public int countAll() {
		return productDAO.countAll();
	}

	@Override
	public List<productModel> pagingProduct(int index) {
		// TODO Auto-generated method stub
		return productDAO.pagingProduct(index);
	}

	@Override
	public int coutCid(int Cid) {
		// TODO Auto-generated method stub
		return productDAO.countCid(Cid);
	}

	@Override
	public List<productModel> pagingProductbyCid(int Cid, int index) {
		// TODO Auto-generated method stub
		return productDAO.pagingProductbyCid(Cid, index);
	}

	@Override
	public List<productModel> searchByName(String txtSearch) {
		// TODO Auto-generated method stub
		return productDAO.searchByName(txtSearch);
	}

	@Override
	public List<productModel> getTop3() {
		// TODO Auto-generated method stub
		return productDAO.getTop3();
	}

	@Override
	public List<productModel> getNext3Product(int amount) {
		// TODO Auto-generated method stub
		return productDAO.getNext3Product(amount);
	}
	

}
