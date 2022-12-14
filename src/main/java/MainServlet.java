//import com.sun.org.slf4j.internal.LoggerFactory;

//import com.sun.org.slf4j.internal.LoggerFactory;

import javax.servlet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
//import java.util.logging.Logger;

@WebServlet(name = "TestServlet", urlPatterns = "/test-servlet")
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
        Product product = new Product(1,"Продукт 1", 4);
        Map<Integer,Product> map = new HashMap<Integer, Product>();
        for (int i=1; i<10; i++)
        {
            map.put(i,new Product(i,"Продукт " + i, 4+i));
        }

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
