import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.*;
import java.io.*;

public class calculator extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException ,IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<h2> Solution:"+ req.getParameter("calc_value")+"</h2>");
        pw.close();
    }
}

        
    