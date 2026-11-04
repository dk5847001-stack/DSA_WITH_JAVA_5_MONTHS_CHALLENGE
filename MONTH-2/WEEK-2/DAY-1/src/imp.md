# Linear Search & Complexity — Important Notes

> Month 2 · Week 2 · Day 1 | Quick revision sheet

## Must Remember
- Scan from start until target found or array ends; works on unsorted data.
- Best case O(1), average/worst O(n); iterative auxiliary space O(1).
- Decide whether to return first index, last index, or all occurrences.
- Empty array returns not-found sentinel (commonly -1).

## Correctness & Complexity
- State the loop/recursive invariant and why each iteration/call makes progress.
- Count recursive calls, loop iterations, and extra buffers/stack frames.
- Check algorithm preconditions before selecting it.

## Common Traps
- Missing base case, non-shrinking recursive state, off-by-one bounds, overflow.
- Binary search on unsorted input; incorrect duplicate boundaries.
- Sorting stability/in-place claims without checking implementation.

## Before Moving On
- [ ] Explain the core invariant and preconditions.
- [ ] Implement from memory in Java.
- [ ] Dry-run edge cases and state time/space complexity.
