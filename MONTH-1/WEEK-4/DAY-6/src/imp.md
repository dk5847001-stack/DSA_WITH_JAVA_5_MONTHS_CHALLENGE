# Collections: ArrayList, LinkedList, HashSet & HashMap — Important Notes

> Month 1 · Week 4 · Day 6 | Quick revision sheet

## Must Remember
- ArrayList: indexed access O(1), middle insertion/removal O(n); LinkedList: endpoint operations O(1) with node, indexed access O(n).
- HashSet stores unique values; HashMap key→value; expected add/get/contains O(1).
- Use generics (`ArrayList<Integer>`), iterate safely, and avoid structural modification inside enhanced for-loop.
- Choose by operation pattern, not habit.

## Complexity / Correctness
- Identify dominant operations and count auxiliary storage separately from input.
- State preconditions and explain why the chosen operation/algorithm is valid.
- Prefer the simplest data structure that matches required operations.

## Common Traps
- Reference-vs-value confusion, mutation assumptions, index boundaries, and integer overflow.
- Test empty/minimum, typical, boundary, and invalid inputs.

## Before Moving On
- [ ] Recall the key rules without notes.
- [ ] Implement a short Java example from memory.
- [ ] Explain complexity and test edge cases.
