# Subsets & Permutations — Important Notes

> Month 3 · Week 3 · Day 5 | Quick revision sheet

## Must Remember
- Each element has include/exclude choice → up to 2ⁿ subsets.
- Permutations choose an unused element at each depth; n! arrangements for distinct elements.
- Sort + skip equal values at the same recursion depth to avoid duplicate outputs.
- Copy the current path when storing a result; do not store a mutable reference.

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
