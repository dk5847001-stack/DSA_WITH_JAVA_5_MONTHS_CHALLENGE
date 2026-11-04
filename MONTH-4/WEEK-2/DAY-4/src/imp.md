# Disjoint Set Union: Parent & Rank — Important Notes

> Month 4 · Week 2 · Day 4 | Quick revision sheet

## Must Remember
- DSU maintains parent[root]=root; find(x) returns representative; union joins two distinct sets.
- Union by rank/size attaches smaller-depth/smaller-set root below larger root.
- With path compression + union by rank/size, amortized operations are near O(1), O(α(V)).

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
