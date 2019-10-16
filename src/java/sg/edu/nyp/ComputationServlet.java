/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sg.edu.nyp;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jimmy
 */
@WebServlet("/compute")
public class ComputationServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) 
                    throws ServletException, IOException {
        int height = Integer.valueOf(request.getParameter("height"));
        double weight = Double.valueOf(request.getParameter("weight"));
        
        double bmi = 10000 / (double)(height * height) * weight;
        request.setAttribute("bmi", bmi);
        
        RequestDispatcher rd = 
                request.getRequestDispatcher("/results.jsp");
        rd.forward(request, response);
    }
}
