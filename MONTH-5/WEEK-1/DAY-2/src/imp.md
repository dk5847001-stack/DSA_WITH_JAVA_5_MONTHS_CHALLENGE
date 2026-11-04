# Longest Common Substring — Important Notes

> Month 5 · Week 1 · Day 2 | Quick revision sheet

## Must Remember
- Longest common substring is contiguous: on match `dp[i][j]=1+dp[i-1][j-1]`; mismatch resets to 0.
- Track maximum over all cells; unlike LCS, do not take max of top/left on mismatch.
- O(nm) time; rolling rows can reduce space to O(min(n,m)).

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
