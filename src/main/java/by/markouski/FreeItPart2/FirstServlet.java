package by.markouski.FreeItPart2;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/first")
public class FirstServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
//        super.init();
        System.out.println("First Servlet Start");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Integer counter = (Integer) session.getAttribute("visitCounter");
        if (counter == null){
            counter = 1;
        }else {
            counter++;
        }

        session.setAttribute("visitCounter",counter);
        String userName = req.getParameter("user");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
         if (userName == null){
             writer.write("Hello , Anonymous " + "<br>");
         }else {
             writer.write("Hello , " + userName + "<br>");
         }
         writer.write("Page was visited " + counter + "times.");
         writer.close();
    }

    @Override
    public void destroy() {
//        super.destroy();
        System.out.println("First Servlet Was Destroy");
    }
}

