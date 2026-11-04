# Graph Cycle Detection — Important Notes

> Month 4 · Week 1 · Day 6 | Quick revision sheet

## Must Remember
- Undirected DFS: ignore the parent edge; a visited neighbor other than parent indicates a cycle.
- Directed DFS: use 3 colors (white/gray/black) or recursion-stack marker; edge to gray means cycle.
- DSU detects undirected cycles while processing edges; self-loops/parallel edges need deliberate handling.

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
