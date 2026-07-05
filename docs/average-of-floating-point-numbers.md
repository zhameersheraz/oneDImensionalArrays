# AverageOfFloatingPointNumbers

`AverageOfFloatingPointNumbers/AverageOfFloatingPointNumbers.java`

Reads 10 doubles from standard input and prints their arithmetic mean
formatted to two decimal places.

## Input / Output

```
Enter 10 floating-point numbers:
  values[0]: 1.5
  values[1]: 2.5
  values[2]: 3.0
  values[3]: 4.0
  values[4]: 5.0
  values[5]: 6.0
  values[6]: 7.0
  values[7]: 8.0
  values[8]: 9.0
  values[9]: 10.0
The average is: 5.60
```

## How it works

1. Allocate `double[] values = new double[10]`.
2. Read ten doubles into the array, reprompting on bad input.
3. Sum every element with an enhanced `for` loop.
4. Divide the sum by the array length to get the average.
5. Print with `System.out.printf("%.2f%n", average)` for two decimal places.

## Notes

- `double` is used instead of `float`. `float` is a reserved keyword in Java,
  and `double` gives more precision with no real downside for this kind of
  exercise.
- `printf("%.2f%n", ...)` prints exactly two digits after the decimal point.