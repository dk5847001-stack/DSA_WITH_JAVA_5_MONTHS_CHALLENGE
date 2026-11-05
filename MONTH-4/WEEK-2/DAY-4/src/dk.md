# Disjoint Set Union: Parent & Rank — Daily Knowledge

> MONTH-4 · WEEK-2 · DAY-4

## Knowledge Snapshot
- DSU maintains parent[root]=root; find(x) returns representative; union joins two distinct sets.
- Union by rank/size attaches smaller-depth/smaller-set root below larger root.
- With path compression + union by rank/size, amortized operations are near O(1), O(α(V)).

## Reflection
Explain the concept in your own words and connect it to a small Java example.
