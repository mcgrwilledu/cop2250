# Questionaire Assignment

## Instructions

Answer these short questions to reinforce your understanding.

Select the correct answer from the available choices.

## Questions

Suppose that you have created a program with only the following variables.

```
int age = 34;

int weight = 180;

double height = 5.9;
```

Suppose that you also have a method with the following header:

```
public static void calculate(int age, double size)
```

Which of the following method calls are legal?

1. calculate(age, weight);
    - [x] legal.   `takes an integer and a double.`
    - [ ] illegal.

2. calculate(age, height);
    - [x] legal.   `takes an integer and a double.`
    - [ ] illegal.

3. calculate(weight, height);
    - [x] legal.   `takes an integer and a double.`
    - [ ] illegal.

4. calculate(height, age);
    - [ ] legal.
    - [x] illegal. `first argument cannot be a double.`

5. calculate(45.5, 120);
    - [ ] legal.
    - [x] illegal. `first argument cannot be a double.`

6. calculate(12, 120.2);
    - [x] legal.   `takes an integer and a double.`
    - [ ] illegal.

7. calculate(age, size);
    - [ ] legal.
    - [x] illegal. `size is not a variable in the program.`

8. calculate(2, 3);
    - [x] legal.   `takes an integer and an integer than can be promoted to a double.`
    - [ ] illegal.

9. calculate(age);
    - [ ] legal.
    - [x] illegal. `method requires two arguments.`

10. calculate(weight, weight);
    - [x] legal.   `takes an integer and an integer than can be promoted to a double.`
    - [ ] illegal.

