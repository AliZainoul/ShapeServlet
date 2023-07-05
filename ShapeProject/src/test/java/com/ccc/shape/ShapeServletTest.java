package com.ccc.shape;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class ShapeServletTest {

    @Test
    public void testDoPost() throws ServletException, IOException {
        // Create mock HttpServletRequest and HttpServletResponse objects
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        RequestDispatcher requestDispatcher = Mockito.mock(RequestDispatcher.class);

        // Set the request parameters
        when(request.getParameter("shapeType")).thenReturn("circle");
        when(request.getParameter("radius")).thenReturn("5.0");
        when(request.getParameter("circleName")).thenReturn("My Circle");

        // Mock the getRequestDispatcher() method to return the mock RequestDispatcher
        when(request.getRequestDispatcher("shapeInfo.jsp")).thenReturn(requestDispatcher);

        // Call the doPost() method of the ShapeServlet
        ShapeServlet shapeServlet = new ShapeServlet();
        shapeServlet.doPost(request, response);

        // Verify that the shape object is set as a request attribute
        verify(request).setAttribute(eq("shape"), any(Shape.class));

        // Verify that the forward method is called on the mock RequestDispatcher
        verify(requestDispatcher).forward(request, response);
    }
}
