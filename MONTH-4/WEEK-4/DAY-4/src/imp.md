# DP Space Optimization — Important Notes

> Month 4 · Week 4 · Day 4 | Quick revision sheet

## Must Remember
- Reduce a DP table only after determining which previous states are needed.
- Rolling arrays/variables can lower O(nm) to O(m) or O(1), but update order must preserve old dependencies.
- For 0/1 knapsack, iterate capacity backward in 1D to prevent reusing the same item.

## Complexity / Correctness
- For graph algorithms, count edge relaxations, sorting, and heap operations.
- For DP, count distinct states and work per transition.
- Separate table/cache space from recursion stack and input storage.

## Common Traps
- Using an algorithm outside its weight/graph assumptions.
- Confusing MST with shortest path.
- Missing DP base cases, wrong iteration order, or unsafe space optimization.

## Before Moving On
- [ ] State preconditions or DP state clearly.
- [ ] Dry-run a small example/table.
- [ ] Implement in Java and justify complexity.
