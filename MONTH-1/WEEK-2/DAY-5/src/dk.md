# Factorial, Fibonacci, GCD & LCM — Daily Knowledge

> MONTH-1 · WEEK-2 · DAY-5 | Daily learning journal

## 1. Core Knowledge
- Factorial: `n! = n × (n-1)!`, with `0! = 1`; values grow quickly (long overflows after 20!).
- Fibonacci: `F0=0, F1=1`; iterative two-variable update is O(n) time, O(1) space.
- Euclid GCD: `gcd(a,b)=gcd(b,a%b)`; LCM = `|a / gcd(a,b) * b|` (divide first to reduce overflow).
- Handle negative inputs and zero cases explicitly.

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
