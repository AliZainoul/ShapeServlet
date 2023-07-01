<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Shape Project</title>
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

        form {
            margin-top: 30px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        select,
        input[type="text"] {
            width: 100%;
            padding: 5px;
            margin-bottom: 10px;
        }

        .green-button,
        .blue-button {
            padding: 10px 20px;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            font-size: 16px;
            display: block;
            margin: 10px auto;
        }

        .green-button {
            background-color: #4CAF50;
        }

        .blue-button {
            background-color: #2196F3;
        }
    </style>
    <script>
        function showShapeFields() {
            var shapeType = document.getElementById("shapeType").value;
            var shapeProperties = document.getElementById("shapeProperties");
            var shapeFields = document.getElementsByClassName("shapeFields");

            // Hide all shape fields
            for (var i = 0; i < shapeFields.length; i++) {
                shapeFields[i].style.display = "none";
            }

            // Show shape fields for the selected shape
            var selectedShapeFields = document.getElementsByClassName(shapeType);
            for (var j = 0; j < selectedShapeFields.length; j++) {
                selectedShapeFields[j].style.display = "block";
            }
        }
    </script>
    
</head>
<body>
    <div class="container">
        <h1>Shape Project</h1>

        <form action="shape" method="post">
            <label for="shapeType">Select a shape:</label>
            <select name="shapeType" id="shapeType" onchange="showShapeFields()">
                <option value="" selected disabled>Select Shape</option>
                <option value="circle">Circle</option>
                <option value="triangle">Triangle</option>
                <option value="rectangle">Rectangle</option>
                <option value="square">Square</option>
            </select>

            <div id="shapeProperties">
                <!-- Circle -->
                <div class="circle shapeFields" style="display: none;">
                    <label for="radius">Radius:</label>
                    <input type="text" name="radius">
                    <label for="circleName">Name:</label>
                    <input type="text" name="circleName" placeholder="Enter the name of the circle">
                </div>

                <!-- Triangle -->
                <div class="triangle shapeFields" style="display: none;">
                    <label for="side1">Side 1:</label>
                    <input type="text" name="side1">
                    <label for="side2">Side 2:</label>
                    <input type="text" name="side2">
                    <label for="side3">Side 3:</label>
                    <input type="text" name="side3">
                    <label for="triangleName">Name:</label>
                    <input type="text" name="triangleName" placeholder="Enter the name of the triangle">
                </div>

                <!-- Rectangle -->
                <div class="rectangle shapeFields" style="display: none;">
                    <label for="length">Length:</label>
                    <input type="text" name="length">
                    <label for="width">Width:</label>
                    <input type="text" name="width">
                    <label for="rectangleName">Name:</label>
                    <input type="text" name="rectangleName" placeholder="Enter the name of the rectangle">
                </div>

                <!-- Square -->
                <div class="square shapeFields" style="display: none;">
                    <label for="side">Side:</label>
                    <input type="text" name="side">
                    <label for="squareName">Name:</label>
                    <input type="text" name="squareName" placeholder="Enter the name of the square">
                </div>
            </div>

            <input type="submit" value="Submit" class="green-button">
        </form>

        <!-- Add the button -->
        <a href="http://localhost:8080/ShapeProjectSP/docs/index.html" target="_blank">
            <button class="blue-button">Documentation</button>
        </a>
    </div>
</body>
</html>
