# Bellman-Ford & Negative Edges — Important Notes

> Month 4 · Week 3 · Day 3 | Quick revision sheet

## Must Remember
- Bellman-Ford supports negative edge weights; initialize source 0 and others infinity.
- Relax every edge V-1 times; one more successful relaxation means a reachable negative cycle.
- Complexity O(VE); can stop early if an iteration makes no changes.
- Unreachable negative cycles are not detected from a single source unless separately handled.

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
