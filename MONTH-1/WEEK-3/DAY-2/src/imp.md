# Method Overloading & Pass-by-Value — Important Notes

> Month 1 · Week 3 · Day 2 | Quick revision sheet

## Must Remember
- Overloading = same method name, different parameter list (number/type/order); return type alone cannot overload.
- Java passes arguments by value; object reference values are copied, so object state can change but caller's reference cannot be reassigned.
- Keep methods cohesive; return a result instead of printing when reuse is needed.

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
