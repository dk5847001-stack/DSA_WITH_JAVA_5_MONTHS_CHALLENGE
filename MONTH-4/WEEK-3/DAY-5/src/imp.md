# Prim's Minimum Spanning Tree — Important Notes

> Month 4 · Week 3 · Day 5 | Quick revision sheet

## Must Remember
- Prim grows an MST from one start vertex; repeatedly add the minimum edge crossing visited→unvisited.
- Use min-priority queue with adjacency list; skip already-visited/stale entries.
- Typical O(E log V); disconnected graph requires restarting per component for a minimum spanning forest.
- MST minimizes total tree edge weight; it is not a shortest-path tree.

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
