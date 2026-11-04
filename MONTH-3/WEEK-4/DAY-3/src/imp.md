# Word Dictionary & Prefix Problems — Important Notes

> Month 3 · Week 4 · Day 3 | Quick revision sheet

## Must Remember
- Prefix query returns whether path exists; exact-word query also requires end-of-word marker.
- Wildcard search (e.g. '.') branches over children and may cost O(alphabet^L) worst case.
- Use consistent case/character normalization and avoid pruning shared prefixes.

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
