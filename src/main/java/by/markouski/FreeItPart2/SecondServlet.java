package by.markouski.FreeItPart2;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SecondServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.print("<style> div{color:blue;}</style>");

        String name = req.getParameter("username");
        outputStream.print("<br><div>Name => " + name +"</div>");

        String lastUserName = req.getParameter("lastname");
        outputStream.print("<br><div>Last Name => " + lastUserName + "</div>");

        String country = req.getParameter("country");
        outputStream.print("<br><div>Country => " + country + "</div>");

        String email = req.getParameter("email");
        outputStream.print("<br><div>@email => " + email + "</div>");

        String pass = req.getParameter("pass");
        outputStream.print("<br><div>Password => " + pass + "</div>");

        String gender = req.getParameter("gender");
        outputStream.print("<br><div>Gender => " + gender + "</div>");

        outputStream.print("<br><div>Courses :</div><br>");
        String [] courses = req.getParameterValues("courses");
        outputStream.print("<ol>");
        for (String course : courses){
            outputStream.print("<div><li>" + course + "</li></div>");
        }
        outputStream.print("</ol>");
        System.out.println(pass);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
