# Greedy Strategy & Choice Proof — Important Notes

> Month 3 · Week 3 · Day 1 | Quick revision sheet

## Must Remember
- Greedy makes a locally optimal choice; correctness needs proof (exchange argument, stays-ahead, or cut property).
- Sort by the criterion justified by the proof; do not assume every optimization problem is greedy-solvable.
- Compare with DP when choices interact or local choices can block a global optimum.

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
