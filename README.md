Call Taxi Booking Application

A Java console-based Call Taxi Booking System designed using **Object-Oriented Programming** and **Layered Architecture (Entity-Service-Main)**.

This project simulates real-time taxi booking with intelligent taxi allocation based on:

* Nearest taxi
* Lowest earnings (tie-breaker)
* Availability based on time

---

Problem Assumptions

* Taxi Count: 4 (Scalable)
* Route Points: A, B, C, D, E, F
* Distance Between Points: 15 km
* Travel Time Between Points: 1 hour
* Charges:

  * ₹100 for first 5 km
  * ₹10 per km after 5 km
  * Initial Position: All taxis start at Point A

---

Booking Allocation Rules

1. Taxi free at pickup point gets priority.
2. If not available, nearest free taxi is allocated.
3. If tie, taxi with lower earnings is allocated.
4. Taxis charge only from pickup to drop.
5. If no taxi available → Booking rejected.

---
Technologies Used

* Java
* OOP Concepts
* Collections (ArrayList)
* Layered Architecture
* Console-based UI

---
Output 
<img width="1408" height="779" alt="image" src="https://github.com/user-attachments/assets/842374c9-6354-4b26-adb9-67d34bf8aef0" />
<img width="1406" height="802" alt="image" src="https://github.com/user-attachments/assets/ca17b7fa-fbe2-4ac6-85ea-7010a8e1cc4d" />
<img width="1386" height="778" alt="image" src="https://github.com/user-attachments/assets/24b0e453-134b-4b36-9e02-ed977a84b419" />


⭐ If you like this project, give it a star!
