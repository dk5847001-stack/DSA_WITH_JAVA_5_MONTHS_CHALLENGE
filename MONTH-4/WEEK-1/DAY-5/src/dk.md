# Topological sorting and directed acyclic graphs — Daily Knowledge

> MONTH-4 · WEEK-1 · DAY-5 | Daily learning journal

## 1. Core Knowledge
- **Purpose:** Topological sorting and directed acyclic graphs is a graph algorithm / graph representation topic. Model vertices and edges explicitly, and identify whether edges are directed, weighted, or unweighted.
- Choose adjacency lists for sparse graphs and adjacency matrices when dense connectivity or constant-time edge lookup is important.
- Track visited / distance / parent / component state deliberately; initialize every state before traversal.

## 2. Mental Model
Write the invariant for each data structure. For every processed vertex or edge, explain why the recorded state is valid and what work remains.

## 3. Practical Workflow
1. Draw a small graph and label vertices and edge weights.
2. Decide the representation and initialize required arrays / queues / stacks / sets.
3. Implement the algorithm in a focused Java method.
4. Dry-run a connected case, a disconnected case, and a boundary case.
5. Check the result against a manually derived answer.

## 4. Important Questions
- Does the graph contain directed edges, negative weights, cycles, or disconnected components?
- Can a vertex be visited more than once, and when should it be marked visited?
- Which invariant guarantees that the next processing step is safe?
- What is the effect of isolated vertices and parallel edges?

## 5. Complexity & Correctness
- Express time in terms of vertices V and edges E; state how the chosen representation affects iteration cost.
- Count auxiliary arrays, queues, stacks, heaps, parent structures, and distance tables.
- Explain correctness using traversal invariants, relaxation properties, or the greedy choice condition as applicable.

## 6. Daily Knowledge Check
- [ ] Explain the graph model and algorithm without notes.
- [ ] Implement one Java example from memory.
- [ ] Dry-run at least two different graph shapes.
- [ ] Test disconnected, isolated, and boundary cases.
- [ ] State time and auxiliary-space complexity in V and E.
- [ ] Record one common implementation bug.

## 7. One-Line Takeaway
A graph algorithm is only as correct as its representation, state initialization, and invariant.
