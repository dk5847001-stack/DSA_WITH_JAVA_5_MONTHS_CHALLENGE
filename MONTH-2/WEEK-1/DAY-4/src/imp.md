# Recursive Factorial, Sum, Power & Fibonacci — Important Notes

> Month 2 · Week 1 · Day 4 | Quick revision sheet

## Must Remember
- Factorial: `fact(n)=n*fact(n-1)`, base `fact(0)=1`; sum: `sum(n)=n+sum(n-1)`, base 0.
- Fast power can use exponentiation by squaring: O(log n) multiplications; handle negative exponent separately.
- Naive recursive Fibonacci repeats work exponentially; memoization/iteration reduces to O(n).
- Check overflow and negative-input preconditions.

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
