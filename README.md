# Car-Showroom-Management-Java-OOPS
A comprehensive Car Showroom Management System built with Java. This project demonstrates advanced OOP concepts including Inheritance, Interface implementation, and Array Object manipulation to manage Showrooms, Employees, and Car inventories efficiently

*Key Features*
Multi-Showroom Support: Create and manage details for various showroom locations.
Employee Management: Track staff details, departments, and assigned showrooms with unique auto-generated IDs.
Vehicle Inventory: Maintain a database of cars including specifications like fuel type, price, transmission, and body type.
Relational Structure: Demonstrates how different entities (Cars, Employees, Showrooms) interact within a single ecosystem.

*OOP Concepts Applied*
This project focuses on the core pillars of Object-Oriented Programming:
Inheritance: The Cars and Employees classes inherit properties from the Showroom class to maintain organizational context.
Interfaces: Implementation of a utility interface to enforce standard behavior across all classes.
Polymorphism: Method overriding of interface methods to provide specific functionality for different entities.
Abstraction: Using interfaces to define a contract for system modules.
Object Arrays: Managing collections of objects using arrays to store system data.

*System Architecture*
utility (Interface): Defines the required methods (get_details, set_details) for any manageable entity.
Showroom (Parent Class): Stores base information about dealership locations.
Employees (Child Class): Extends Showroom to link staff to specific locations.
Cars (Child Class): Extends Showroom to manage vehicle stock.
Main (Driver Class): Features a menu-driven interface to navigate the system.
