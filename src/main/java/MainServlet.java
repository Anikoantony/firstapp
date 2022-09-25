//import com.sun.org.slf4j.internal.LoggerFactory;

//import com.sun.org.slf4j.internal.LoggerFactory;

import javax.servlet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.servlet.annotation.WebServlet;
import java.io.IOException;
//import java.util.logging.Logger;

@WebServlet(name = "TestServlet", urlPatterns = "/testservlet")
public class MainServlet implements Servlet {

    //private static Logger loggerFactory;
    private static Logger logger = LoggerFactory.getLogger(MainServlet.class);
    private transient ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
    this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.getWriter().println("Hello Hello !!!");
        logger.info("it's worked");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
