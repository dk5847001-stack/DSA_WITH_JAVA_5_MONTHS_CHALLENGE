# StringBuilder & Mutable Strings — Important Notes

> Month 1 · Week 4 · Day 2 | Quick revision sheet

## Must Remember
- StringBuilder is mutable and efficient for repeated append/insert/delete/reverse operations.
- Common APIs: `append`, `insert`, `delete`, `setCharAt`, `reverse`, `toString`.
- Use `length()` for used characters; capacity may exceed length.
- Repeated concatenation can become O(n²); builder appends are amortized O(1) each.

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
