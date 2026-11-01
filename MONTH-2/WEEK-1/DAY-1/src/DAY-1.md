# 🚀 MONTH 2 — WEEK 1 — DAY 1
# Time Complexity & Big O Notation

<p align="center">
  <img src="https://img.shields.io/badge/DSA_WITH_JAVA-Month%202-blue?style=for-the-badge" alt="DSA with Java"/>
  <img src="https://img.shields.io/badge/Week-01-purple?style=for-the-badge" alt="Week 1"/>
  <img src="https://img.shields.io/badge/Day-01-orange?style=for-the-badge" alt="Day 1"/>
  <img src="https://img.shields.io/badge/Status-COMPLETED-success?style=for-the-badge" alt="Completed"/>
</p>

<p align="center">
  <b>Learning how to measure algorithm efficiency as input size grows.</b>
</p>

---

## 📊 Learning Progress

| Detail | Information |
|---|---|
| Month | Month 2 |
| Week | Week 1 |
| Day | Day 1 |
| Topic | Time Complexity & Big O |
| Practice Questions | 5 |
| Final Score | **49 / 50** |
| Accuracy | **98%** |
| Status | ✅ Completed |

---

## 🎯 Learning Objectives

By completing this lesson, I learned:

- What time complexity means.
- Why algorithm efficiency matters.
- How to understand Big O notation.
- Difference between constant, logarithmic, linear and quadratic complexity.
- How to analyze single and nested loops.
- How to calculate triangular loop complexity.
- How to analyze multiple independent loops.
- How Binary Search works and why it is efficient.
- How to identify best, average and worst-case complexity.

---

# 1. What is Time Complexity?

**Time Complexity** describes how the number of operations performed by an algorithm grows as the input size increases.

It does not directly measure the actual time in seconds. Instead, it helps us understand how efficiently an algorithm scales.

For example:

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

If `n = 5`, the loop executes 5 times.

If `n = 100`, the loop executes 100 times.

If `n = 1000`, the loop executes 1000 times.

Therefore, the number of operations grows linearly with the input size.

**Time Complexity = O(n)**

---

# 2. What is Big O Notation?

Big O notation describes the upper-bound growth rate of an algorithm, ignoring constant factors and less significant terms.

It helps us compare algorithms independently of machine speed and hardware.

### Common Time Complexities

| Complexity | Name | Example |
|---|---|---|
| O(1) | Constant | Array index access |
| O(log n) | Logarithmic | Binary Search |
| O(n) | Linear | Single loop |
| O(n log n) | Linearithmic | Merge Sort |
| O(n²) | Quadratic | Two nested loops |
| O(2ⁿ) | Exponential | Some recursive problems |

### Complexity Growth

- **O(1):** Operations remain constant.
- **O(log n):** Input is repeatedly divided or reduced.
- **O(n):** Operations grow proportionally to input size.
- **O(n log n):** Linear work combined with logarithmic work.
- **O(n²):** Operations grow approximately as the square of input size.
- **O(2ⁿ):** Operations can double with each additional input element.

---

# 3. Understanding Important Complexities

## A. O(1) — Constant Time

The number of operations does not depend on the input size.

```java
int a = 10;
int b = 20;

int sum = a + b;

System.out.println(sum);
```

Even if the input size changes, these fixed operations remain constant.

**Time Complexity: O(1)**

## B. O(n) — Linear Time

A loop executes once for each input element.

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

For `n = 5`, the loop runs 5 times.

For `n = 100`, the loop runs 100 times.

**Time Complexity: O(n)**

## C. O(log n) — Logarithmic Time

The problem size is repeatedly divided or reduced by a constant factor.

```java
for (int i = 1; i < n; i *= 2) {
    System.out.println(i);
}
```

For `n = 16`, the values of `i` are:

`1 → 2 → 4 → 8`

The loop stops when `i` becomes 16.

**Time Complexity: O(log n)**

## D. O(n²) — Quadratic Time

A nested loop can perform approximately `n × n` operations.

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

For `n = 5`:

`5 × 5 = 25` iterations.

**Time Complexity: O(n²)**

---

# 4. Independent Loops vs Nested Loops

### Independent Loops

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}

for (int j = 0; j < n; j++) {
    System.out.println(j);
}
```

Total operations:

`n + n = 2n`

We ignore constant factors in Big O.

**Time Complexity: O(n)**

### Nested Loops

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

Total operations:

`n × n = n²`

**Time Complexity: O(n²)**

### Important Rule

- Independent loops: Add their complexities.
- Nested loops: Multiply their iteration counts when the loops execute independently for each outer iteration.
- Keep the dominant growth term.

---

# 5. Triangular Nested Loop

Consider this code:

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < i; j++) {
        System.out.println(i + " " + j);
    }
}
```

For `n = 5`:

