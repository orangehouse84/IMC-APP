/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;
import model.User;
import model.UserList;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/registration.jsp").forward(request, response);
        
         }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // 1. Retrieve registration data from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");

        // 2. (Important!) Validate the data (e.g., check for empty fields, valid age, etc.)

        // 3. Create a new User object 
        User newUser = new User(username, password, name, age, gender); 

        // 4. Store the user data (e.g., in a database or a temporary list)
        // This is where you would typically interact with a database to store the user.
        // For simplicity, let's assume you have a List to store users:
        UserList.getInstance().addUser(newUser);

        // 5. Redirect to a success page or login page
        response.sendRedirect("LoginServlet"); // Redirect to LoginServlet
        }
    }
