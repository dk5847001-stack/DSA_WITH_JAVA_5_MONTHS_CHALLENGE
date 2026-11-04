# Longest Increasing Subsequence (LIS) — Important Notes

> Month 5 · Week 1 · Day 3 | Quick revision sheet

## Must Remember
- O(n²) DP: `dp[i]=1+max(dp[j])` for j<i and a[j]<a[i].
- O(n log n) tails method maintains smallest tail for each length; binary search finds replacement position.
- Strictly increasing uses lower_bound (first >= x); non-decreasing uses upper_bound (first > x).
- `tails` is not necessarily the actual subsequence; reconstruct with predecessor indices.

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
