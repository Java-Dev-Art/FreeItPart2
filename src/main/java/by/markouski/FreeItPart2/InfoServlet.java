package by.markouski.FreeItPart2;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/other/info")
public class InfoServlet extends HttpServlet {
    private static final long serialVersion = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.print("<style> span {color:green;} </style>");

        String requestURL = req.getRequestURL().toString();
        outputStream.print("<br><span>Request URL : </span>");
        outputStream.print(requestURL);

        String requestURI = req.getRequestURI();
        outputStream.print("<br><span>Request URI : </span>");
        outputStream.print(requestURI);

        String contextPath = req.getContextPath();
        outputStream.print("<br><span>Context Path : </span>");
        outputStream.print(contextPath);

        String servletPath = req.getServletPath();
        outputStream.print("<br><span>Servlet Path : </span>");
        outputStream.print(servletPath);

        String queryString = req.getQueryString();
        outputStream.print("<br><span>Query String : </span>");
        outputStream.print(queryString);

        String param1 = req.getParameter("text1");
        outputStream.print("<br><span>Param1 : </span>");
        outputStream.print(param1);

        String param2 = req.getParameter("text2");
        outputStream.print("<br><span>Param2 : </span>");
        outputStream.print(param2);

        outputStream.print("<br><br><b>Server Info :</b>");

        String serverName = req.getServerName();
        outputStream.print("<br><span>Server Name : </span>");
        outputStream.print(serverName);

        int serverPort = req.getServerPort();
        outputStream.print("<br><span>Server Port : </span>");
        outputStream.print(serverPort);

        outputStream.print("<br><br><b>Client Info :</b>");

        String remoteAddr = req.getRemoteAddr();
        outputStream.print("<br><span>Remote Addr : </span>");
        outputStream.print(remoteAddr);

        String remoteHost = req.getRemoteHost();
        outputStream.print("<br><span>Remote Host : </span>");
        outputStream.print(remoteHost);

        int remotePort = req.getRemotePort();
        outputStream.print("<br><span>Remote Port : </span>");
        outputStream.print(remotePort);

        String remoteUser = req.getRemoteUser();
        outputStream.print("<br><span>Remote User : </span>");
        outputStream.print(remoteUser);

        outputStream.print("<br><br><b>Headers :</b>");

        Enumeration<String> headers = req.getHeaderNames();
        while (headers.hasMoreElements()){
            String header = headers.nextElement();
            outputStream.print("<br><span>" + header + "</span>" + req.getHeader(header));
        }

        outputStream.print("<br><br><b>Servlet Context :</b>");
        ServletContext servletContext = req.getServletContext();

        String realPath = servletContext.getRealPath("");
        outputStream.print("<br><span>Real Path : </span>");
        outputStream.print(realPath);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
