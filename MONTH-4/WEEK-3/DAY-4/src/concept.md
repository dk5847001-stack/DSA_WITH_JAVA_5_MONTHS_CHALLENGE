# Floyd-Warshall All-Pairs Shortest Paths — Concept Notes

> **Roadmap:** Month 4 · Week 3 · Day 4

## Core Idea
Floyd-Warshall computes all-pairs shortest paths with intermediate vertex k: dist[i][j]=min(dist[i][j],dist[i][k]+dist[k][j]); O(V³) time, O(V²) space.

## Important Concepts
- Define graph type, edge-weight constraints, source/target requirements, and expected output.
- Keep distance, parent, visited, component, and priority-queue state consistent.
- Prove why each relaxation/edge selection preserves correctness.
- Use long for path costs when int overflow is possible; represent unreachable distances carefully.

## Dry Run
1. Draw a small weighted graph and initialize all arrays/sets.
2. Trace each selected vertex/edge and every successful relaxation.
3. Test disconnected vertices, equal weights, zero weights, negative edges (if supported), and cycles.
4. Reconstruct a path and verify its total weight.

## Complexity
- Count edge relaxations, sorting, heap operations, and matrix transitions.
- Include distance/parent arrays, DSU arrays, and priority-queue storage.
- State assumptions (connected graph, non-negative weights, dense/sparse representation).

## Common Mistakes
- Using Dijkstra with negative edges.
- Forgetting stale priority-queue entries or negative-cycle checks.
- Confusing a shortest-path tree with a minimum spanning tree.

## Revision Checklist
- [ ] State the algorithm's preconditions.
- [ ] Implement it in Java.
- [ ] Dry-run at least three weighted graph cases.
- [ ] Explain time and auxiliary-space complexity.
- [ ] Compare with the closest alternative.
