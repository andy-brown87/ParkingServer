# Parking Server

## Summary
Java Spring Server to serve the data from the parking database to the SmartPark App

## Project Information
For more information on the overall project please see the [overview](https://github.com/cemmartin/SmartPark).

## Description
Hibernate Spring Webserver

## Prerequisites
To be able to run the ParkingServer on your machine you need to have the following already installed:
- Java 17
- Spring 3.1.6 with the following enabled in start.spring.io
    - *Spring Web*
    - *Spring Boot DevTools*
    - *Spring Data JPA*
    - *PostgresSQL Driver*
- Intellij

## Installation Notes
1.  Make sure you are in the directory that you have created for the project. 
    `cd SmartPark`
2. Download the repository
    `git clone git@github.com:andy-brown87/ParkingServer.git`
3. Open Intellij and open the ParkingServer Project
4. Open src/main/resources/application.properties and change the datasource username to yours on line 2
5. Start the Application in IntelliJ