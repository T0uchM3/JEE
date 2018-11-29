package com.jwt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class exercice2
 */
@WebServlet("/exercice2")

public class exercice2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public exercice2() {
		super();
		// TODO Auto-generated constructor stub
	}

	int i = 0;
	int v;
	String[] cbox;

	int count;
	String old;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set response content type
		v = 0;
		String[] type = new String[3];
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		cbox = request.getParameterValues("art");

		out.println("<html>");
		out.println("<body>");

		out.println("<table style=\"width:100%\">");
		out.println("<tr>");
		out.println("<th>Nom d'article</th>");
		out.println("<th>Quantité</th>");
		out.println("</tr>");

		old = cbox[0];
		type[0] = old;
		for (int i = 0; i < cbox.length; i++) {

			if (!cbox[i].equals(type[v])) {
				v++;
				System.out.println(v);
				type[v] = cbox[i];
			}

		}
		int b = 0;
		do {
			count = 0;

			out.println("<tr>");
			out.println("<th>" + type[b] + "</th>");

			for (int n = 0; n < cbox.length; n++) {
				if (cbox[n].equals(type[b]))
					count++;
			}
			out.println("<th>" + "x" + count + "</th>");
			out.println("</tr>");
			b++;
			System.out.println("v" + v);
			System.out.println("b" + b);

		} while (b <= v);
		out.println("0::" + type[0]);
		out.println("1::" + type[1]);
		out.println("2::" + type[2]);
		out.println("v:::" + v);

		out.println("</table>");

		out.println("<form method=POST action=exercice2>");
		out.println("<input type = submit value=Retour name=B2>");
		out.println("</form>");

		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.sendRedirect("index2.jsp");

		// TODO Auto-generated method stub
//		doGet(request, response);
	}

}
