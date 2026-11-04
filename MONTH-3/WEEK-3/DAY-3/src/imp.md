# Fractional Knapsack & Job Sequencing — Important Notes

> Month 3 · Week 3 · Day 3 | Quick revision sheet

## Must Remember
- Fractional knapsack: sort by value/weight descending; take full items then a fraction of next. Greedy is optimal because fractions are allowed.
- 0/1 knapsack does NOT generally use this greedy ratio rule; use DP/other methods.
- Job sequencing with deadlines often sorts profit descending and schedules each job in latest free slot; verify unit-time assumptions.

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
