# 1D Dynamic Programming — Important Notes

> Month 4 · Week 4 · Day 5 | Quick revision sheet

## Must Remember
- DP applies when subproblems overlap and optimal substructure exists.
- Define state, base cases, transition, evaluation order, and final answer before coding.
- Time = number of states × work per state; space = stored states + recursion stack if memoized.
- DP is not a single algorithm; state design is the key.

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
