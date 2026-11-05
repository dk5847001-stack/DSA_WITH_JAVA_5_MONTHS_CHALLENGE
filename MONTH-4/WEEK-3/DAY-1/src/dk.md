# Dijkstra & PriorityQueue — Daily Knowledge

> MONTH-4 · WEEK-3 · DAY-1

## Knowledge Snapshot
- Dijkstra requires non-negative edge weights; initialize dist[source]=0, others=∞.
- Relax edge u→v when dist[u]+w < dist[v]; use min-priority queue and skip stale entries.
- With adjacency list + binary heap: typically O((V+E) log V); store parent for path reconstruction.

## Reflection
Explain the concept in your own words and connect it to a small Java example.
