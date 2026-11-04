# Input/Output with Scanner — Important Notes

> Month 1 · Week 1 · Day 4 | Quick revision sheet

## Must Remember
- `Scanner sc = new Scanner(System.in)`; `nextInt()` reads token, `next()` one token, `nextLine()` the rest of a line.
- After `nextInt()`/`next()`, consume the pending newline before a subsequent `nextLine()`.
- Validate ranges and handle expected input format; close Scanner only when finished with System.in.

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
