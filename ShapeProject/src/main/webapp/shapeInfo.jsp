<%@ page import="com.ccc.shape.Shape" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Shape Information</title>
        <style>
            body {
                font-family: Arial, sans-serif;
            }
    
            .container {
                max-width: 500px;
                margin: 0 auto;
                padding: 20px;
                background-color: #f5f5f5;
                border: 1px solid #ddd;
                border-radius: 5px;
            }
    
            h1 {
                text-align: center;
            }
    
            .shape-info {
                margin-top: 30px;
                text-align: center;
            }
    
            .shape-info p {
                margin: 10px 0;
            }
    
            .shape-info .no-info {
                color: #888;
            }
    
            .btn-container {
                text-align: center;
                margin-top: 20px;
            }
    
            .btn {
                padding: 10px 20px;
                background-color: #4CAF50;
                color: #fff;
                border: none;
                border-radius: 3px;
                cursor: pointer;
                font-size: 16px;
            }
        </style>
        <script>
            function createAnotherShape() {
                window.location.href = "index.jsp";
            }

            function goToIndex() {
                window.location.href = "index.jsp";
            }
        </script>
    </head>
    <body>
        <div class="container">
            <h1>Shape Information</h1>

            <div class="shape-info">
                <% 
                    Shape shape = (Shape) request.getAttribute("shape");
                    String shapeInfo = (shape != null) ? shape.__printShape() : null;
                %>

                <% if (shapeInfo != null) { %>
                    <%= "<p><b>Shape Information:</b> " + shapeInfo + "</p>" %>
                <% } else { %>
                    <p class="no-info">No shape information available.</p>
                <% } %>
            </div>

            <div class="btn-container">
                <button class="btn" onclick="createAnotherShape()">Create Another Shape</button>
                <button class="btn" onclick="goToIndex()">Return to Index</button>
            </div>
        </div>
    </body>
</html>

