# DoubleSeparationArray

`DoubleSeparationArray/DoubleSeparationArray.java`

Reads 6 doubles from standard input and prints them back out tab-separated,
each formatted to three decimal places.

## Input / Output

```
Enter 6 double values:
  numbers[0]: 1.23456
  numbers[1]: 2.5
  numbers[2]: 3.14159
  numbers[3]: 4.0
  numbers[4]: 5.678
  numbers[5]: 6.0
Array elements:
1.234   2.500   3.142   4.000   5.678   6.000
```

## How it works

1. Allocate `double[] numbers = new double[6]`.
2. Read six doubles into the array, reprompting on bad input.
3. Walk the array once more and print each element with
   `System.out.printf("%.3f\t", numbers[i])`.

## Notes

- `\t` inserts a tab between values for a clean column layout.
- `%.3f` always shows three digits after the decimal point, padding with
  zeros when needed (e.g. `2.5` becomes `2.500`).
- Unlike the other programs, this one is purely read-then-print; there is
  no aggregation.