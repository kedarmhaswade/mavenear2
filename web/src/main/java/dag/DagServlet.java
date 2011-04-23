package dag;


import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class DagServlet extends HttpServlet {
    @EJB(name = "DagEJB")
    private Dag ejb;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletOutputStream out = response.getOutputStream();
        out.println("<html><body>");
        out.println("<p>Servlet says hey.</p>");
        Common common = new Common();
        out.println("<p>" + common.sayHey() + "</p>");
        out.println("<p>" + ejb.sayHey() + "</p>");
        out.println("</body></html>");
        out.flush();
    }
}
