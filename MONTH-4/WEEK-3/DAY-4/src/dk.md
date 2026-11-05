# Floyd-Warshall All-Pairs Shortest Paths — Daily Knowledge

> MONTH-4 · WEEK-3 · DAY-4

## Knowledge Snapshot
- Floyd-Warshall all-pairs recurrence: `dist[i][j] = min(dist[i][j], dist[i][k]+dist[k][j])` for each intermediate k.
- Initialize diagonal 0, direct edges with minimum weight, absent edges infinity.
- O(V³) time, O(V²) space; beware infinity + value overflow and negative-cycle check `dist[i][i] < 0`.

## Reflection
Explain the concept in your own words and connect it to a small Java example.
