package vn.iotstar.Controllers.Web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.iotsar.service.ICategorySERVICE;
import vn.iotsar.service.IProductServices;
import vn.iotstar.model.CategoryModel;
import vn.iotstar.model.productModel;
import vn.iotstar.service.impl.CategoryServiceImpl;
import vn.iotstar.service.impl.ProductServiceImpl;

@WebServlet(urlPatterns = { "/CategoryList" })
public class CateController extends HttpServlet {
	ICategorySERVICE cateService = new CategoryServiceImpl();
	IProductServices productServices = new ProductServiceImpl();
	private static final long serialVersionUID = 1L;

	public CateController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		// Lấy tham số từ trang jsp
		String indexPage = request.getParameter("index");
		// Khởi tạo trang đầu
		if (indexPage == null) {
			indexPage = "1";
		}
		int index = Integer.parseInt(indexPage);
		List<CategoryModel> cateList = cateService.findAll();
		
		//
		String Scid = request.getParameter("cid");
		if (request.getParameter("cid") == null) {
			int count = productServices.countAll();
			int endPage = count/3;
			if(count%3 != 0) {
				endPage ++;
			}
			List<productModel> listProduct = productServices.pagingProduct(index);
			System.out.println(listProduct);
			request.setAttribute("endPage", endPage);
			request.setAttribute("products", listProduct);
		}
		else {
			//index = 1;
			int count = productServices.coutCid(Integer.parseInt(Scid));
			int endPage = count/3;
			if(count%3 != 0) {
				endPage ++;
			}	
			List<productModel> listProduct = productServices.pagingProductbyCid(Integer.parseInt(Scid), index);
			request.setAttribute("endPage", endPage);
			request.setAttribute("products", listProduct);
			
//			productList = productServices.products(Integer.parseInt(Scid));
//			request.setAttribute("products", productList);
		}
		
		productModel product = productServices.findTopOne().get(0);
		request.setAttribute("listCategory", cateList);	
		request.setAttribute("Scid", Scid);
		request.setAttribute("toponeProduct", product);
		request.setAttribute("indexPage", indexPage.toString());
		request.setAttribute("headerId", "Categories");
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/web/Categorys.jsp");
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/*
	 * public static void main(String[] args) { List<CategoryModel> cateList = new
	 * CategoryServiceImpl().findAll(); int firstCateId =
	 * cateList.get(0).getCateId(); for (CategoryModel cate : cateList) {
	 * System.out.println(firstCateId); } }
	 */
}
