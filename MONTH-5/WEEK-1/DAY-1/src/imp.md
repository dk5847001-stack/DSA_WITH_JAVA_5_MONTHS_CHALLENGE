# Longest Common Subsequence (LCS) — Important Notes

> Month 5 · Week 1 · Day 1 | Quick revision sheet

## Must Remember
- LCS `dp[i][j]` for prefixes: if chars match, 1+dp[i-1][j-1]; else max(dp[i-1][j],dp[i][j-1]).
- O(nm) time and O(nm) space; rolling rows reduce length-only computation to O(min(n,m)) space.
- Subsequence preserves order but may skip characters; reconstruction needs parent/traceback information.

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
