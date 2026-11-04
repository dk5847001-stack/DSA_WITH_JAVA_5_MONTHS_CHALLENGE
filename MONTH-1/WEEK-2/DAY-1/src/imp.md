# for Loop & Counting Patterns — Important Notes

> Month 1 · Week 2 · Day 1 | Quick revision sheet

## Must Remember
- `for (initialization; condition; update)` is ideal when iteration/count is known.
- Loop invariant: what remains true before each iteration; ensure update moves toward termination.
- Avoid off-by-one errors (`i < n` vs `i <= n`); nested loops multiply iteration counts.
- A simple loop over n items is O(n) time and O(1) auxiliary space.

## Quick Complexity / Rules
- Count each loop iteration and nested loop separately.
- Time complexity describes growth with input size; auxiliary space counts extra memory.
- Test empty/minimum, typical, boundary, and invalid inputs.

## Common Traps
- Off-by-one conditions, integer overflow, wrong operator precedence, and unhandled edge cases.
- Do not memorize code blindly: explain why each condition and update is required.

## Before Moving On
- [ ] Explain the key points without looking.
- [ ] Write one Java example from memory.
- [ ] Dry-run at least two edge cases.
