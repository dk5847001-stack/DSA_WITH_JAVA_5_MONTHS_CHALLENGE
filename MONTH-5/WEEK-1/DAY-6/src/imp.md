# Palindromic DP & Grid DP — Important Notes

> Month 5 · Week 1 · Day 6 | Quick revision sheet

## Must Remember
- Interval DP state `dp[l][r]`; shrink interval from shorter to longer lengths.
- Palindrome check: ends equal and inner interval palindrome (with short-length base cases).
- Grid DP defines a state per cell and transitions from allowed predecessors; choose row/column order that satisfies dependencies.
- Confirm obstacles/boundaries and unreachable sentinel handling.

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
