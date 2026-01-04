# Online-Food-Delivery-System (Core Java | OOP | LLD)

## Project Overview
The **Online Food Delivery System** is a **core Java–based low-level design (LLD) project** that simulates the basic workflow of a real-world food delivery application such as Swiggy or Zomato.

The main goal of this project is to demonstrate **Object-Oriented Programming (OOP)** concepts, **SOLID principles**, and **clean layered architecture** without using any frameworks.

This project focuses on **design clarity and extensibility**, not UI or frameworks.

---

## Features
- User places an order from a restaurant
- Restaurant provides a menu with food items
- Order total is calculated automatically
- Payment is processed using different payment strategies
- Order status is updated after payment
- In-memory storage simulates database behavior

---

## Key Concepts Demonstrated
- Object-Oriented Programming (OOP)
- Encapsulation, Abstraction, Polymorphism, Composition
- SOLID Principles
- Strategy Design Pattern (Payment)
- Layered Architecture (Controller, Service, Repository)
- Clean separation of responsibilities

---

## Application Flow
1. User selects food items from a restaurant
2. Order is created and total amount is calculated
3. Payment is processed using a selected payment method
4. Order status is updated to `PAID`
5. Order details are stored in memory

---

## Command to Run
```bash
javac model\*.java payment\*.java service\*.java repository\*.java controller\*.java main\Main.java

java main.Main
