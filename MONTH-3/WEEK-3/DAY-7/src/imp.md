# Week 11 Revision & Practice — Important Notes

> Month 3 · Week 3 · Day 7 | Quick revision sheet

## Must Remember
- Greedy needs a correctness argument; compare fractional vs 0/1 knapsack assumptions.
- Backtracking must restore state; deduplicate subsets/permutations correctly.
- Test empty candidate set, duplicate values, no solution, and multiple solutions.

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
