# Array Min/Max, Sum, Frequency & Searching — Important Notes

> Month 1 · Week 3 · Day 4 | Quick revision sheet

## Must Remember
- Initialize min/max from the first element, not an arbitrary zero (unless constraints guarantee sign).
- Sum uses a wider type if values may overflow int; frequency map/count array depends on value range.
- Linear search O(n); expected HashMap/HashSet lookup O(1).
- Empty arrays need explicit handling.

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
