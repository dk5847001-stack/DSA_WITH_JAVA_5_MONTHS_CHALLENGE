# Activity Selection & Interval Scheduling — Important Notes

> Month 3 · Week 3 · Day 2 | Quick revision sheet

## Must Remember
- For maximum non-overlapping activities, sort by finish time and select next activity with start >= lastFinish (for half-open intervals).
- Greedy earliest-finish is optimal; sort O(n log n), scan O(n).
- Clarify whether touching endpoints overlap and whether intervals are closed/open.

## Complexity / Correctness
- State sorting cost, number of recursive branches, maximum depth, and stored output size.
- For tries, let L be word length; operation time is usually O(L).
- Prove greedy choice safety or show why backtracking pruning is valid.

## Common Traps
- Applying a greedy rule without proof or violating problem assumptions.
- Forgetting to undo state, reusing mutable result lists, or mishandling duplicates.
- Confusing prefix existence with a complete word.

## Before Moving On
- [ ] Explain the invariant/proof idea.
- [ ] Implement in Java and dry-run edge cases.
- [ ] State time and auxiliary-space complexity.
