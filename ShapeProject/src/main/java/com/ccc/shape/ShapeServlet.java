package com.ccc.shape;


import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet class for handling shape-related requests.
 */
@WebServlet("/shape")
public class ShapeServlet extends HttpServlet {

    /**
     * Default constructor.
     */
    public ShapeServlet() {
        super();
    }

    /**
     * Handles the HTTP POST method for shape-related requests.
     *
     * @param request  the HttpServletRequest object
     * @param response the HttpServletResponse object
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve the shape type from the request parameter
        String shapeType = request.getParameter("shapeType");
        Shape shape = null;

        // Process the shape type and create the corresponding shape object
        if (shapeType != null) {
            String shapeName = request.getParameter(shapeType + "Name");

            switch (shapeType) {
                case "circle":
                    // Retrieve the radius parameter and create a Circle object
                    double radius = parseDoubleParameter(request.getParameter("radius"));
                    shape = new Circle(radius, shapeName);
                    break;
                case "triangle":
                    // Retrieve the side parameters and create a Triangle object
                    double sideOne = parseDoubleParameter(request.getParameter("side1"));
                    double sideTwo = parseDoubleParameter(request.getParameter("side2"));
                    double sideThree = parseDoubleParameter(request.getParameter("side3"));
                    shape = new Triangle(sideOne, sideTwo, sideThree, shapeName);
                    break;
                case "rectangle":
                    // Retrieve the length and width parameters and create a Rectangle object
                    double length = parseDoubleParameter(request.getParameter("length"));
                    double width = parseDoubleParameter(request.getParameter("width"));
                    shape = new Rectangle(length, width, shapeName);
                    break;
                case "square":
                    // Retrieve the side parameter and create a Square object (considered as a special case of Rectangle)
                    double side = parseDoubleParameter(request.getParameter("side"));
                    shape = new Rectangle(side, side, shapeName);
                    break;
            }
        }

        // Set the shape object as a request attribute and forward the request to the shapeInfo.jsp
        request.setAttribute("shape", shape);
        request.getRequestDispatcher("shapeInfo.jsp").forward(request, response);
    }

    /**
     * Parses a string parameter into a double value.
     * If the parameter is not a valid double, returns 0.0.
     *
     * @param parameter the string parameter to parse
     * @return the double value of the parameter, or 0.0 if it is not a valid double
     */
    private double parseDoubleParameter(String parameter) {
        double value = 0.0;
        try {
            value = Double.parseDouble(parameter);
        } catch (NumberFormatException e) {
            // Handle invalid input here
            // For example, you could log the error or throw a custom exception
            // depending on how you want to handle the invalid input.
            // Here, we simply print an error message to the console.
            System.err.println("Invalid input for double parameter: " + parameter);
        }
        return value;
    }
}
