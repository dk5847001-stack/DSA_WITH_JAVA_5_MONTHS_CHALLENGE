# Recursive State-Space Problems — Important Notes

> Month 3 · Week 4 · Day 5 | Quick revision sheet

## Must Remember
- Model each partial solution as a state and each legal choice as an edge in a search tree.
- Define state, choices, constraints, goal/base case, and undo operation explicitly.
- Avoid revisiting equivalent states where possible; memoization may help when subproblems repeat.

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
