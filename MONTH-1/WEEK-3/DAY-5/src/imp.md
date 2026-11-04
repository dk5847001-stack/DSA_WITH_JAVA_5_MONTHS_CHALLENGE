# Array Reversal, Second Largest & Duplicates — Important Notes

> Month 1 · Week 3 · Day 5 | Quick revision sheet

## Must Remember
- Two-pointer reversal swaps `arr[left]` and `arr[right]`, then moves inward; O(n) time, O(1) extra space.
- Second-largest distinct value requires tracking largest and second-largest carefully; duplicates may not qualify.
- For duplicate detection, use a set or sort; state whether modifying input is allowed.
- Test all-equal, negative, sorted, and one-element arrays.

## Complexity / Correctness
- Identify dominant operations; nested traversals and sorting affect the final bound.
- Distinguish input storage from auxiliary space.
- Explain the invariant or mathematical reason the algorithm is correct.

## Common Traps
- Off-by-one indices, wrong initialization, integer overflow, duplicate handling, and missing edge cases.
- Test empty/minimum, typical, boundary, and adversarial inputs.

## Before Moving On
- [ ] Explain the key points without notes.
- [ ] Implement one Java solution from memory.
- [ ] Dry-run at least two edge cases.
