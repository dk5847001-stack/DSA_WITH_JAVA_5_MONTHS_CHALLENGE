# Prime Numbers & Factors — Important Notes

> Month 1 · Week 2 · Day 4 | Quick revision sheet

## Must Remember
- A prime has exactly two positive divisors; values below 2 are not prime.
- Test divisors only while `i * i <= n` (use `i <= n / i` to avoid overflow); finding one divisor proves composite.
- Enumerate factor pairs only up to √n; avoid duplicate square-root factor.
- Naive primality test O(√n); trial division for all numbers up to n can be improved with the Sieve of Eratosthenes O(n log log n).

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
