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

/**
 * Servlet implementation class SearchConTroller
 */
@WebServlet(urlPatterns = {"/Search", "/search"} )
public class SearchConTroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IProductServices productServices=new ProductServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchConTroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String txtSearch = request.getParameter("txt");
		//System.out.println("txtSearch " + txtSearch);
		List<productModel> productList = productServices.searchByName(txtSearch);
		System.out.println(productList);
		request.setAttribute("products", productList);
		request.setAttribute("headerId", "Product");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Products.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
