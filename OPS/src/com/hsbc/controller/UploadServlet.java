package com.hsbc.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.hsbc.model.utility.JSONProductsDB;



@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UploadServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String file_name = null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
		if (!isMultipartContent) {
			return;
		}
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			List<FileItem> fields = upload.parseRequest(request);
			Iterator<FileItem> it = fields.iterator();
			if (!it.hasNext()) {
				return;
			}
			while (it.hasNext()) {
				FileItem fileItem = it.next();
				boolean isFormField = fileItem.isFormField();
				if (isFormField) {
					if (file_name == null) {
						if (fileItem.getFieldName().equals("file_name")) {
							file_name = fileItem.getString();
						}
					}
				} else {
					if (fileItem.getSize() > 0) {
						fileItem.write(new File("D:\\uploads\\" + fileItem.getName().substring(fileItem.getName().lastIndexOf('\\'))));
						new JSONProductsDB().addProductsToDB();
						
						
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			out.println("<script type='text/javascript'>");
			out.println("window.location.href='index.jsp?filename=" + file_name + "'");
			out.println("</script>");
			out.close();
//			System.out.println(new ProductJson().readJsonFile());
		}
	}
}
