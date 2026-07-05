# IntegerArray

`IntegerArray/IntegerArray.java`

Demonstrates a hard-coded (literal) integer array. The program does not
read any input -- it just prints the ten preset values.

## Input / Output

```
Integer array elements:
10 20 30 40 50 60 70 80 90 100
```

## How it works

1. Declare and initialize the array inline:
   `int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};`
2. Walk the array with an indexed `for` loop.
3. Print each value followed by a space.

## Notes

- This is the only program in the repo that does not use `Scanner` -- it
  exists to show how a literal array is declared and traversed.
- Changing the printed value (e.g. wrapping each in `[]`) is a quick way to
  verify you understand how the loop visits each element.