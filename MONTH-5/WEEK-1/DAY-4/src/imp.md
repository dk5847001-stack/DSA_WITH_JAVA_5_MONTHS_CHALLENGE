# Edit Distance — Important Notes

> Month 5 · Week 1 · Day 4 | Quick revision sheet

## Must Remember
- Levenshtein DP prefixes: match → diagonal; mismatch → 1+min(insert, delete, replace).
- Base row/column are prefix lengths; O(nm) time and O(nm) space, rolling rows O(min(n,m)) if only distance needed.
- Carefully define whether operations are insert/delete/replace and their costs.

## Complexity / Correctness
- DP: state count × transition work; optimize memory only after dependency analysis.
- Monotonic stack: amortized O(n) because each item is pushed and popped at most once.
- Include reconstruction arrays/stack and table storage in space analysis.

## Common Traps
- Confusing substring with subsequence; wrong strict/non-strict comparison.
- Incorrect DP base initialization or iteration order.
- Reusing an item in 0/1 knapsack by iterating capacity in the wrong direction.

## Before Moving On
- [ ] Write state/transition or stack invariant from memory.
- [ ] Dry-run a small input.
- [ ] Implement in Java and explain complexity.
