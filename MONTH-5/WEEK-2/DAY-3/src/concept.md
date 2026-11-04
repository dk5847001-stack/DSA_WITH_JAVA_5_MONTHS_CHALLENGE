# Monotonic Queue & Sliding Window Maximum — Concept Notes

> **Roadmap:** Month 5 · Week 2 · Day 3

## Core Idea
Store indices in a decreasing deque for sliding maximum. Remove expired front indices and dominated back values; each index enters/leaves once, O(n).

## Important Concepts
- Identify the state/invariant and what each stored value or index represents.
- Define strict versus non-strict comparisons and inclusive versus exclusive boundaries.
- Prefer incremental updates over recomputing an entire range/window.
- Use safe arithmetic and explicit Java types for products, distances, and bit operations.

## Dry Run
1. Use a small input with duplicates and boundary values.
2. Trace stack/deque contents, DP cells, search boundaries, or prefix values after each step.
3. Check empty input, one item, all-equal values, and maximum constraints.
4. Compare the final result against a manual calculation.

## Complexity
- Count each index/element's pushes and pops, DP states, or binary-search iterations.
- Include auxiliary stack/deque/table memory.
- Explain why each element is processed a bounded number of times.

## Common Mistakes
- Wrong comparison strictness, stale indices, off-by-one range boundaries, overflow.
- Assuming a predicate is monotonic without proof.
- Confusing contiguous substring/subarray with subsequence.

## Revision Checklist
- [ ] Explain the invariant/state in one or two sentences.
- [ ] Implement the technique in Java.
- [ ] Dry-run at least three edge cases.
- [ ] Explain time and auxiliary-space complexity.
- [ ] Record one tricky boundary or mistake.
