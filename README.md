# oneDImensionalArrays

Java console exercises for the **one-dimensional arrays** lab. Five small programs, one per
algorithm: read or build an array, then do something with it.

> **Note:** the repository name `oneDImensionalArrays` keeps the original capitalization from
> the first commit. The Java classes inside follow standard PascalCase naming.

---

## Repository Layout

| Folder                                  | What it does                                       | Entry class                  |
| --------------------------------------- | -------------------------------------------------- | ---------------------------- |
| `ArraySum/`                             | Sum of N user-entered integers                     | `ArraySum`                   |
| `ArrayVowelCount/`                      | Count vowels across N user-entered characters      | `ArrayVowelCount`            |
| `AverageOfFloatingPointNumbers/`        | Mean of N user-entered doubles                     | `AverageOfFloatingPointNumbers` |
| `DoubleSeparationArray/`                | Read and pretty-print N doubles                    | `DoubleSeparationArray`      |
| `IntegerArray/`                         | Print a hard-coded integer array                   | `IntegerArray`               |

Each folder has its own `README.md` covering input/output for that program. Higher-level notes
are under `docs/`.

---

## Prerequisites

- **JDK 8 or newer** (JDK 17+ recommended)
  - Verify with `java -version` and `javac -version`

No external libraries. Pure JDK.

---

## How to Run

Pick any program and run it directly:

```bash
cd ArraySum
javac ArraySum.java
java ArraySum
```

```bash
cd ArrayVowelCount
javac ArrayVowelCount.java
java ArrayVowelCount
```

```bash
cd IntegerArray
javac IntegerArray.java
java IntegerArray
```

---

## Documentation

- [ArraySum](docs/array-sum.md)
- [ArrayVowelCount](docs/array-vowel-count.md)
- [AverageOfFloatingPointNumbers](docs/average-of-floating-point-numbers.md)
- [DoubleSeparationArray](docs/double-separation-array.md)
- [IntegerArray](docs/integer-array.md)

---

## Concepts Covered

- Declaring and instantiating fixed-size arrays (`new int[SIZE]`, `new double[SIZE]`)
- Populating arrays with `Scanner` input
- Iterating with `for` and enhanced `for` (`for-each`)
- Aggregations: `sum`, `count`, `average`
- Character classification and case-insensitive comparison (`Character.toLowerCase`)
- `printf` formatting (`%.2f`, `%.3f`, `\t`)
- Hard-coded (literal) arrays vs. user-populated arrays
- Input validation with `Scanner.hasNextInt` / `Scanner.hasNextDouble`

---

## License

Released under the [MIT License](LICENSE).

---

## Author

**zhameersheraz** — Discrete Structures 2 coursework