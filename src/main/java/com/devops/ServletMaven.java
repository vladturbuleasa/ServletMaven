package com.devops;

/**
 * Created by vturbuleasa on 2/29/2016.
 */

// Import required java libraries
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class ServletMaven extends HttpServlet {

    private String host;

    public void init() throws ServletException
    {
        // Do required initialization
        try {
            host = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
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
        out.println("<body><center>");
        out.println("<h1>Welcome to the Servlet Testing Center !(Maven)</h1>");
        out.println("<h2>Hostname of my system is : "+host+"</h2>");
        out.println("</center></body>");
        out.println("</html>");
    }

    public void destroy()
    {
        // do nothing.
    }
}