# Kruskal's Minimum Spanning Tree — Important Notes

> Month 4 · Week 2 · Day 6 | Quick revision sheet

## Must Remember
- Sort edges ascending by weight; add edge iff endpoints belong to different DSU components.
- Stop after V-1 accepted edges for a connected graph; disconnected input yields a minimum spanning forest.
- Complexity O(E log E) dominated by sorting; DSU work is near-linear.

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
