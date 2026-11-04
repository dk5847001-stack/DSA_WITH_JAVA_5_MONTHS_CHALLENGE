# DFS-Based Topological Sort — Important Notes

> Month 4 · Week 2 · Day 2 | Quick revision sheet

## Must Remember
- DFS topological sort appends a node after exploring all outgoing neighbors (finish order), then reverses the list.
- Detect back edges with recursion-stack/color state; cyclic graph has no valid topological ordering.
- O(V+E) time and O(V) auxiliary/recursion space.

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
