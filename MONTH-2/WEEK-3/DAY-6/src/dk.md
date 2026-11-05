# Queue, Circular Queue & PriorityQueue — Daily Knowledge

> MONTH-2 · WEEK-3 · DAY-6 | Daily learning journal

## 1. Core Knowledge
- Queue is FIFO: offer at tail, poll at head, peek at front; `ArrayDeque` is a strong default.
- Circular queue uses modulo capacity to wrap indices; track size or reserve a slot to distinguish full/empty.
- PriorityQueue is a min-heap by default; custom Comparator changes priority order.
- Queue operations are typically O(1); PriorityQueue offer/poll O(log n), peek O(1).

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
