package com.devops;

/**
 * Created by vturbuleasa on 2/29/2016.
 */

// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class ServletMaven extends HttpServlet {

    private String message;

    public void init() throws ServletException
    {
        // Do required initialization
        message = "Test Server";
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {


        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Endava DevOps</title>");
        out.println("</head>");
        out.println("<body><center><h1>");
        out.println("Welcome to the Servlet Testing Center !(Maven)");
        out.println("</h1></center></body>");
        out.println("</html>");
    }

    public void destroy()
    {
        // do nothing.
    }
}