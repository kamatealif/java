## Simple Linear Regression in Java

This project is a command-line application that implements a simple linear regression model from scratch in pure Java. It is designed to find the best-fitting straight line through a set of data points, allowing it to predict future values.

The model is built using the Ordinary Least Squares (OLS) method to calculate the optimal slope (`m`) and y-intercept (`b`) for the regression line.

Features

- Model Training: The `fit()` method trains the model on a given dataset (`X_train`, `y_train`).

- Prediction: The predict() method uses the trained model to predict the outcome for new, unseen data points.

- Interactive: The application prompts the user to enter a value to get a live prediction.

- Self-Contained: No external libraries are required; it runs with a standard Java Development Kit (JDK).

### How to Use

Follow these steps to compile and run the application from your terminal.

Prerequisites
Java Development Kit (JDK) 8 or higher installed on your system.

Both `LinearRegression.java` and` App.java` files in the same directory.

## Step 1: Compile the Code

Open your terminal or command prompt, navigate to the directory where you saved the Java files, and run the following command to compile them. This command will compile both` App.java` and its dependency, `LinearRegression.java`.

```bash
javac App.java
```

This will create two `.class` files: `App.class` and `LinearRegression.class.`

## Step 2: Run the Application

Now, run the main application using the java command:

```bash
java App
```

## Step 3: Interact with the Model

The program will first train the model on its built-in sample data (CGPA vs. LPA). It will then prompt you to provide your own value for which you want a prediction.

Example Session
Here is what you will see when you run the application:

```bash
Training the model...
Model fitted successfully...

Model Parameters:
Slope (m): 0.5623
Intercept (b): -0.8255

Enter a CGPA value to predict the LPA: 8.5
Predicted LPA: 3.95
```

In this example:

The model is trained.

The learned slope (`m`) and intercept (`b`) are printed.

The user is prompted and enters `8.5`.

The model predicts the corresponding LPA (Lakhs Per Annum) as `3.95`.

Code Structure
The project is divided into two main classes:

`LinearRegression.java`
This file contains the core logic for the regression model.

`fitX_train, y_train)`: Calculates the slope and intercept from the training data.

`predict(X_test)`: Predicts `y` values for a given set of `X` values using the formula `y = m\*x + b`.

`getSlope()` & `getIntercept()`: Getter methods to inspect the model's learned parameters.

`getSum()` & `getMean()`: Private helper methods for calculations.

A`pp.java`
This is the main entry point of the application.

- It contains the sample cgpa and lpa datasets.

- It creates an instance of the LinearRegression model.

- It calls the `fit()` method to train the model.

- It uses a `Scanner` to get input from the user and then calls the `predict()` method to show the result.
