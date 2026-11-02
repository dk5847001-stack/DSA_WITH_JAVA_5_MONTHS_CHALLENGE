# DAY 2 — SPACE COMPLEXITY

> **Java DSA Challenge** · MONTH-2 / WEEK-1 / DAY-2  
> **Status:** ✅ Completed  
> **Focus:** Understanding how memory usage grows with input size in Java.

---

## 🎯 Learning Objectives

By the end of this day, you should be able to:

- Explain space complexity and auxiliary space.
- Distinguish input space, auxiliary space, and total space.
- Identify fixed-size and input-dependent memory allocations.
- Explain the basic Stack vs Heap memory model in Java.
- Analyze the space required by 1D and 2D arrays.
- Compare best, average, and worst cases using Linear Search.
- Write Java programs and analyze their time and auxiliary space.

---

## 1. What Is Space Complexity?

**Space Complexity** describes how an algorithm's memory requirement grows as the input size grows.

We commonly express this growth using Big O notation.

Examples:

| Memory usage | Complexity | Meaning |
|---|---|---|
| A fixed number of variables | O(1) | Constant space |
| An additional array of n elements | O(n) | Linear space |
| A matrix with r rows and c columns | O(r × c) | Matrix-sized space |

Remember: We analyze how memory grows, not merely how many variable names appear in the code.

---

## 2. Auxiliary Space

**Auxiliary Space** is the additional memory used by an algorithm, excluding the input storage.

### Example A — Constant auxiliary space

```java
int sum = 0;
for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
}
```

- `arr` is the input array.
- `sum` and `i` are fixed-size extra variables.
- Auxiliary Space: **O(1)**

### Example B — Linear auxiliary space

```java
int[] copy = new int[arr.length];
for (int i = 0; i < arr.length; i++) {
    copy[i] = arr[i];
}
```

- The input array is excluded.
- The new array contains n elements.
- Auxiliary Space: **O(n)**

### Important distinction: reference vs allocated array

```java
int[] temp = new int[arr.length];
```

There is one local reference variable named `temp`, but the statement also allocates an array containing n integer slots.

Therefore, the additional array requires **O(n)** space. Count the allocated memory, not just the number of variables.

A fixed-size allocation such as `new int[100]` is **O(1)** with respect to n, as long as its size always remains 100 and does not depend on the input.

---

## 3. Total Space vs Auxiliary Space

For this day's exercises, use the following convention:

- **Input Space:** Memory occupied by the input data.
- **Auxiliary Space:** Additional memory used, excluding the input.
- **Total Space:** Input storage plus additional allocated storage.

Example: A method receives an input array of n elements and creates another array of n elements.

| Component | Space |
|---|---:|
| Input array | O(n) |
| Additional copy array | O(n) |
| Fixed variables | O(1) |
| Auxiliary Space | **O(n)** |
| Total Space | **O(n)** |

The combined storage is approximately 2n elements plus fixed variables. Big O ignores constant factors, so O(2n) becomes O(n).

**Convention note:** Some problems report output space separately or exclude the output from auxiliary space. Always state what is counted. In our array-copying exercise, the newly created copy array was counted as additional space.

---

## 4. Stack vs Heap — Basic Java Memory Model

This is a simplified model useful for understanding Java programs.

| Stack | Heap |
|---|---|
| Holds method stack frames | Holds objects and arrays |
| Stores local primitive values and local references in a method frame | Stores dynamically created objects and arrays |
| Method calls use stack frames | Objects are allocated in heap memory |
| Frames are removed as method calls finish | Objects are reclaimed by garbage collection when no longer reachable |

### Example

```java
public class MemoryDemo {
    public static void main(String[] args) {
        int age = 20;
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
    }
}
```

In the simplified model:

- `age`: local primitive variable in the main method's stack frame.
- `arr`: local reference in the main method's stack frame.
- `new int[5]`: actual array object in heap memory.

**Golden rule:** A reference variable and the object it refers to are not the same thing.

> JVM implementation details can be more complex; this is the standard beginner-friendly conceptual model.

---

## 5. 1D Array Space Complexity

### In-place reverse — O(1) auxiliary space

```java
int left = 0;
int right = arr.length - 1;

while (left < right) {
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;

    left++;
    right--;
}
```

- Time Complexity: **O(n)**
- Auxiliary Space: **O(1)**
- The original array is modified; no second array is created.

### Reverse using another array — O(n) auxiliary space

```java
int[] reversed = new int[arr.length];

for (int i = 0; i < arr.length; i++) {
    reversed[i] = arr[arr.length - 1 - i];
}
```

- Time Complexity: **O(n)**
- Auxiliary Space: **O(n)**
- A new array of n elements is allocated.

### Comparison

