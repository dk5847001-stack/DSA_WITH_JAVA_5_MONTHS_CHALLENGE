# Recursive Binary Search & Occurrences — Important Notes

> Month 2 · Week 2 · Day 3 | Quick revision sheet

## Must Remember
- Binary search requires sorted data (or a monotonic predicate); each step halves the candidate interval.
- Use `mid = low + (high-low)/2` to avoid overflow; loop while `low <= high` for exact-match search.
- Time O(log n), iterative extra space O(1); recursive version uses O(log n) stack.
- Duplicates require boundary searches for first/last occurrence.

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
