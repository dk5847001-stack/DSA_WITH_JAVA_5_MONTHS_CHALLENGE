# DAG & Topological Ordering — Important Notes

> Month 4 · Week 2 · Day 1 | Quick revision sheet

## Must Remember
- DAG = directed acyclic graph; topological order places every u before v for edge u→v.
- A topological ordering exists iff directed graph is acyclic; order may not be unique.
- Use for dependency scheduling and DP on DAGs.

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
