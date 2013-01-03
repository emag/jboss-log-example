package org.emamotor.jboss.as7.jbosslogexample;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoggerServlet
 */
@WebServlet("/jul")
public class JulServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final Logger LOGGER = Logger.getLogger(JulServlet.class.getName());
    
    /**
     * Default constructor.
     */
    public JulServlet() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String msg = "System variable myproperty=" + System.getProperty("myproperty");
        
        LOGGER.log(Level.SEVERE,  msg);
        LOGGER.log(Level.WARNING, msg);
        LOGGER.log(Level.INFO,    msg) ;
        LOGGER.log(Level.CONFIG,  msg) ;
        LOGGER.log(Level.FINE,    msg) ;
        LOGGER.log(Level.FINER,   msg) ;
        LOGGER.log(Level.FINEST,  msg) ;

        response.getWriter().println("The JulServlet just logged.");
        
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

}
