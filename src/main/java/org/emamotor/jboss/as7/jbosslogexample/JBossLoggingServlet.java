package org.emamotor.jboss.as7.jbosslogexample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;

/**
 * Servlet implementation class LoggerServlet
 */
@WebServlet("/jboss")
public class JBossLoggingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final Logger LOGGER = Logger.getLogger(JBossLoggingServlet.class);
    
    /**
     * Default constructor.
     */
    public JBossLoggingServlet() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String msg = "System variable myproperty=" + System.getProperty("myproperty");

        LOGGER.fatal(msg);
        LOGGER.error(msg);
        LOGGER.warn(msg);
        LOGGER.info(msg);
        LOGGER.debug(msg);
        LOGGER.trace(msg);
        
        response.getWriter().println("The JBossLoggingServlet just logged.");
        
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

}
