# Methods: Declaration, Parameters & Return — Important Notes

> Month 1 · Week 3 · Day 1 | Quick revision sheet

## Must Remember
- Method signature includes name and parameter types; return type is not part of overload resolution.
- Parameters are local to the method; `void` means no returned value.
- Use parameters for inputs and return values for outputs; avoid unnecessary global state.
- Method calls add stack frames; recursion analysis must count stack space.

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
