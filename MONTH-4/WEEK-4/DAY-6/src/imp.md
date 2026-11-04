# Knapsack Family Introduction — Important Notes

> Month 4 · Week 4 · Day 6 | Quick revision sheet

## Must Remember
- 0/1 knapsack: each item used at most once; state often `dp[i][capacity]` with skip/take transition.
- Unbounded knapsack allows repeated use; coin change may count combinations or permutations—define which.
- 1D 0/1 capacity loop goes downward; unbounded loop often goes upward.
- DP time commonly O(nW), pseudo-polynomial in capacity W.

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
