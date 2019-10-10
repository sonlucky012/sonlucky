package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Connect;
import Model.Sinhvien;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String hoten = request.getParameter("hoten");
		String diachi = request.getParameter("diachi");
		int sdt = Integer.parseInt(request.getParameter("sdt"));
		Sinhvien sv= new Sinhvien(id,hoten,diachi,sdt);
		Connect connect = new Connect();
		connect.Insert(sv);
		response.sendRedirect("Index.jsp");
	}

}
