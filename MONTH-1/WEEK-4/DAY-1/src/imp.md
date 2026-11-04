# Strings & String Operations — Important Notes

> Month 1 · Week 4 · Day 1 | Quick revision sheet

## Must Remember
- Java String is immutable; operations that appear to modify it return a new String.
- Compare contents with `equals()` / `equalsIgnoreCase()`, not `==` (reference identity).
- `length()` returns character count in UTF-16 code units; `charAt(i)` uses zero-based index.
- String concatenation in repeated loops may be costly; prefer StringBuilder.

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
