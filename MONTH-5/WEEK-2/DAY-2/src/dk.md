# Largest Rectangle in Histogram — Daily Knowledge

> MONTH-5 · WEEK-2 · DAY-2

## Knowledge Snapshot
- For each bar, find nearest smaller bar on left/right using a monotonic increasing stack.
- When popping index mid at i, width = `i - newStackTop - 1`; area = height[mid] × width.
- Add a sentinel/flush remaining stack; use long for area if height×width may overflow.

## Reflection
Explain the concept in your own words and connect it to a small Java example.
