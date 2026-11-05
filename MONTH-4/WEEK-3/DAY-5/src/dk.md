# Prim's Minimum Spanning Tree — Daily Knowledge

> MONTH-4 · WEEK-3 · DAY-5 | Daily learning journal

## 1. Core Knowledge
- Prim grows an MST from one start vertex; repeatedly add the minimum edge crossing visited→unvisited.
- Use min-priority queue with adjacency list; skip already-visited/stale entries.
- Typical O(E log V); disconnected graph requires restarting per component for a minimum spanning forest.
- MST minimizes total tree edge weight; it is not a shortest-path tree.

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
