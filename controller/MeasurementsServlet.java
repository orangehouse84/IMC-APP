/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import model.BMIHistory;
import model.BMIHistoryList;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MeasurementsServlet")
public class MeasurementsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get the logged-in username from the session
        String username = (String) request.getSession().getAttribute("username");

        // Retrieve the BMI history for the user (replace with your actual database logic)
        List<BMIHistory> history = BMIHistoryList.getInstance().getHistoryForUser(username); // Example method call

        request.setAttribute("history", history);
        request.getRequestDispatcher("/WEB-INF/measurements.jsp").forward(request, response);
    }
}


