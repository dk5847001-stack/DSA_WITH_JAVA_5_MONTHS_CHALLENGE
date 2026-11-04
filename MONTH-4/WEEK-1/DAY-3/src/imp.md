# Breadth-First Search (BFS) — Important Notes

> Month 4 · Week 1 · Day 3 | Quick revision sheet

## Must Remember
- BFS uses a queue and explores level by level; in unweighted graphs it finds shortest path by edge count.
- Mark visited when enqueuing to avoid duplicate queue entries.
- Adjacency list BFS O(V+E) time, O(V) visited/queue space.

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
