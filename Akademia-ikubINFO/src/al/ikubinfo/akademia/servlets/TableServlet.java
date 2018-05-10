package al.ikubinfo.akademia.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import al.ikubinfo.akademia.beans.Student;


/**
 * Servlet implementation class TableServlet
 */
@WebServlet("/TableServlet")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> listStudentesh = new ArrayList<Student>();
		
		//Gjenero studente ne forme statike
		for(int i = 0; i < 10; i++) {
			Student student = new Student();
			student.setId(String.valueOf(i));
			student.setEmer(student.getId() + "_Emer");
			student.setMbiemer(student.getId() + "_Mbiemer");
			listStudentesh.add(student);
		}

		request.setAttribute("students", listStudentesh);		
		RequestDispatcher view = request.getRequestDispatcher("/data/table.jsp");
        view.forward(request, response);
        //response.sendRedirect("/HelloServlet/data/table.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
