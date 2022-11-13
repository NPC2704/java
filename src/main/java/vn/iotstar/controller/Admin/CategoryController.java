package vn.iotstar.controller.Admin;

import vn.iotsar.service.ICategorySERVICE;
import vn.iotstar.model.CategoryModel;
import vn.iotstar.service.impl.CategoryServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

    @WebServlet(urlPatterns = {"/admin/category/list"})
public class CategoryController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    ICategorySERVICE cateService = new CategoryServiceImpl();

    public CategoryController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CategoryModel> cateList = cateService.findAll();
        request.setAttribute("listCategory", cateList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/admin/ListCategory.jsp");
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

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
