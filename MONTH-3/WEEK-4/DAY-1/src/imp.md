# Trie Structure, Nodes & Insert — Important Notes

> Month 3 · Week 4 · Day 1 | Quick revision sheet

## Must Remember
- Trie node maps character → child node and stores an `isEndOfWord` flag.
- Insert a word of length L takes O(L); memory depends on total inserted characters and child-map representation.
- Prefix existence is different from a complete stored word; mark terminal nodes explicitly.

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
