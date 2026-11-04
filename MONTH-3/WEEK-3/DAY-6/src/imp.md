# Combination Sum & N-Queens — Important Notes

> Month 3 · Week 3 · Day 6 | Quick revision sheet

## Must Remember
- Combination Sum explores candidates with remaining target; allowing reuse means recurse with same index, single-use means next index.
- N-Queens: one queen per row; track used columns and diagonals (`r-c`, `r+c`).
- Prune conflicts immediately; backtrack by undoing board/sets.
- Complexity is exponential/backtracking; analyze output size too.

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
