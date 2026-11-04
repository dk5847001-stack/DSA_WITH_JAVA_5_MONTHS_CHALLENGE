# Recursion Tree, Debugging & Backtracking Preview — Important Notes

> Month 2 · Week 1 · Day 6 | Quick revision sheet

## Must Remember
- A recursion tree visualizes calls and work per level; total work is sum across levels.
- For divide-and-conquer, identify number of subproblems, size reduction, and non-recursive work.
- Trace parameters and return values; watch for repeated subproblems and missing base cases.
- Backtracking preview: choose → recurse → undo choice.

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
