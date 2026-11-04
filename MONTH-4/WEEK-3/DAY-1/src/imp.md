# Dijkstra & PriorityQueue — Important Notes

> Month 4 · Week 3 · Day 1 | Quick revision sheet

## Must Remember
- Dijkstra requires non-negative edge weights; initialize dist[source]=0, others=∞.
- Relax edge u→v when dist[u]+w < dist[v]; use min-priority queue and skip stale entries.
- With adjacency list + binary heap: typically O((V+E) log V); store parent for path reconstruction.
- Use long for distances when sums may overflow int.

## Complexity / Correctness
- Adjacency-list traversal/topological sort: O(V+E).
- DSU with compression/rank: amortized O(α(V)) per operation.
- Kruskal sorting: O(E log E); Dijkstra heap-based bound depends on representation.
- Count parent/dist/indegree/visited arrays and queue/heap storage.

## Common Traps
- Topological sort on cyclic graph; forgetting cycle check.
- Incorrect indegree updates or unioning non-root nodes incorrectly.
- Dijkstra with negative edges or failure to skip stale queue entries.

## Before Moving On
- [ ] State preconditions and invariant.
- [ ] Dry-run a graph by hand.
- [ ] Implement in Java and explain complexity.
