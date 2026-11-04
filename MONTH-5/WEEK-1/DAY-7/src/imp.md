# Week 17 Revision & Practice — Important Notes

> Month 5 · Week 1 · Day 7 | Quick revision sheet

## Must Remember
- Rebuild DP state/base/transition/order for 1D DP, knapsack, and graph algorithms from prior week.
- Manually fill a small table before writing code; verify iteration order and complexity.
- Test zero capacity, empty input, and unreachable states.

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
