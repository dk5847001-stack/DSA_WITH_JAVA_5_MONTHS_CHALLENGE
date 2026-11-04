# Monotonic Stack & Next Greater Element — Important Notes

> Month 5 · Week 2 · Day 1 | Quick revision sheet

## Must Remember
- Maintain monotonic increasing/decreasing order; pop while current element resolves the top candidate.
- Next greater: pop while `arr[top] < current`; use `<=` if equal values should not block.
- Each index pushed/popped at most once → O(n) time, O(n) stack space.
- Store indices when distance/range boundaries are needed.

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
