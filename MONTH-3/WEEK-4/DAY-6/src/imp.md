# Backtracking Optimization & Pruning — Important Notes

> Month 3 · Week 4 · Day 6 | Quick revision sheet

## Must Remember
- Prune a branch only when it cannot produce a valid/better solution; invalid pruning loses answers.
- Order choices to find good solutions early; use bounds for branch-and-bound.
- Restore every mutated array/list/set/board after recursion; copy a path when storing output.
- Worst-case search can remain exponential despite pruning.

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
