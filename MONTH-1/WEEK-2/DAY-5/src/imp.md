# Factorial, Fibonacci, GCD & LCM — Important Notes

> Month 1 · Week 2 · Day 5 | Quick revision sheet

## Must Remember
- Factorial: `n! = n × (n-1)!`, with `0! = 1`; values grow quickly (long overflows after 20!).
- Fibonacci: `F0=0, F1=1`; iterative two-variable update is O(n) time, O(1) space.
- Euclid GCD: `gcd(a,b)=gcd(b,a%b)`; LCM = `|a / gcd(a,b) * b|` (divide first to reduce overflow).
- Handle negative inputs and zero cases explicitly.

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
