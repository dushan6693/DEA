import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/SignupServlet"})
public class SignupServlet extends HttpServlet {

    Pattern letter = Pattern.compile("[a-zA-z]");
    Pattern digit = Pattern.compile("[0-9]");
    Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String r_password = request.getParameter("r_password");
            
            out.print("<h1>");
            if(isUsername(username)){
                if(isPassword(password)){
                    if(isSimilar(password, r_password)){
                        
                        out.println("Hello user. It worked!");

                    }else{
                        out.println("Pasword does not match ");
                    }
                }else{
                    out.println("Wrong password");
                }
            }else{
                out.println("Username error ");
            }
            
           out.print("</h1>");
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
    boolean isUsername(String username){

        if(letter.matcher(username).find()){
                if(digit.matcher(username).find()){
                    return true;
                }
                return false;
        }
        return false;
    }
    boolean isPassword(String password){
        if(special.matcher(password).find()){
                
            return true;
        }
        return false;
    }
    boolean isSimilar(String password, String rePassword){
        if(password.equals(rePassword)){
                
            return true;
        }
        return false;
    }
    

}
