# Word Search: Trie + DFS — Important Notes

> Month 3 · Week 4 · Day 4 | Quick revision sheet

## Must Remember
- Trie stores dictionary prefixes; DFS explores board neighbors while following trie edges.
- Mark a board cell visited during the current path and restore it on backtrack.
- Prune immediately when trie edge is absent; remove found word/terminal marker if duplicates should not be emitted.
- Complexity depends on board cells, branching factor, word length, and dictionary trie size.

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
