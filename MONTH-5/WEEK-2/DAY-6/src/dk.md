# Bit Manipulation, XOR & Bit Masks — Daily Knowledge

> MONTH-5 · WEEK-2 · DAY-6 | Daily learning journal

## 1. Core Knowledge
- `x & 1` checks odd; `x & (1<<k)` tests bit k; `x | (1<<k)` sets; `x & ~(1<<k)` clears; `x ^ (1<<k)` toggles.
- XOR: x^x=0, x^0=x, commutative/associative; useful for unique-element patterns.
- `1 << k` uses int width; use `1L << k` for long masks; beware sign bit and Java shift rules.
- `n & (n-1)` removes lowest set bit; power of two iff n>0 and `(n&(n-1))==0`.

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
