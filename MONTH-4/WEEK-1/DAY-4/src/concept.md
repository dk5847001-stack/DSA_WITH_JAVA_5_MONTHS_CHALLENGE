# Depth-First Search (DFS) — Concept Notes

> **Roadmap:** Month 4 · Week 1 · Day 4

## Core Idea
DFS explores deeply using recursion or an explicit stack. For directed cycle detection use recursion-stack/color state; for undirected graphs track parent. O(V+E).

## Important Concepts
- Distinguish vertices, edges, direction, weights, degree, path, and connectivity.
- Choose the representation/data structure based on graph density and required operations.
- Maintain visited/parent/distance/indegree state consistently.
- Use Java arrays, ArrayList adjacency lists, ArrayDeque queues, and clear helper methods.

## Dry Run
1. Draw a graph with a cycle and a disconnected component.
2. Trace queue/stack contents and visited-state changes.
3. Test isolated vertices, self-loops, parallel edges, and directed edges.
4. Explain why each vertex/edge is processed at most the expected number of times.

## Complexity
- Adjacency-list traversal is typically O(V+E).
- Matrix traversal often costs O(V²); matrix storage is O(V²).
- Include visited arrays, queues/stacks, parent arrays, and recursion stack in space analysis.

## Common Mistakes
- Forgetting disconnected components or marking visited too late.
- Applying undirected cycle logic to directed graphs.
- Assuming a topological order exists when the graph contains a cycle.

## Revision Checklist
- [ ] Explain the graph model and representation.
- [ ] Implement the algorithm in Java.
- [ ] Test isolated, disconnected, cyclic, and boundary cases.
- [ ] State time and auxiliary-space complexity.
- [ ] Record one mistake or insight.
