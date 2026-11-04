# Merge Sort & Divide and Conquer — Important Notes

> Month 2 · Week 2 · Day 5 | Quick revision sheet

## Must Remember
- Bubble sort swaps adjacent out-of-order items; selection sort selects min; insertion sort inserts into sorted prefix.
- Simple sorts are O(n²) average/worst; insertion best O(n) on nearly sorted data; stable behavior depends on implementation.
- Merge sort is O(n log n), stable, and typically O(n) extra space.
- Quick sort average O(n log n), worst O(n²); pivot/partition choice matters.

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
