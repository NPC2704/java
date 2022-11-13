package vn.iotstar.Controllers.Web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.iotsar.service.IProductServices;
import vn.iotstar.model.productModel;
import vn.iotstar.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class AjaxLoadMoreController
 */
@WebServlet(urlPatterns = { "/Load", "/load" })
public class AjaxLoadMoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IProductServices productServices = new ProductServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjaxLoadMoreController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		// Load ra 3 san pham truoc
		String amount = request.getParameter("exits");
		int iamount = Integer.parseInt(amount);
		List<productModel> ListProduct = productServices.getNext3Product(iamount);
		//System.out.println(ListProduct);
		PrintWriter out = response.getWriter();
		for (productModel o : ListProduct) {
			out.println("<div class=\"col-12 col-md-6 col-lg-4\">\r\n"
					+ "						<div class=\"card\">\r\n"
					+ "							<img class=\"card-img-top\"\r\n"
					+ "								src=\"" + o.getImage() + "\"\r\n"
					+ "								alt=\"Card image cap\">\r\n"
					+ "							<div class=\"card-body\">\r\n"
					+ "								<h4 class=\"card-title\">\r\n"
					+ "									<a href=\"<core:url value='/ProductDetail?id="
					+ o.getProductId() + " '/>\" title=\"View Product\">" + o.getProductName() + "</a>\r\n"
					+ "								</h4>\r\n" + "								<p class=\"card-text\">"
					+ o.getDescription() + "</p>\r\n" + "								<div class=\"row\">\r\n"
					+ "									<div class=\"col\">\r\n"
					+ "										<p class=\"btn btn-danger btn-block\">" + o.getPrice()
					+ "$</p>\r\n" + "									</div>\r\n"
					+ "									<div class=\"col\">\r\n"
					+ "										<a href=\"#\" class=\"btn btn-success btn-block\">Add to cart</a>\r\n"
					+ "									</div>\r\n" + "								</div>\r\n"
					+ "							</div>\r\n" + "						</div>\r\n"
					+ "					</div>");
		}

		//request.setAttribute("products", ListProduct);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
