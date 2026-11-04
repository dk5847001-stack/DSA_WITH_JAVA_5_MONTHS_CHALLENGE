# Exceptions, static, final & Utilities — Important Notes

> Month 1 · Week 4 · Day 5 | Quick revision sheet

## Must Remember
- Checked exceptions must be caught/declared; unchecked exceptions extend RuntimeException.
- `try/catch/finally`; try-with-resources closes AutoCloseable resources.
- `static` belongs to class; `final` prevents reassignment/overriding/inheritance depending on context.
- Do not swallow exceptions; catch the most specific type and preserve useful context.

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
