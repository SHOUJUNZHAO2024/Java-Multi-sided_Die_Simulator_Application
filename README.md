# Java-Multi-sided_Die_Simulator_Application
Developed simple Java game that simulates multi-sided die, generating random values upon each roll

## Overview
This project is a simple **Java Swing GUI application** that simulates a multi-sided die. Users can input the number of sides for the die and roll it to get a random value, mimicking the experience of rolling a physical die.

This project demonstrates the use of **Java Swing** for GUI development, **event handling**, and random number generation using **SecureRandom**. The project is structured in two files:
- `Dice.java`: Implements the logic and user interface for simulating a die.
- `DiceTest.java`: Provides the entry point for the application, launching the GUI using `SwingUtilities.invokeLater()`.

## Features
- **User-defined sides**: Input the number of sides for the die (e.g., 6 for a typical die, or any custom number).
- **Random rolling**: Roll the die to get a random number between 1 and the number of sides.
- **Error handling**: The app validates user input, ensuring the number of sides is a positive integer.

## File Structure
- `Dice.java`: 
    - Implements a `JFrame` with **GridLayout** for arranging the components.
    - Uses `JTextField` to allow the user to input the number of sides.
    - A `JButton` triggers the die roll and displays the result.
    - `SecureRandom` ensures the rolled value is truly random.
    
- `DiceTest.java`: 
    - Contains the `main` method that launches the `Dice` GUI using `SwingUtilities.invokeLater()` for thread safety.

## Technology Stack
- Java 17.0.10 (Java SE 17)
- Java Swing for GUI components
- SecureRandom for random number generation

## How to Run the Application
1. Clone the repository:
    git clone https://github.com/SHOUJUNZHAO2024/Java-Multi-sided_Die_Simulator_Application.git

2. Navigate to the project directory:
    cd Java-Multi-sided_Die_Simulator_Application

3. Compile the code:
    javac zhao/shoujun/assign3/*.java

4. Run the application:
    java zhao.shoujun.assign3.DiceTest

## Demo
- The app starts with an input field where users can specify the number of sides for the die.
- Once the user clicks the **"Roll the die"** button, the app will generate and display a random value between 1 and the input number.

## Learning Objectives
This project highlights:
- Developing desktop applications using Java Swing.
- Working with **event-driven programming** in Java.
- Handling **randomization** and **user input validation**.
- Implementing **clean code principles** and **documentation**.

## Author
**Shoujun Zhao**  