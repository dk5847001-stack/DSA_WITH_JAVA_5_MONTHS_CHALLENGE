# 2D Arrays & Matrix Operations — Important Notes

> Month 1 · Week 3 · Day 6 | Quick revision sheet

## Must Remember
- Java 2D arrays are arrays of row arrays; use `matrix.length` for rows and `matrix[r].length` for each row.
- Access with `matrix[row][col]`; nested loops visit R×C cells → O(RC).
- Matrix addition requires equal dimensions; multiplication requires A columns = B rows.
- Jagged arrays are possible; do not assume every row has equal length.

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
