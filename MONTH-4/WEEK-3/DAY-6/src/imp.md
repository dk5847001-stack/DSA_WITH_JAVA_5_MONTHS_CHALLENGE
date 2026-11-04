# MST & Shortest-Path Algorithm Comparison — Important Notes

> Month 4 · Week 3 · Day 6 | Quick revision sheet

## Must Remember
- Dijkstra: single-source, non-negative weights. Bellman-Ford: single-source, negative edges + reachable negative-cycle detection.
- Floyd-Warshall: all-pairs, O(V³)/O(V²). Prim/Kruskal: minimum spanning tree, not shortest paths.
- Prim grows one tree; Kruskal sorts edges + DSU; both handle MST for connected undirected weighted graphs.

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
