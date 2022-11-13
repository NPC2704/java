package vn.iotstar.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//import org.eclipse.jdt.internal.compiler.batch.Main;

import vn.iotsar.service.ICategorySERVICE;
import vn.iotstar.connection.DBConnection;
import vn.iotstar.model.productModel;
import vn.iotstar.service.impl.CategoryServiceImpl;
import vn.iotstart.dao.IProductDAO;

public class ProductDaoImpl extends DBConnection implements IProductDAO {
	ICategorySERVICE categorySERVICE = new CategoryServiceImpl();

	@Override
	public List<productModel> findAll() {
		List<productModel> products = new ArrayList<productModel>();
		String sql = "SELECT * FROM Product";
		try {
			Connection conn = super.getConnectionW();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productModel product = new productModel();
				product.setProductId(rs.getInt("productId"));
				product.setProductCode(rs.getInt("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setCategoryId(rs.getInt("categoryId"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getFloat("price"));
				product.setAmount(rs.getInt("amount"));
				product.setStock(rs.getInt("stock"));
				product.setImage(rs.getString("images"));
				product.setStatus(rs.getInt("status"));
				product.setWishlist(rs.getInt("wishlist"));
				product.setCreateDate(rs.getDate("createDate"));
				product.setSellerId(rs.getInt("sellerId"));
				product.setCategory(categorySERVICE.get(product.getProductId()));
				products.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public List<productModel> findTopOne() {
		List<productModel> products = new ArrayList<productModel>();
		String sql = "SELECT TOP 1 * FROM Product ORDER BY amount DESC";
		try {
			Connection conn = super.getConnectionW();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productModel product = new productModel();
				product.setProductId(rs.getInt("productId"));
				product.setProductCode(rs.getInt("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setCategoryId(rs.getInt("categoryId"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getFloat("price"));
				product.setAmount(rs.getInt("amount"));
				product.setStock(rs.getInt("stock"));
				product.setImage(rs.getString("images"));
				product.setStatus(rs.getInt("status"));
				product.setWishlist(rs.getInt("wishlist"));
				product.setCreateDate(rs.getDate("createDate"));
				product.setSellerId(rs.getInt("sellerId"));
				product.setCategory(categorySERVICE.get(product.getProductId()));
				products.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public List<productModel> findLastProduct() {
		List<productModel> products = new ArrayList<productModel>();
		// String sql = "SELECT TOP 4 * FROM Product ORDER BY createDate ASC";
		String sql = "SELECT TOP 4 * FROM Product ORDER BY productId ASC";
		try {
			Connection conn = super.getConnectionW();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productModel product = new productModel();
				product.setProductId(rs.getInt("productId"));
				product.setProductCode(rs.getInt("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setCategoryId(rs.getInt("categoryId"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getFloat("price"));
				product.setAmount(rs.getInt("amount"));
				product.setStock(rs.getInt("stock"));
				product.setImage(rs.getString("images"));
				product.setStatus(rs.getInt("status"));
				product.setWishlist(rs.getInt("wishlist"));
				product.setCreateDate(rs.getDate("createDate"));
				product.setSellerId(rs.getInt("sellerId"));
				product.setCategory(categorySERVICE.get(product.getProductId()));
				products.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public List<productModel> findBestAmount() {
		List<productModel> products = new ArrayList<productModel>();
		String sql = "SELECT TOP 4 * FROM Product ORDER BY amount DESC";
		try {
			Connection conn = super.getConnectionW();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productModel product = new productModel();
				product.setProductId(rs.getInt("productId"));
				product.setProductCode(rs.getInt("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setCategoryId(rs.getInt("categoryId"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getFloat("price"));
				product.setAmount(rs.getInt("amount"));
				product.setStock(rs.getInt("stock"));
				product.setImage(rs.getString("images"));
				product.setStatus(rs.getInt("status"));
				product.setWishlist(rs.getInt("wishlist"));
				product.setCreateDate(rs.getDate("createDate"));
				product.setSellerId(rs.getInt("sellerId"));
				product.setCategory(categorySERVICE.get(product.getProductId()));
				products.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public List<productModel> SelectProduct(int id) {
		List<productModel> products = new ArrayList<productModel>();
		String sql = "SELECT * FROM Product WHERE productId = ?";
		try {
			Connection conn = super.getConnectionW();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productModel product = new productModel();
				product.setProductId(rs.getInt("productId"));
				product.setProductCode(rs.getInt("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setCategoryId(rs.getInt("categoryId"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getFloat("price"));
				product.setAmount(rs.getInt("amount"));
				product.setStock(rs.getInt("stock"));
				product.setImage(rs.getString("images"));
				product.setStatus(rs.getInt("status"));
				product.setWishlist(rs.getInt("wishlist"));
				product.setCreateDate(rs.getDate("createDate"));
				product.setSellerId(rs.getInt("sellerId"));
				product.setCategory(categorySERVICE.get(product.getProductId()));
				products.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public List<productModel> products(int id) {
		List<productModel> products = new ArrayList<productModel>();
		String sql = "SELECT * FROM Product WHERE categoryId = ?";
		try {
			Connection conn = super.getConnectionW();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productModel product = new productModel();
				product.setProductId(rs.getInt("productId"));
				product.setProductCode(rs.getInt("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setCategoryId(rs.getInt("categoryId"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getFloat("price"));
				product.setAmount(rs.getInt("amount"));
				product.setStock(rs.getInt("stock"));
				product.setImage(rs.getString("images"));
				product.setStatus(rs.getInt("status"));
				product.setWishlist(rs.getInt("wishlist"));
				product.setCreateDate(rs.getDate("createDate"));
				product.setSellerId(rs.getInt("sellerId"));
				product.setCategory(categorySERVICE.get(product.getProductId()));
				products.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public List<productModel> pagingProduct(int index) {
		List<productModel> ListProduct = new ArrayList<productModel>();
		String sql = "select * from Product order by productId OFFSET ? ROW fetch next 3 rows only";
		try {
			Connection conn = super.getConnectionW();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, (index - 1) * 3);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productModel product = new productModel();
				product.setProductId(rs.getInt("productId"));
				product.setProductCode(rs.getInt("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setCategoryId(rs.getInt("categoryId"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getFloat("price"));
				product.setAmount(rs.getInt("amount"));
				product.setStock(rs.getInt("stock"));
				product.setImage(rs.getString("images"));
				product.setStatus(rs.getInt("status"));
				product.setWishlist(rs.getInt("wishlist"));
				product.setCreateDate(rs.getDate("createDate"));
				product.setSellerId(rs.getInt("sellerId"));
				product.setCategory(categorySERVICE.get(product.getProductId()));
				ListProduct.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ListProduct;
	}

	@Override
	public List<productModel> pagingProductbyCid(int Cid, int index) {
		List<productModel> ListProduct = new ArrayList<productModel>();
		String sql = "select * from Product where categoryId = ? order by productId OFFSET ? ROW fetch next 3 rows only";
		try {
			Connection conn = super.getConnectionW();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, Cid);
			ps.setInt(2, (index - 1) * 3);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productModel product = new productModel();
				product.setProductId(rs.getInt("productId"));
				product.setProductCode(rs.getInt("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setCategoryId(rs.getInt("categoryId"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getFloat("price"));
				product.setAmount(rs.getInt("amount"));
				product.setStock(rs.getInt("stock"));
				product.setImage(rs.getString("images"));
				product.setStatus(rs.getInt("status"));
				product.setWishlist(rs.getInt("wishlist"));
				product.setCreateDate(rs.getDate("createDate"));
				product.setSellerId(rs.getInt("sellerId"));
				product.setCategory(categorySERVICE.get(product.getProductId()));
				ListProduct.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ListProduct;
	}

	@Override
	public int countAll() {
		int count = 0;
		String sql = "SELECT COUNT(productId) AS NumberOfProducts FROM Product;";
		try {
			Connection conn = super.getConnectionW();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int countCid(int Cid) {
		int count = 0;
		String sql = "SELECT COUNT(productId) AS NumberOfProducts FROM Product where categoryId = ?";
		try {
			Connection conn = super.getConnectionW();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, Cid);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<productModel> searchByName(String txtSearch) {
		List<productModel> products = new ArrayList<productModel>();
		String sql = "select * from Product where productName like ?";
		try {
			Connection conn = super.getConnectionW();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + txtSearch + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productModel product = new productModel();
				product.setProductId(rs.getInt("productId"));
				product.setProductCode(rs.getInt("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setCategoryId(rs.getInt("categoryId"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getFloat("price"));
				product.setAmount(rs.getInt("amount"));
				product.setStock(rs.getInt("stock"));
				product.setImage(rs.getString("images"));
				product.setStatus(rs.getInt("status"));
				product.setWishlist(rs.getInt("wishlist"));
				product.setCreateDate(rs.getDate("createDate"));
				product.setSellerId(rs.getInt("sellerId"));
				product.setCategory(categorySERVICE.get(product.getProductId()));
				products.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public List<productModel> getTop3() {
		List<productModel> products = new ArrayList<productModel>();
		String sql = "select Top 3* from Product";
		try {
			Connection conn = super.getConnectionW();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productModel product = new productModel();
				product.setProductId(rs.getInt("productId"));
				product.setProductCode(rs.getInt("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setCategoryId(rs.getInt("categoryId"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getFloat("price"));
				product.setAmount(rs.getInt("amount"));
				product.setStock(rs.getInt("stock"));
				product.setImage(rs.getString("images"));
				product.setStatus(rs.getInt("status"));
				product.setWishlist(rs.getInt("wishlist"));
				product.setCreateDate(rs.getDate("createDate"));
				product.setSellerId(rs.getInt("sellerId"));
				product.setCategory(categorySERVICE.get(product.getProductId()));
				products.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public List<productModel> getNext3Product(int amount) {
		List<productModel> ListProduct = new ArrayList<productModel>();
		String sql = "select * from Product order by productId OFFSET ? ROWS fetch next 3 rows only";
		try {
			Connection conn = super.getConnectionW();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, amount);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productModel product = new productModel();
				product.setProductId(rs.getInt("productId"));
				product.setProductCode(rs.getInt("productCode"));
				product.setProductName(rs.getString("productName"));
				product.setCategoryId(rs.getInt("categoryId"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getFloat("price"));
				product.setAmount(rs.getInt("amount"));
				product.setStock(rs.getInt("stock"));
				product.setImage(rs.getString("images"));
				product.setStatus(rs.getInt("status"));
				product.setWishlist(rs.getInt("wishlist"));
				product.setCreateDate(rs.getDate("createDate"));
				product.setSellerId(rs.getInt("sellerId"));
				product.setCategory(categorySERVICE.get(product.getProductId()));
				ListProduct.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ListProduct;
	}
	
}
