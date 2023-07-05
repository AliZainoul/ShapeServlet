#!/bin/bash

# The following command enables the following behaviors:
# -e: Exit immediately if any command fails (returns a non-zero exit status)
# -u: Treat unset variables as an error and exit immediately
# -o pipefail: Causes a pipeline to produce a failure return code if any command in the pipeline fails

set -euo pipefail

# Function to print messages in green color
print_green() {
    local message=$1
    echo -e "\033[0;32m[$(date +'%Y-%m-%d %H:%M:%S')] $message\033[0m"
}

# Function to print messages in red color
print_red() {
    local message=$1
    echo -e "\033[0;31m[$(date +'%Y-%m-%d %H:%M:%S')] $message\033[0m"
}

print_green "Cleaning project..."      # Cleaning the project
mvn clean

print_green "Generating project site..."      # Generating project site
mvn site

print_green "Copying index.html to target/site..."      # Copying index.html to target/site
cp ../index.html ./target/site/

print_green "Starting Catalina tests..."      # Starting Catalina tests
catalina start

sleep 1                                     # Sleep for 1 second
print_green "Undeploying existing application..."      # Undeploying existing application
mvn tomcat7:undeploy

print_green "Deploying project to Tomcat..."      # Deploying project to Tomcat
mvn tomcat7:deploy

if [[ $? -eq 0 ]]; then      # Checking the deployment status
    print_green "Deployment successful"      # Deployment successful
else
    print_red "Deployment failed"      # Deployment failed
fi

# print_green "Stopping Catalina tests..."      # Stopping Catalina tests
# catalina stop