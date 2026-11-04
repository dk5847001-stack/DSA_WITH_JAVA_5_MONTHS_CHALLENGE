# Graph Terminology & Graph Types — Important Notes

> Month 4 · Week 1 · Day 1 | Quick revision sheet

## Must Remember
- Graph G=(V,E); directed vs undirected, weighted vs unweighted, simple vs multigraph.
- Degree counts incident edges; path connects vertices; cycle returns to start; connectedness depends on reachability.
- A tree is connected and acyclic; for a tree with V vertices, E=V-1.

## Complexity / Correctness
- With adjacency lists, traversal is O(V+E); matrix scans often O(V²).
- Include visited arrays, queue/stack, recursion stack, and trie storage.
- Mark visited at the correct time and distinguish directed from undirected rules.

## Common Traps
- Forgetting disconnected components or parent-edge handling.
- Using one cycle-detection rule for both directed and undirected graphs.
- Not restoring visited/path state in DFS backtracking.

## Before Moving On
- [ ] Draw and trace a small graph.
- [ ] Implement in Java.
- [ ] Test isolated, disconnected, cyclic, and boundary cases.
