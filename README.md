# Java Data Type Checker

This is a simple Java **console application** that checks whether the numbers entered by the user can fit into different **Java primitive integer types**: `byte`, `short`, `int`, and `long`.

---

## 🔍 What It Does

- Takes a number of values from the user as input.
- Tries to convert each value to a `long`.
- Checks if each value fits into:
    - `byte` (8-bit)
    - `short` (16-bit)
    - `int` (32-bit)
    - `long` (64-bit)
- If the value is too large or invalid (e.g. letters), shows a warning message.

---

## 🧪 Example Usage

```
Input:
5
-150
150000
1500000000
213333333333333333333333333333333
-100000000000

Output:
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333 can't be fitted anywhere.
-100000000000 can be fitted in:
* long
```

---

## 📦 Project Structure

```
com/
└── alibiner/
    └── Main.java  // Contains main method and recursive checking logic
```

---

## ▶️ How to Run

1. Open the project in a Java IDE (like IntelliJ or Eclipse).
2. Run the `Main` class.
3. Enter the number of test cases.
4. Enter the values one by one.

---

## 🛠️ Logic Used

- Uses `Long.parseLong()` to check if a number is within the `long` range.
- If conversion fails, the number is too big or invalid.
- Uses constant limits like `Byte.MIN_VALUE`, `Short.MAX_VALUE`, etc. for range checking.

---

## ✅ License

Free to use for learning and practice.

---

## 👨‍💻 Author

**Ali Biner**
