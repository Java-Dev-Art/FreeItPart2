package by.markouski.FreeItPart2;


import sun.security.pkcs11.wrapper.Constants;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class FilterServlet implements Filter {
    private static final String name = "admin";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init filter!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletRequest req2 = (HttpServletRequest)servletRequest;
        RequestDispatcher dispatcher = req2.getRequestDispatcher("/forward");
        String username = req.getParameter("username");
        if (username.equals(name)){
            filterChain.doFilter(servletRequest, servletResponse);
        }else {
           dispatcher.forward(servletRequest, servletResponse);
        }
    }
    @Override
    public void destroy() {
        System.out.println("Destroy filter!");
    }

}
