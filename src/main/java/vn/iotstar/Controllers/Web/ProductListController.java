package vn.iotstar.Controllers.Web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.iotsar.service.IProductServices;
import vn.iotstar.model.productModel;
import vn.iotstar.service.impl.ProductServiceImpl;
@WebServlet(urlPatterns = {"/Products", "/products"})
public class ProductListController extends HttpServlet {
	IProductServices productServices=new ProductServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		List<productModel> productList = productServices.getTop3();
		req.setAttribute("products", productList);
		req.setAttribute("headerId", "Product");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/web/Products.jsp");
		try {
			dispatcher.forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;

}
