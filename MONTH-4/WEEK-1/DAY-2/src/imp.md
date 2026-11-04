# Adjacency Matrix, List & Java Representation — Important Notes

> Month 4 · Week 1 · Day 2 | Quick revision sheet

## Must Remember
- Adjacency matrix: O(V²) space, O(1) edge test; good for dense graphs.
- Adjacency list: O(V+E) space; efficient neighbor iteration; good for sparse graphs.
- Java: `List<List<Integer>> adj`; add both directions for undirected graphs; use edge objects for weights.

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
