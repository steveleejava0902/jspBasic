package jspBasic;

import java.io.*;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class servletT1 extends HttpServlet {
    
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       response.setContentType("text/html");
       request.setCharacterEncoding("utf8");
       response.setCharacterEncoding("utf8");
       PrintWriter out = response.getWriter();
       out.println("<html><head></head><body>");
       out.println("<h1>servlet, testPage</h1><p>this is sample servlet.</p>");
       out.println("</body></html>");
   }

   public void doPost(HttpServletRequest request, HttpServletResponse response)
           throws IOException {
       // not use.
   }
}