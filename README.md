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

This section contains the necessary exports for configuring environment variables. Follow the instructions below to set up the exports:

## Exports

```
### BASHRC OR ZSH CONFIGURATION

# Set JAVA_HOME to the default Java installation directory
export JAVA_HOME=$(/usr/libexec/java_home)

# Add OpenJDK 17 binaries to PATH
export PATH="$JAVA_HOME/bin:$PATH"

# Set the maximum and initial heap size for the Java Virtual Machine (JVM) 
# Using the JAVA_OPTS environment variable.
# This command increases the heap size to 4 gigabytes.
export JAVA_OPTS="-Xmx4g -Xms4g"

# Set MAVEN_HOME to the Apache Maven installation directory
export MAVEN_HOME="$HOME/apache-maven-3.8.6"

# Add Maven binaries to PATH
export PATH="$MAVEN_HOME/bin:$PATH"

# Set M2_HOME to the Apache Maven installation directory (Not necessary for standard configuration)
export M2_HOME="$HOME/.m2"

# Set CATALINA_HOME and CATALINA_BASE to the Tomcat libexec directory
# Set CATALINA_HOME to the Tomcat installation directory
export CATALINA_HOME=/usr/local/opt/tomcat/libexec
export CATALINA_BASE=$CATALINA_HOME

# Add CATALINA binaries to PATH
export PATH="$CATALINA_HOME/bin:$PATH"
export PATH="$CATALINA_BASE/bin:$PATH"

# Set TOMCAT_HOME to the same value as CATALINA_HOME
export TOMCAT_HOME=$CATALINA_HOME

# Add TOMCAT binaries to PATH
export PATH="$TOMCAT_HOME/bin:$PATH"

# Add RVM to PATH for scripting. Make sure this is the last PATH variable change.
export PATH="$PATH:$HOME/.rvm/bin"
```
4. Ensure the right configurations for your system (web.xml, pom.xml, settings.xml, tomcat-users.xml).
5. Navigate to the project directory `ShapeProject`.
6. Run `chmod +x tomcat_deploy.sh` to deploy your application.
7. Visit `[WEB_HOST]/ShapeProjectSP.index.jsp` 
(e.g. `[WEB_HOST]/ShapeProjectSP.index.jsp = http://localhost:8080/ShapeProjectSP/index.jsp)`)

Feel free to explore the different shape options, create new shapes, and view detailed information about each shape.

## Contributing

Contributions are welcome! If you encounter any issues or have ideas for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

Made with :heart:
