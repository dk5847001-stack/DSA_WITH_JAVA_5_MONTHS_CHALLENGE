# Nested Loops & Pattern Printing — Important Notes

> Month 1 · Week 2 · Day 6 | Quick revision sheet

## Must Remember
- Nested loops: total work is the sum of inner iterations; n×n loops are O(n²), triangular loops often O(n²).
- Pattern rows/columns should be derived from loop bounds; keep row and column variables distinct.
- Avoid printing extra spaces/newlines; dry-run first and last row.
- Space is O(1) if output is streamed rather than stored.

## Complexity / Correctness
- Identify dominant operations; nested traversals and sorting affect the final bound.
- Distinguish input storage from auxiliary space.
- Explain the invariant or mathematical reason the algorithm is correct.

## Common Traps
- Off-by-one indices, wrong initialization, integer overflow, duplicate handling, and missing edge cases.
- Test empty/minimum, typical, boundary, and adversarial inputs.

## Before Moving On
- [ ] Explain the key points without notes.
- [ ] Implement one Java solution from memory.
- [ ] Dry-run at least two edge cases.
