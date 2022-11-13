package vn.iotstart.dao;

import java.util.List;

import vn.iotstar.model.productModel;

public interface IProductDAO {
	List<productModel> findAll();
	List<productModel> findTopOne();
	List<productModel> findLastProduct();
	List<productModel> findBestAmount();
	List<productModel> SelectProduct(int id);
	List<productModel> products(int id);
	List<productModel> pagingProduct(int index);
	List<productModel> pagingProductbyCid(int Cid, int index);
	List<productModel> searchByName(String txtSearch);
	List<productModel> getTop3();
	List<productModel> getNext3Product(int amount);
	int countAll();
	int countCid(int Cid);
}
