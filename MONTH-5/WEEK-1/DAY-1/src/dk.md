# DP on grids and path constraints — Daily Knowledge

> MONTH-5 · WEEK-1 · DAY-1 | Daily learning journal

## 1. Core Knowledge
- **Focus:** DP on grids and path constraints. Identify the state, input, output, and constraints before choosing an algorithm.
- Define the invariant or recurrence precisely; distinguish what is already known from what must be computed.
- In Java, choose data structures and numeric types that safely represent the required values.

## 2. Mental Model
Model the problem as a sequence of explicit states. For each transition, state its preconditions, effect, and why it preserves correctness. Compare a straightforward solution with the optimized pattern.

## 3. Practical Workflow
1. Write a tiny input and manually calculate the expected result.
2. Define the state and transition / operation in plain language.
3. Implement a clear Java method with meaningful names.
4. Dry-run a normal case, a boundary case, and a tricky edge case.
5. Test and compare the result with the manual trace.

## 4. Important Questions
- What information must be stored to avoid recomputing work?
- What is the invariant, recurrence, or ordering property?
- How do empty input, minimum size, duplicates, and impossible states behave?
- Can memory or repeated work be reduced without changing correctness?

## 5. Complexity & Correctness
- Express runtime in terms of input dimensions and count the dominant operations.
- Separate input storage from auxiliary space; include DP tables, stacks, deques, recursion stack, and temporary arrays.
- Mention best / average / worst cases when they differ.
- Explain why every transition or operation is valid and why all required cases are covered.

## 6. Daily Knowledge Check
- [ ] Explain the pattern without notes.
- [ ] Implement one representative Java problem from memory.
- [ ] Trace at least two test cases step by step.
- [ ] Test a boundary and an edge case.
- [ ] State time and auxiliary-space complexity with justification.
- [ ] Record one common bug and its prevention.

## 7. One-Line Takeaway
Understand the state and invariant first; optimized code follows from a correct model.
