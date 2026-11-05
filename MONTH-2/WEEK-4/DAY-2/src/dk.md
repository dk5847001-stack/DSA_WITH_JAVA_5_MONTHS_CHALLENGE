# Hashing Patterns: Two Sum & Duplicates — Daily Knowledge

> MONTH-2 · WEEK-4 · DAY-2 | Daily learning journal

## 1. Core Knowledge
- Hashing solution scans once: for each x, check whether target-x was seen, then store x; expected O(n) time, O(n) space.
- Check complement overflow and whether the same element may be used twice.
- Set detects duplicates; map can preserve index/frequency.
- Sorting + two pointers costs O(n log n) and may change original order.

## 2. Why It Matters
This concept strengthens your ability to design, read, debug, and explain Java programs. Focus on the reasoning behind each rule rather than memorizing syntax.

## 3. Practical Application
Create a small Java example. Identify inputs, expected output, state changes, and assumptions. Trace a normal case and a boundary case manually, then compare the trace with the program output.

## 4. Questions to Think About
- What problem does this concept solve?
- When is it appropriate, and when is another approach better?
- Which edge case is easiest to overlook?
- What invariant or rule proves the approach is correct?

## 5. Complexity & Quality
Describe time complexity in terms of input size. Count auxiliary memory separately from input storage; include stack and temporary structures where applicable. Test boundary conditions before considering the task complete.

## 6. Daily Self-Test
- [ ] Explain the core concept without notes.
- [ ] Write a Java example from memory.
- [ ] Dry-run two cases, including one edge case.
- [ ] Identify a common bug and its prevention.
- [ ] Summarize the learning in three sentences.

## Key Takeaway
A concept is mastered when you can explain it, implement it, test its boundaries, and justify its correctness and complexity.
