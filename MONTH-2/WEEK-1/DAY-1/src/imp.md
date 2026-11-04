# Big O & Time Complexity — Important Notes

> Month 2 · Week 1 · Day 1 | Quick revision sheet

## Must Remember
- Big O describes asymptotic upper growth; ignore constants and lower-order terms.
- Common order: O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2ⁿ) < O(n!).
- Sequential blocks add; nested loops multiply; halving search space often gives log n.
- Analyze worst case unless best/average is explicitly requested.

## Complexity / Correctness
- Identify dominant operations and count auxiliary storage separately from input.
- State preconditions and explain why the chosen operation/algorithm is valid.
- Prefer the simplest data structure that matches required operations.

## Common Traps
- Reference-vs-value confusion, mutation assumptions, index boundaries, and integer overflow.
- Test empty/minimum, typical, boundary, and invalid inputs.

## Before Moving On
- [ ] Recall the key rules without notes.
- [ ] Implement a short Java example from memory.
- [ ] Explain complexity and test edge cases.
