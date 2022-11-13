package vn.iotstar.controller.Admin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import vn.iotsar.service.ICategorySERVICE;
import vn.iotstar.model.CategoryModel;
import vn.iotstar.service.impl.CategoryServiceImpl;
@WebServlet(urlPatterns = { "/admin/category/uploadmulti" })
public class UploadFileMultipart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ICategorySERVICE cateService = new CategoryServiceImpl();
	public UploadFileMultipart() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/views/admin/add-category.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CategoryModel category=new CategoryModel();
		try {
			resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
			req.setCharacterEncoding("UTF-8");
			DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
			ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
			servletFileUpload.setHeaderEncoding("UTF-8");
			List<FileItem> items = servletFileUpload.parseRequest(req);
			for (FileItem item : items) {
				if (item.getFieldName().equals("name")) {
					category.setCateName(item.getString("UTF-8"));
				} else if (item.getFieldName().equals("icon")) {
					Part part = req.getPart("icon");
					String realPath = req.getServletContext().getRealPath("/uploads");
					String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
					if (!Files.exists(Paths.get(realPath))) {
						Files.createDirectory(Paths.get(realPath));
					}
					part.write(realPath + "/" + filename);
				}
			}
			cateService.insert(category); /*goi thu tuc insert*/
			resp.sendRedirect(req.getContextPath() + "/admin/category/list");
			
		} catch (Exception e) {
			
		}
	}

}
