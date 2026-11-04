# Floyd-Warshall All-Pairs Shortest Paths — Important Notes

> Month 4 · Week 3 · Day 4 | Quick revision sheet

## Must Remember
- Floyd-Warshall all-pairs recurrence: `dist[i][j] = min(dist[i][j], dist[i][k]+dist[k][j])` for each intermediate k.
- Initialize diagonal 0, direct edges with minimum weight, absent edges infinity.
- O(V³) time, O(V²) space; beware infinity + value overflow and negative-cycle check `dist[i][i] < 0`.

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
