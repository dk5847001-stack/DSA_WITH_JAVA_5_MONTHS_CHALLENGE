# Recursion: Base Case & Call Stack — Important Notes

> Month 2 · Week 1 · Day 3 | Quick revision sheet

## Must Remember
- Every recursive method needs a base case and progress toward it; otherwise recursion does not terminate.
- Each call gets a stack frame containing parameters/local state; frames return in reverse order (LIFO).
- Recursion depth contributes O(depth) stack space; deep recursion can cause StackOverflowError.
- Convert to iteration when depth may be large or stack use is avoidable.

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
