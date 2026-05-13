# COS730 – Assignment 2
## From Behavioural Models to Optimised Implementation

This repository contains the implementation for Assignment 2 of COS 730: Software Engineering I at the University of Pretoria.

## Overview

The assignment focuses on analysing, implementing, evaluating, and optimising the behavioural design of an **Intelligent Submission and Review System**. The system models the process of:

- Submitting a research artefact
- Validating submission rules
- Assigning reviewers
- Performing evaluation checks
- Producing a final outcome

The project is divided into two main implementations:

- **Original/** – Baseline implementation based directly on the provided sequence diagram
- **Optimised/** – Refactored implementation with improved responsibility allocation, reduced coupling, improved cohesion, and centralised decision logic

## Assignment Objectives

The assignment investigates key software engineering concepts including:

- Behavioural modelling
- GRASP responsibility assignment principles
- Decision modelling using decision tables
- Sequence diagram optimisation
- Cohesion and coupling analysis
- Design for change
- Separation of concerns
- Empirical comparison of baseline and optimised designs

## Technologies Used

- Java
- Object-oriented design principles
- GitHub for version control

## Repository Structure

```text
COS730-Assignment2/
│
├── Original/
│   ├── Main.java
│   ├── UI.java
│   ├── SubmissionController.java
│   ├── Validator.java
│   ├── Database.java
│   ├── ReviewerManager.java
│   ├── Reviewer.java
│   ├── EvaluationManager.java
│   └── NotificationService.java
│
├── Optimised/
│   ├── Main.java
│   ├── UI.java
│   ├── SubmissionController.java
│   ├── Validator.java
│   ├── SubmissionRepository.java
│   ├── ReviewerManager.java
│   ├── Reviewer.java
│   ├── EvaluationManager.java
│   ├── DecisionTable.java
│   └── NotificationService.java
│
└── README.md
```

## How to Run

Each implementation can be compiled and executed separately from its respective folder.

### Run the Original Implementation

```bash
cd Original
javac *.java
java Main
```

### Run the Optimised Implementation

```bash
cd Optimised
javac *.java
java Main
```

