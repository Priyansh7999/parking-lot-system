# SmartPark – CLI Parking Lot System

## Overview
SmartPark is a Command Line Interface (CLI) based Parking Lot Management System.  
It manages a multi-floor parking facility, supports different vehicle and slot types, assigns parking slots intelligently, and handles vehicle exit with fee calculation.

---

## Problem Statement
Project Challenge: "SmartPark" System
1. The Goal
Design and implement a Command Line Interface (CLI) based Parking Lot system. The system must manage a multi-floor parking facility, handle different vehicle types, assign spots intelligently, and calculate parking fees upon exit.

Constraint: Do not use a Database. Use in-memory data structures (Lists, Maps, Sets). Focus: Object-Oriented Design (OOD), Clean Code, and Git Collaboration.

2. The Problem Scenario
A parking lot has multiple floors. Each floor has a specific capacity of slots. The system needs to support:
Initialization: Create a parking lot with N floors and M slots per floor.
Vehicle Types: Support Trucks, Cars, and Bikes.
Spot Types:
Trucks can only park in Large spots.
Bikes can park in Small spots.
Cars can park in Medium or Large spots.
Parking Strategy: When a vehicle enters, assign the first available spot starting from Floor 1.
Unparking: When a vehicle leaves, release the spot and calculate the fee.

---

## Features
- Admin registration (first-time setup)
- Create parking lot with multiple floors
- Configure number of slots per floor
- Define slot types per floor (Small, Medium, Large)

---

## Vehicle and Slot Rules

| Vehicle Type | Allowed Slot Type |
|--------------|------------------|
| Bike         | Small            |
| Car          | Medium, Large    |
| Truck        | Large            |

---

## Parking Strategy
- Parking slots are assigned starting from **Floor 1**
- The **first available suitable slot** is allocated

---

## User Flows

### 1. Parking Lot Initialization
1. Admin registers
2. Admin enters number of floors
3. Admin enters number of slots per floor
4. Admin defines number of Small, Medium, and Large slots
5. System validates input and initializes the parking lot

---

## Domain Model (Entities)

### User
- Registeration

### ParkingLot
- Acts as the root container
- Holds all floors

### Floor
- Represents a parking floor
- Contains multiple parking slots

### ParkingSlot
- Represents an individual parking slot
- Has a slot type
- Can be occupied or free

---

## Relationships

- One Floor → Many ParkingSlots
- One ParkingSlot → Zero or One Vehicle

---

## How to Run
1. Clone the repository
2. Compile the project
3. Run the `Main` class
4. Follow the CLI instructions

---

## Scope (Phase-wise)

### Phase 1 (Current)
- Admin registration
- Parking lot initialization
- Floor and slot setup

---

## Branching Strategy (GitHub Flow)
- main
- short lived branches - feat/fix/docs/chore

---

## Conclusion
SmartPark is a clean, extensible, and well-structured CLI-based parking lot system designed to demonstrate strong object-oriented design and collaborative development practices.
