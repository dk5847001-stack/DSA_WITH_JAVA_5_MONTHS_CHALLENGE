# Kahn's Algorithm & Indegree — Daily Knowledge

> MONTH-4 · WEEK-2 · DAY-3

## Knowledge Snapshot
- Compute indegree of every vertex; enqueue all indegree-zero vertices.
- Remove queue front, append to order, decrement outgoing neighbors' indegrees; enqueue when indegree becomes zero.
- If processed count < V, graph contains a cycle; O(V+E) time.

## Reflection
Explain the concept in your own words and connect it to a small Java example.
