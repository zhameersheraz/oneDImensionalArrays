# ArraySum

`ArraySum/ArraySum.java`

Reads 5 integers from standard input and prints their sum.

## Input / Output

```
Enter 5 integer numbers:
  numbers[0]: 10
  numbers[1]: 20
  numbers[2]: 30
  numbers[3]: 40
  numbers[4]: 50
Sum: 150
```

## How it works

1. Allocate `int[] numbers = new int[5]`.
2. Read five integers into the array, reprompting on non-numeric input.
3. Walk the array with an enhanced `for` loop and accumulate the sum.
4. Print the result.

## Notes

- Array size is held in a `private static final int SIZE` constant so it is
  easy to change without hunting through code.
- Non-integer input is rejected and the user is reprompted instead of the
  program crashing.