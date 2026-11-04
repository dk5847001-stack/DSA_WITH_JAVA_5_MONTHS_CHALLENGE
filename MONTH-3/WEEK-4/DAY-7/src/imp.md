# Week 12 Revision & Practice — Important Notes

> Month 3 · Week 4 · Day 7 | Quick revision sheet

## Must Remember
- Review trie insert/search/prefix/delete, word search with DFS, and choose-explore-unchoose.
- Confirm visited marking is undone and trie prefix/end-of-word states are distinct.
- Explain branching factor, depth, pruning correctness, and worst-case cost.

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
