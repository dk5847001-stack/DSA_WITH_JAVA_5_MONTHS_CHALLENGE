# Graph + Heap Interview Problems — Important Notes

> Month 5 · Week 3 · Day 5 | Quick revision sheet

## Must Remember
- Use adjacency lists for sparse graphs; BFS/DFS for reachability, priority queue for repeated min/max selection.
- Dijkstra only for non-negative weights; heap entries may be stale—skip when popped distance differs from current dist.
- Know graph traversal O(V+E), heap offer/poll O(log V), and path reconstruction via parent[].

## Interview / Revision Checklist
1. Restate constraints and expected output.
2. Identify pattern and brute-force baseline.
3. Explain optimized invariant or recurrence.
4. Implement readable Java code.
5. Test normal, boundary, duplicate, and adversarial inputs.
6. State time and auxiliary-space complexity.

## Common Traps
- Applying an algorithm without checking preconditions.
- Ignoring duplicate handling, integer overflow, null/empty input, or mutation side effects.
- Giving a Big-O label without explaining the dominant work.

## Before Moving On
- [ ] Solve at least one problem independently.
- [ ] Explain correctness and complexity aloud.
- [ ] Record one mistake and a follow-up re-solve.
