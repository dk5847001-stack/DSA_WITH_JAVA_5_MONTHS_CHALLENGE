# Word Search: Trie + DFS — Daily Knowledge

> MONTH-3 · WEEK-4 · DAY-4

## Knowledge Snapshot
- Trie stores dictionary prefixes; DFS explores board neighbors while following trie edges.
- Mark a board cell visited during the current path and restore it on backtrack.
- Prune immediately when trie edge is absent; remove found word/terminal marker if duplicates should not be emitted.

## Reflection
Explain the concept in your own words and connect it to a small Java example.
