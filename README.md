# ShapeProject

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Build Status](https://img.shields.io/travis/your-username/ShapeProject/main.svg?style=flat-square)](https://travis-ci.org/your-username/ShapeProject)

Welcome to ShapeProject, a Maven-based application for managing different shapes, including circles, rectangles, squares, and triangles.

## Project Structure

- `index.html`: HTML file for the application's index page.
- `pom.xml`: Maven project configuration file.
- `src/main/java/com/ccc/shape`: Java source code directory:
  - `App.java`: Main application class.
  - `Circle.java`: Class representing a circle shape.
  - `Rectangle.java`: Class representing a rectangle shape.
  - `Shape.java`: Abstract base class for shapes.
  - `ShapeServlet.java`: Servlet class for handling shape requests.
  - `Square.java`: Class representing a square shape.
  - `Triangle.java`: Class representing a triangle shape.
- `src/main/webapp`: Web application resources:
  - `WEB-INF/web.xml`: Web application configuration file.
  - `index.jsp`: JSP file for the application's index page.
  - `shapeInfo.jsp`: JSP file for displaying shape information.
- `src/test/java/com/ccc/shape`: Test directory for shape application tests.
- `tomcat_deploy.sh`: Shell script for deploying the application to Tomcat.

## Getting Started

Follow these steps to build and run the shape application:

0. Ensure OpenJDK / Java is installed on your system.
1. Ensure Apache Maven is installed on your system.
2. Ensure Tomcat is installed on your system.
3. Ensure environment variables are set on your system. 
4. Ensure and right configurations are well configured on your system.
5. Navigate to the project directory `ShapeProject`.
6. Run `chmod +x tomcat_deploy.sh` to deploy your application.
7. Visit `[WEB_HOST]/ShapeProjectSP.index.jsp` 
(e.g. `[WEB_HOST]/ShapeProjectSP.index.jsp = http://localhost:8080/ShapeProjectSP/index.jsp)`)

Feel free to explore the different shape options, create new shapes, and view detailed information about each shape.

## Contributing

Contributions are welcome! If you encounter any issues or have ideas for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.