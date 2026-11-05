# Disjoint Set Union and Kruskal minimum spanning tree — Daily Knowledge

> MONTH-4 · WEEK-1 · DAY-6 | Daily learning journal

## 1. Core Knowledge
- **Purpose:** Disjoint Set Union and Kruskal minimum spanning tree. Identify vertices, edges, direction, weights, and constraints before selecting a graph strategy.
- Choose adjacency lists for sparse graphs and adjacency matrices when dense connectivity or constant-time edge lookup matters.
- Track visited, distance, parent, component, or disjoint-set state deliberately; initialize all state before processing.

## 2. Mental Model
Draw a small graph and trace each operation by hand. Record which vertices or edges are processed and what state changes.

## 3. Practical Workflow
1. Draw a small graph and label vertices and edge weights.
2. Choose a representation and initialize arrays, queues, stacks, heaps, or parent structures.
3. Implement a focused Java method.
4. Dry-run a connected graph, a disconnected graph, and a boundary case.
5. Compare the program output with a manually derived result.

## 4. Important Questions
- Are edges directed or undirected? Can weights be negative?
- How are disconnected vertices, cycles, and parallel edges handled?
- When should a vertex be marked visited or a distance be relaxed?
- What invariant or greedy property justifies the next operation?

## 5. Complexity & Correctness
- Express time in terms of vertices V and edges E; include heap costs where relevant.
- Count auxiliary arrays, queues, stacks, heaps, distance tables, and parent structures.
- Justify correctness using traversal invariants, relaxation properties, DSU component invariants, or the greedy-choice condition.

## 6. Daily Knowledge Check
- [ ] Explain the graph model and algorithm without notes.
- [ ] Implement one Java example from memory.
- [ ] Dry-run at least two graph shapes.
- [ ] Test isolated vertices, disconnected components, and boundary cases.
- [ ] State time and auxiliary-space complexity in V and E.
- [ ] Record one common bug and its prevention.

## 7. One-Line Takeaway
Correct graph solutions depend on the right representation, carefully maintained state, and a justified invariant.
