# Linked List Insertion & Deletion — Important Notes

> Month 2 · Week 3 · Day 2 | Quick revision sheet

## Must Remember
- Insert at head: new.next=head; head=new. Insert after node p: new.next=p.next; p.next=new.
- Delete head: head=head.next; deleting elsewhere requires tracking previous node.
- Singly linked list deletion by value/index needs O(n) search; insertion after a known node O(1).
- Preserve tail and handle missing target/null nodes.

## Complexity / Correctness
- Count pointer traversals, stack/queue operations, heap adjustments, and hash operations.
- Include node references, temporary structures, and recursion stack in space analysis.
- State edge-case behavior explicitly.

## Common Traps
- Losing a node reference during rewiring; incorrect head/tail updates.
- Calling pop/poll on empty structures without checking.
- Assuming HashMap iteration order or worst-case constant-time hashing.

## Before Moving On
- [ ] Implement core operations in Java.
- [ ] Trace empty, one-element, and multi-element cases.
- [ ] Explain operation time and auxiliary space.
