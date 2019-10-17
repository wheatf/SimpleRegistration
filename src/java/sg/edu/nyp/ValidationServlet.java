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
import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author Jimmy
 */
@WebServlet("/validate")
public class ValidationServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmailValidator emailValidator = EmailValidator.getInstance();
        String email = request.getParameter("email");
        
        RequestDispatcher rd;
        if (emailValidator.isValid(email)) {
            rd = request.getRequestDispatcher("/compute");
            rd.forward(request, response);
        } else {
            response.sendRedirect(
                    this.getServletContext().getContextPath());
        }
    }
}