| Outer Loop (i) | Inner Loop Iterations |
|---|---:|
| 0 | 0 |
| 1 | 1 |
| 2 | 2 |
| 3 | 3 |
| 4 | 4 |
| **Total** | **10** |

Total iterations:

`0 + 1 + 2 + 3 + 4 = 10`

For a general input size:

`0 + 1 + 2 + ... + (n - 1)`

`= n(n - 1) / 2`

After ignoring constants and lower-order terms:

**Time Complexity: O(n²)**

> ⚠️ Important: A triangular nested loop is O(n²), not O(2ⁿ).

---

# 6. Binary Search — O(log n)

Binary Search is an efficient searching algorithm that repeatedly divides a sorted search space into two halves.

**Important:** Binary Search requires a sorted array.

### Java Implementation

```java
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 10;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                System.out.println("Target found at index " + mid);
                return;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Target not found!");
    }
}
```

### Dry Run

Array: `{2, 4, 6, 8, 10, 12}`

Target: `10`

| Step | low | high | mid | arr[mid] | Decision |
|---|---:|---:|---:|---:|---|
| 1 | 0 | 5 | 2 | 6 | Search right |
| 2 | 3 | 5 | 4 | 10 | Target found |

Output:

```text
Target found at index 4
```

### Binary Search Complexity

| Case | Complexity |
|---|---|
| Best Case | O(1) |
| Average Case | O(log n) |
| Worst Case | O(log n) |
| Auxiliary Space (Iterative) | O(1) |

### Common Mistakes

- Applying Binary Search to an unsorted array.
- Writing `low = mid` instead of `low = mid + 1`.
- Writing `high = mid` instead of `high = mid - 1`.
- Using an incorrect loop condition.
- Forgetting to handle the target-not-found case.

---

# 7. Combined Loop Complexity Analysis

Consider three loops:

```java
// Loop 1
for (int i = 0; i < n; i++) {
    System.out.println(i);
}

// Loop 2
for (int i = 1; i < n; i *= 2) {
    System.out.println(i);
}

// Loop 3
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

| Loop | Complexity |
|---|---|
| Loop 1 | O(n) |
| Loop 2 | O(log n) |
| Loop 3 | O(n²) |

Total:

`O(n) + O(log n) + O(n²)`

The dominant term is `O(n²)`.

**Overall Time Complexity: O(n²)**

---

# 8. Important Rules to Remember

| Rule | Example | Result |
|---|---|---|
| Ignore constants | O(2n) | O(n) |
| Ignore lower terms | O(n² + n) | O(n²) |
| Independent loops | O(n) + O(n) | O(n) |
| Nested loops | O(n × n) | O(n²) |
| Halving loop | n → n/2 → n/4 | O(log n) |
| Doubling loop | 1 → 2 → 4 → 8 | O(log n) |
| Triangular loop | 1 + 2 + ... + n | O(n²) |

---

# 9. Day 1 Practice Assessment

| Question | Topic | Score |
|---|---|---:|
| Q1 | Sum from 1 to n using a loop | 10/10 |
| Q2 | Count even numbers in an array | 10/10 |
| Q3 | Print all pairs using nested loops | 10/10 |
| Q4 | Binary Search implementation and complexity | 9/10 |
| Q5 | Combined loop complexity analysis | 10/10 |
| **Total** | | **49/50** |

<p align="center">
  <img src="https://img.shields.io/badge/FINAL_SCORE-49%2F50-success?style=for-the-badge" alt="Final score"/>
  <img src="https://img.shields.io/badge/ACCURACY-98%25-blue?style=for-the-badge" alt="Accuracy"/>
</p>

### What I Learned from My Mistakes

- A triangular nested loop is O(n²), not O(2ⁿ).
- Binary Search has O(log n) average and worst-case time complexity.
- Iterative Binary Search uses O(1) auxiliary space.
- Correct implementation and correct complexity analysis are both important.

---

# 10. Quick Revision Checklist

- [x] Understood Time Complexity.
- [x] Understood Big O notation.
- [x] Learned O(1), O(log n), O(n), O(n log n), O(n²), O(2ⁿ).
- [x] Analyzed single loops.
- [x] Analyzed independent loops.
- [x] Analyzed nested loops.
- [x] Solved triangular loop complexity.
- [x] Implemented Binary Search in Java.
- [x] Performed a Binary Search dry run.
- [x] Analyzed combined loop complexity.
- [x] Completed all 5 practice questions.

---

## 🏆 Day 1 Completed Successfully!

**Final Score: 49/50 (98%)**

> "Writing code is important, but understanding how efficiently it runs is what makes you a better problem solver."

**Next Topic:** Month 2 — Week 1 — Day 2: Space Complexity

---

<p align="center">
  <b>DSA WITH JAVA — 5 MONTHS CHALLENGE</b><br/>
  <sub>Learn • Practice • Analyze • Improve • Master DSA</sub>
</p>