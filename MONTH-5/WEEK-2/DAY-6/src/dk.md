# Bit Manipulation, XOR & Bit Masks — Daily Knowledge

> MONTH-5 · WEEK-2 · DAY-6

## Knowledge Snapshot
- `x & 1` checks odd; `x & (1<<k)` tests bit k; `x | (1<<k)` sets; `x & ~(1<<k)` clears; `x ^ (1<<k)` toggles.
- XOR: x^x=0, x^0=x, commutative/associative; useful for unique-element patterns.
- `1 << k` uses int width; use `1L << k` for long masks; beware sign bit and Java shift rules.

## Reflection
Explain the concept in your own words and connect it to a small Java example.
