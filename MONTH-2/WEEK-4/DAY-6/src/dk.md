# Sliding Window: Variable Size — Daily Knowledge

> MONTH-2 · WEEK-4 · DAY-6

## Knowledge Snapshot
- Expand right to include elements; shrink left while the window violates the condition.
- Maintain counts/sum incrementally; each pointer moves at most n times → O(n) time.
- Standard variable window works naturally for non-negative sum constraints; negatives may break monotonicity and require prefix sums/deque.

## Reflection
Explain the concept in your own words and connect it to a small Java example.
