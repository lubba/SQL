package talkie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TalkieServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private void printQuestion(PrintWriter writer){
		
		writer.println("<html>");
        writer.println("<head><title>My first page</title></head>");
        writer.println("<body>������!" +
                "<FORM method=\"post\"> " +
                "���� �� � <INPUT NAME=\"question\"> <BR> " +
                "<INPUT TYPE=SUBMIT>\n" +
                "</FORM> " +
                "</body>");
        writer.println("</html>");
	}
	private void printDialog(PrintWriter writer, String answer){
		writer.println("<html>");
        writer.println("<head><title>My first page</title></head>");
        writer.println("<body>������!" +
                "<FORM method=\"post\"> " +
                "���� �� � <INPUT NAME=\"question\"> <BR> "+
                "<INPUT TYPE=SUBMIT>\n" +
                "</FORM> <br>" +
                answer +
                "</body>");
        writer.println("</html>");
        writer.close();


	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) // ���������� ������
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		printQuestion(pw);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) // ���������� ������
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		ReplyGenerator a = new DefaultReplyGenerator();
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = resp.getWriter();
	
		printDialog(pw,a.generate());
		pw.close();
	}
	
}
