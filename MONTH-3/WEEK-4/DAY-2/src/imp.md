# Trie Search, Prefix Search & Delete — Important Notes

> Month 3 · Week 4 · Day 2 | Quick revision sheet

## Must Remember
- Search/prefix search walk one edge per character: O(L) time.
- Delete must unmark terminal state and prune only nodes with no children and not terminal.
- A word can be a prefix of another; deleting the shorter word must preserve longer word.

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
