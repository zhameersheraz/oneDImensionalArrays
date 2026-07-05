# ArrayVowelCount

`ArrayVowelCount/ArrayVowelCount.java`

Reads 8 characters from standard input and prints how many of them are
vowels. The check is **case-insensitive** (`a`, `e`, `i`, `o`, `u` and their
uppercase forms).

## Input / Output

```
Enter 8 characters:
  characters[0]: H
  characters[1]: e
  characters[2]: l
  characters[3]: l
  characters[4]: o
  characters[5]: W
  characters[6]: o
  characters[7]: r
Number of vowel elements: 3
```

## How it works

1. Allocate `char[] characters = new char[8]`.
2. For each slot, read the first character of the next token with
   `scanner.next().charAt(0)`.
3. Compare each character against the vowel set using
   `Character.toLowerCase(ch)` so the check is case-insensitive.
4. Increment a counter for every match.
5. Print the final count.

## Notes

- Using `Character.toLowerCase` keeps the comparison to a single list of
  vowels instead of having to spell out every uppercase variant.
- The program reads one character per token, so spaces and newlines both
  work as separators.