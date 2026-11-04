# Backtracking & Decision Trees — Important Notes

> Month 3 · Week 3 · Day 4 | Quick revision sheet

## Must Remember
- Backtracking explores a decision tree: choose → explore → unchoose.
- Base case records/returns a solution; constraints prune branches that cannot lead to valid answers.
- Restore mutable state after recursion; exponential worst-case is common.
- Distinguish backtracking from plain recursion: it systematically explores alternatives.

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
