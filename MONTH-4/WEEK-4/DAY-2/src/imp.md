# Recursion to Memoization — Important Notes

> Month 4 · Week 4 · Day 2 | Quick revision sheet

## Must Remember
- Memoization = top-down recursion + cache; check cache before recomputing a state.
- Base cases must be handled before transition; choose an uncomputed sentinel that cannot collide with valid answers.
- Complexity is number of distinct states × work per state; recursion stack adds depth space.

## Complexity / Correctness
- For graph algorithms, count edge relaxations, sorting, and heap operations.
- For DP, count distinct states and work per transition.
- Separate table/cache space from recursion stack and input storage.

## Common Traps
- Using an algorithm outside its weight/graph assumptions.
- Confusing MST with shortest path.
- Missing DP base cases, wrong iteration order, or unsafe space optimization.

## Before Moving On
- [ ] State preconditions or DP state clearly.
- [ ] Dry-run a small example/table.
- [ ] Implement in Java and justify complexity.