| Approach | Time | Auxiliary Space |
|---|---:|---:|
| In-place reverse | O(n) | O(1) |
| Reverse with new array | O(n) | O(n) |

---

## 6. 2D Array Space Complexity

For a matrix with r rows and c columns:

[
\text{Elements} = r \times c
]

[
\text{Space} = O(r \times c)
]

Example:

```java
int[][] matrix = new int[3][4];
```

- Rows = 3
- Columns = 4
- Integer elements = 3 × 4 = 12
- Matrix storage: **O(3 × 4)** for this allocation; generally **O(r × c)**.

If rows = cols = n (a square matrix), the space becomes **O(n²)**.

For the Day 2 matrix program, the matrix was created inside the program, so we counted its allocation as additional space. If a matrix is supplied as input and excluded by the problem's convention, it is not counted as auxiliary space.

---

## 7. Time Complexity of Iterative Factorial

```java
int fact = 1;

for (int i = 1; i <= n; i++) {
    fact *= i;
}
```

- The loop executes n times.
- Time Complexity: **O(n)**
- Auxiliary Space: **O(1)** because only fixed-size variables are used.

**Java integer limitation:** An `int` can safely store factorials only up to 12!. The value 13! exceeds the `int` range. Use `long` for a larger range or `BigInteger` for arbitrary-precision integer results.

---

## 8. Best, Average, and Worst Case

These describe the number of operations for different input situations.

Example: **Linear Search** in an unsorted array of n elements.

| Case | Situation | Comparisons | Time |
|---|---|---:|---:|
| Best | Target is at the first position | 1 | O(1) |
| Average | Target is equally likely at any position | About (n + 1) / 2 | O(n) |
| Worst | Target is last or absent | n | O(n) |

Remember:

- Best case: most favorable input situation.
- Average case: expected work under a stated input distribution.
- Worst case: maximum work for inputs of the given size.

For the average-case result above, the target is assumed equally likely to be at any of the n positions.

---

## 9. Day 2 Coding Practice

| # | Program | Time Complexity | Auxiliary Space | Result |
|---|---|---:|---:|---:|
| 1 | Reverse array in-place | O(n) | O(1) | 10/10 |
| 2 | Reverse using extra array | O(n) | O(n) | 9.5/10 |
| 3 | Create, input, and print a 2D matrix | O(rows × cols) | O(rows × cols) | 10/10 |
| 4 | Iterative factorial | O(n) | O(1) | 10/10 |
| 5 | Copy one array into another | O(n) | O(n) | 10/10 |
| | **Total** | | | **49.5/50** |

### Key coding observations

- In-place operations can avoid allocating another full array.
- A second array of n elements requires O(n) auxiliary space.
- A newly created r × c matrix requires O(r × c) allocated space.
- A loop with a fixed number of variables generally uses O(1) auxiliary space.

---

## 10. Conceptual Assessment Results

| Assessment | Score |
|---|---:|
| Initial space-complexity questions | 50/50 |
| Auxiliary vs total space check | 30/30 |
| Conceptual test 1 | 30/50 |
| Revision test 2 | 40/50 |

**Revision points identified:**

1. If an additional array of size n is created, auxiliary space is O(n), not O(1).
2. Input storage and additional storage must be distinguished when calculating auxiliary space.
3. For an n × m matrix, count n × m elements.
4. Linear Search average-case complexity is O(n) when each position is equally likely.

---

## 🧠 Quick Revision — Golden Rules

1. Fixed number of extra variables → **O(1)** auxiliary space.
2. Additional array of n elements → **O(n)** auxiliary space.
3. Newly allocated r × c matrix → **O(r × c)** space.
4. In-place reverse → **O(1)** auxiliary space.
5. Reverse or copy into another n-element array → **O(n)** auxiliary space.
6. Count actual allocated memory, not just reference variables.
7. Stack holds method frames; heap holds objects and arrays in the simplified model.
8. Linear Search: best O(1), average O(n), worst O(n).
9. Ignore constant factors in Big O: O(2n) = O(n).
10. Always state whether input and output memory are included.

---

## ✅ Daily Completion Checklist

- [x] Space Complexity understood
- [x] Auxiliary Space understood
- [x] Total Space vs Auxiliary Space revised
- [x] Stack vs Heap basics covered
- [x] 1D and 2D array space analyzed
- [x] Best, Average, and Worst Cases revised
- [x] Five Java coding exercises completed
- [x] Complexity analysis practiced
- [x] Final conceptual revision test completed
- [x] Notes prepared for revision

> **DAY 2 STATUS: COMPLETED ✅**

**Next:** MONTH-2 / WEEK-1 / DAY-3 — follow the roadmap's next scheduled topic. Recursion has intentionally not been introduced in this day's notes.
