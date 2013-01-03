package org.emamotor.jboss.as7.jbosslogexample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class LoggerServlet
 */
@WebServlet("/log4j")
public class Log4jServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final Logger LOGGER = Logger.getLogger(Log4jServlet.class);
    
    /**
     * Default constructor.
     */
    public Log4jServlet() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        LOGGER.fatal("System variable myproperty=" + System.getProperty("myproperty"));
        LOGGER.error("System variable myproperty=" + System.getProperty("myproperty"));
        LOGGER.warn("System variable myproperty=" + System.getProperty("myproperty"));
        LOGGER.info("System variable myproperty=" + System.getProperty("myproperty"));
        LOGGER.debug("System variable myproperty=" + System.getProperty("myproperty"));
        LOGGER.trace("System variable myproperty=" + System.getProperty("myproperty"));
        response.getWriter().println("The Servlet just logged.");
        
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

}
