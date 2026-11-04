# Kahn's Algorithm & Indegree — Important Notes

> Month 4 · Week 2 · Day 3 | Quick revision sheet

## Must Remember
- Compute indegree of every vertex; enqueue all indegree-zero vertices.
- Remove queue front, append to order, decrement outgoing neighbors' indegrees; enqueue when indegree becomes zero.
- If processed count < V, graph contains a cycle; O(V+E) time.

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
