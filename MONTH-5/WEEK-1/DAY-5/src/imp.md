# Matrix Chain Multiplication — Important Notes

> Month 5 · Week 1 · Day 5 | Quick revision sheet

## Must Remember
- Matrix chain DP chooses split k minimizing `dp[i][k]+dp[k+1][j]+p[i-1]*p[k]*p[j]`.
- Fill intervals by increasing length; O(n³) time, O(n²) space.
- Parenthesization changes multiplication count, not final matrix dimensions.

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
