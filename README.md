﻿# Maze-Game-Using-Java

# Java Project Setup Guide

## Overview

This project is a Java application that can be developed and run using either Visual Studio Code (VS Code) or Eclipse. This README provides instructions for setting up and using the project in both IDEs.

## Prerequisites

- **Java Development Kit (JDK)**: Make sure you have the JDK installed. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html) or use OpenJDK.

- **IDE Installation**:
  - [Visual Studio Code](https://code.visualstudio.com/)
  - [Eclipse IDE](https://www.eclipse.org/downloads/)

## Setting Up in Visual Studio Code (VS Code)

1. **Install Java Extensions**:
   - Open VS Code.
   - Go to the Extensions view by clicking the square icon in the Activity Bar or pressing `Ctrl+Shift+X`.
   - Search for and install the following extensions:
     - **Java Extension Pack** (includes Language Support for Java by Red Hat, Maven for Java, Java Test Runner, and more)
     - **Debugger for Java** (optional, for debugging support)

2. **Open the Project**:
   - Open VS Code.
   - Go to `File` > `Open Folder...` and select your project's root directory.

3. **Configure Build and Run**:
   - Create a `.vscode` directory in your project's root if it does not already exist.
   - Inside `.vscode`, create a `launch.json` file for debugging and a `tasks.json` file for build tasks.

4. **Sample `launch.json`**:
   ```json
   {
     "version": "0.2.0",
     "configurations": [
       {
         "type": "java",
         "name": "Launch Java Program",
         "request": "launch",
         "mainClass": "com.example.Main", // Update with your main class
         "projectName": "your-project-name"
       }
     ]
   }

5. **Sample `task.json`**:
   ```json
   {
    "version": "2.0.0",
    "tasks": [
        {
        "label": "build",
        "type": "shell",
        "command": "javac",
        "args": [
          "-d",
          "bin",
          "src/**/*.java"
        ],
        "group": {
          "kind": "build",
          "isDefault": true
        },
        "problemMatcher": ["$javac"]
      }
    ]
   }
