package by.markouski.FreeItPart2;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InitParamServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private String supportEmail;

    public InitParamServlet() {
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.supportEmail = config.getInitParameter("emailSupport");
        System.out.println("Servlet InitParam start!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.print("<html>");
        outputStream.print("<head><title>Init Param</title></head>");
        outputStream.print("<body>");
        outputStream.print("<h4>Init Param</h4>");
        outputStream.print("<p> email-support => " + this.supportEmail + "</p>");
        outputStream.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

}
