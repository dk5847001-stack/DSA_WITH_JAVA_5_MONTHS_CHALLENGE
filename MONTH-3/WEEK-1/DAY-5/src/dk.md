# Tree Diameter & Balanced Tree — Daily Knowledge

> MONTH-3 · WEEK-1 · DAY-5

## Knowledge Snapshot
- Tree diameter is the longest path between any two nodes; it may not pass through root.
- Postorder DFS returns subtree height and updates global diameter with leftHeight+rightHeight (edge convention).
- Balanced tree requires subtree heights differ by at most 1 at every node; naive repeated height calculation can be O(n²), return height/status together for O(n).

## Reflection
Explain the concept in your own words and connect it to a small Java example.
