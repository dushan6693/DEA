import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HeaderServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            
            
            out.print("<h3>Request Method: "+ request.getMethod()+"<br>");
            out.print("Request URI: "+ request.getRequestURI()+"<br>");
            out.print("Request Protocol: "+ request.getProtocol()+"<br>");
            out.print("</h3>");
            
            Enumeration headerNames = request.getHeaderNames();
            
            out.println("<table border='1'>");
            
            out.print("<tr>");
            out.print("<th>Header name</th>");
            out.print("<th>Header value</th>");
            out.print("</tr>");
            
          
            while(headerNames.hasMoreElements()){
                String headerName = (String) headerNames.nextElement();
                out.println("<tr>");
                out.println("<td>"+headerName+"</td>");
                out.println("<td>"+request.getHeader(headerName)+"</td>");
                out.println("</tr>");
            }
            
            out.println("</table>"); 
            out.println("</body>");
            out.println("</html>");
            
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
