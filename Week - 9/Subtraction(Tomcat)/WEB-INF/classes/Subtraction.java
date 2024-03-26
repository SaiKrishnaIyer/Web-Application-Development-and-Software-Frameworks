import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Subtraction extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");

        PrintWriter pw = res.getWriter();

        int x = Integer.parseInt(req.getParameter("t1"));
        int y = Integer.parseInt(req.getParameter("t2"));

        pw.println("Subtraction is " + (x - y));
    }

}
