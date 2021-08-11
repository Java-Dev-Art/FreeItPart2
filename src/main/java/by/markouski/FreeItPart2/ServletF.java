package by.markouski.FreeItPart2;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletF extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Servlet init!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.print("<html>");
        outputStream.print("<head><title>My servl</title></head>");
        outputStream.print("<body>");
        outputStream.print("<h1>Hello " + name);
        outputStream.print("</body>");
        outputStream.print("</html>");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Servlet destroy");
    }
}
