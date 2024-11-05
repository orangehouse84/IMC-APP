/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;
import model.BMI;


// BMIServlet.java (Servlet to handle user input and store data)


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/BMIServlet")
public class BMIServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double weight = Double.parseDouble(request.getParameter("weight"));
        double height = Double.parseDouble(request.getParameter("height"));

        double bmi = BMI.calculateBMI(weight, height);
        String interpretation = BMI.interpretBMI(bmi);

        // Store data in request attributes
        request.setAttribute("bmi", bmi);
        request.setAttribute("interpretation", interpretation);

        // Forward the request to the JSP page
        request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
        
    }
}

