# 1D Arrays: Declaration & Traversal — Important Notes

> Month 1 · Week 3 · Day 3 | Quick revision sheet

## Must Remember
- Arrays are fixed-size, zero-indexed; valid indices are `0..length-1`.
- Traversal: enhanced for-loop for values; indexed loop when position/update is needed.
- Array reference may be null; default numeric elements are zero.
- One full traversal is O(n) time; array storage is O(n), extra traversal space O(1).

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
