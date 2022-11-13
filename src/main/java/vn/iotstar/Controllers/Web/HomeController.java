package vn.iotstar.Controllers.Web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.eclipse.jdt.internal.compiler.batch.Main;

import vn.iotsar.service.IProductServices;
import vn.iotstar.model.productModel;
import vn.iotstar.service.impl.ProductServiceImpl;
@WebServlet(urlPatterns = {"/home", "/Home"})
public class HomeController extends HttpServlet {
	IProductServices productServices=new ProductServiceImpl();
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		List<productModel> productList = productServices.findTopOne();
		req.setAttribute("toponeProduct", productList);
		//
		List<productModel> LastProduct = productServices.findLastProduct();
		req.setAttribute("lastProduct", LastProduct);
		//
		List<productModel> AmountProduct = productServices.findBestAmount();
		req.setAttribute("amountProduct", AmountProduct);
		
		
		req.setAttribute("headerId", "Home");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/web/Home.jsp");
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
	
}
