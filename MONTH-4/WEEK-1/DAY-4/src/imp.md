# Depth-First Search (DFS) — Important Notes

> Month 4 · Week 1 · Day 4 | Quick revision sheet

## Must Remember
- DFS explores as deep as possible using recursion or explicit stack.
- Adjacency list traversal O(V+E); recursion stack up to O(V).
- Run DFS from every unvisited vertex to cover disconnected graphs.

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
