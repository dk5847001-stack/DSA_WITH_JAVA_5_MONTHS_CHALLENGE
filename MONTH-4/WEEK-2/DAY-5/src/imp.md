# Path Compression & Union by Rank/Size — Important Notes

> Month 4 · Week 2 · Day 5 | Quick revision sheet

## Must Remember
- Path compression rewrites visited nodes directly to the representative during find.
- Union by rank uses approximate tree height; union by size uses component size.
- Only roots' rank/size values are meaningful after unions; do not compare arbitrary node metadata.

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
