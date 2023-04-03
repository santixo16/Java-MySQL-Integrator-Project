# Java with MySQL-Integrator Project

# Description

This project aims to integrate a Java application with a MySQL database. It features a user-friendly interface that enables you to access a previously created database and perform operations such as adding, updating, and deleting records.

The MySQL database included in this project contains information related to a tech support business, including tables for clients, employees, and physical business information.

# Windows Installation

To install the Integrator Project, follow these steps:

1. Clone the repository to your local machine by running the following command in your command prompt or terminal:

```git clone link``` 

2. Open the project in your preferred IDE. We recommend using Apache NetBeans version 12.5 or later.
3. Download the latest MySQL driver from the following link: https://dev.mysql.com/downloads/connector/j/ 
4. Once you have downloaded the MySQL driver, add the JAR file to your project in Apache NetBeans by following these steps:

-Right-click on the "Libraries" section in the "Projects" view.
-Select "Add JAR/Folder".
-Browse to the location where you saved the MySQL connector JAR file and select it.
-This will configure your project to use the MySQL driver.

#Adding the Database

To add the database that has already been created, follow these steps:

1. Go to the "Database" folder and copy the path of the file 'techcare.sql'.
2. Open <a href="https://www.youtube.com/watch?v=NRPAur8m7M0" target="_blank">XAMPP</a>Control Panel.
3. Start the MySQL service and the Apache service.
4. In the XAMPP Control Panel, click on the "Shell" button.
5. This will open a command prompt. To start the MariaDB service, use the following command:

```mysql -u root -p ``` 

6. It will ask you for the password. As we haven't configured any password, you can just skip that part by hitting the spacebar on your keyboard.
7. Once you are in the MariaDB service, use the following command to use the script of the database:

```SOURCE C:\route_of_the_script\techcare.sql;```

Make sure to replace C:\path_to_script with the actual path to the techcare.sql file.

7. That's it! You should now have a database named "techcare", which is the database that we will be using with our Java app. You can confirm this by using the following command:

```SHOW DATABASES;``` 

Or, you can go to http://localhost/phpmyadmin/index.php in your web browser and check if the "techcare" database is listed in the left-hand side menu.

# Finally, run the project
