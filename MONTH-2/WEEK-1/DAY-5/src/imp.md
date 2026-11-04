# Recursive Arrays & Strings — Important Notes

> Month 2 · Week 1 · Day 5 | Quick revision sheet

## Must Remember
- Pass an index or left/right boundaries as recursive state; move toward a base case on every call.
- For reverse/palindrome, compare endpoints then recurse inward; for sum/max, combine current element with recursive result.
- Recursion depth is O(n) in a linear scan; auxiliary stack is O(n).
- Avoid creating a new array/string at every call unless required.

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
