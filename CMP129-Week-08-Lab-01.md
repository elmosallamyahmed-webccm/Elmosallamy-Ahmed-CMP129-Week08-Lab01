CMP 129 – Computer Science II
Week 8 – Lab 1: Basic Exception Handling
Learning Objectives

After completing this lab, students should be able to:

Explain the purpose of exception handling.
Use a try block for code that may cause an exception.
Catch and handle an ArithmeticException.
Use a finally block.
Test a method with valid and invalid inputs.
Interpret the normal flow of an exception-handling program.
Assignment: Safe Division

Create a Java class named:

SimpleExceptionDemo.java

The class must demonstrate basic exception handling when performing integer division.

The safeDivide Method

Create the following method:

public static void safeDivide(int numerator, int denominator)

The method must:

Place the division operation inside a try block.
Divide numerator by denominator.
Print the result when the division is successful.
Catch an ArithmeticException when the denominator is zero.
Print a clear error message when division by zero occurs.
Use a finally block to print:
Division operation is complete.

The message in the finally block must appear whether the division succeeds or fails.

The main Method

Create the main method inside SimpleExceptionDemo.

The method must call safeDivide() at least three times:

Once with two valid positive integers.
Once with a denominator of zero.
Once with another valid set of values, such as a negative numerator.

Example method calls:

safeDivide(20, 4);
safeDivide(15, 0);
safeDivide(-30, 5);
Example Output
Attempting to divide 20 by 4
Result: 5
Division operation is complete.

Attempting to divide 15 by 0
Error: Division by zero is not allowed.
Division operation is complete.

Attempting to divide -30 by 5
Result: -6
Division operation is complete.
General Requirements
Use the exact class name SimpleExceptionDemo.
Use the exact method name and parameters specified.
Use try, catch, and finally.
Catch ArithmeticException specifically.
Do not check whether the denominator is zero with an if statement before performing the division. Allow Java to throw the exception.
Do not leave the catch block empty.
Include clear comments explaining the purpose of each exception-handling block.
Follow standard Java naming and formatting conventions.
Test the method with both valid and invalid inputs.
Ensure the program compiles and runs without errors.
Be prepared to explain how control moves through the try, catch, and finally blocks.
Follow the course AI-use policy.
Record any AI assistance in AI-Use-Report.md.
Required Organization

Keep these files directly in the repository root:

- `CMP129-Week-08-Lab-01.md`
- `AI-Use-Report.md`
- `SimpleExceptionDemo.java`

Do not create or use a `src` folder.


The Java file may initially contain this starter comment:

/*
 * Student Name:
 * Course: CMP 129
 * Week: 8
 * Lab: 1
 * Assignment: Basic Exception Handling
 * Date:
 */
Submission

Students must push:

SimpleExceptionDemo.java
Lab-01/AI-Use-Report.md

Suggested commit message:

Complete basic exception handling lab
