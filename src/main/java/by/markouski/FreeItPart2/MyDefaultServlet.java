package by.markouski.FreeItPart2;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/"})
public class MyDefaultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L ;

    public MyDefaultServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.print("<html><head><title>Page not found</title></head><body>");
        outputStream.print("<h3>Sorry Page Not Found!</h3>");
        outputStream.print("<p>This massage crate " + this.getClass().getName());
        outputStream.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
