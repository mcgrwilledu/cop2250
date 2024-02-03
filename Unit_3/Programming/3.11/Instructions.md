# Programming Exercise 3.11

## How to Use the Code Editor

1. Select the "Run Code" button to execute the program.
2. Select the "Calculate Grade" button to generate a score based on the completed tasks.
3. Continue to modify, run, and calculate your code until you are happy with the grade.
4. Select the "Submit" button to turn in the assignment to your instructor.

## Book Instructions

Create a class named `BookBilling` that includes three overloaded `computeBill()` methods for the Happy Memories Company, which sells photo books.

* When `computeBill()` receives no parameters, the method computes the price of one photo book at $14.99, adds 8 percent tax, and returns the total due.
* When `computeBill()` receives one parameter, it represents the quantity ordered. Multiply the value by $14.99, add 8 percent tax, and return the total due.
* When `computeBill()` receives two parameters, they represent the quantity ordered and a coupon value. Multiply the quantity by $14.99, reduce the result by the coupon value, add 8 percent tax, and then return the total due.

Write a `main()` method that prompts the user for the number of books ordered, prompts for a coupon value, and tests all three overloaded methods. Save the application as **BookBilling.java**.

## Companion Instructions

Create a class named `BookBilling` that includes three overloaded `computeBill()` methods for the Happy Memories Company, which sells photo books.

* When `computeBill()` receives no parameters, the method computes the price of one photo book at **$14.99**, adds **8** percent tax, and returns the total due.
* When `computeBill()` receives one parameter, it represents the quantity ordered. Multiply the value by **$14.99**, add **8** percent tax, and return the total due.
* When `computeBill()` receives two parameters, they represent the quantity ordered and a coupon value. Multiply the quantity by **$14.99**, reduce the result by the coupon value, add **8** percent tax, and then return the total due.

Write a `main()` method that prompts the user for the number of books ordered, prompts for a coupon value, and tests all three overloaded methods.

An example of the program is shown below:
```
Enter quantity ordered >> 2
Enter coupon value >> 5.00
One book is $16.1892
2 books with no coupon are $32.3784
2 books with a coupon worth $5.0 are $26.9784
```

## Grading Criterion

Tasks

**Task 01:**  Create the `BookBilling` class.
**Task 02:**  The `computeBill()` returns the bill for one book and no coupon.
**Task 03:**  The `computeBill()` returns the bill for multiple books and no coupon.
**Task 04:**  The `computeBill()` returns the bill for multiple books and a coupon.
**Task 05:**  The `BookBilling` program displays 3 bills to the console.
