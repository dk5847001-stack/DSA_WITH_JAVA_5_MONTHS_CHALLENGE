# ⚡ Java Collections — Quick Reference & Decision Guide

> **Month 1 · Week 4 · Day 6**  
> A practical, interview-ready guide to choosing between `ArrayList`, `LinkedList`, `HashSet`, and `HashMap`.

---

## 🧭 1. The 10-Second Decision Guide

| Your requirement | Best starting choice | Why |
|---|---|---|
| Keep items in insertion order, allow duplicates, access by index | `ArrayList<E>` | Fast indexed access; usually the default List choice |
| Add/remove frequently at the beginning or end | `LinkedList<E>` | Efficient end operations; also implements `Deque` |
| Store unique values and quickly check membership | `HashSet<E>` | No duplicate elements; average fast `add/contains/remove` |
| Associate each key with a value | `HashMap<K,V>` | Fast average lookup by key; keys are unique |
| Need sorted unique values | Consider `TreeSet<E>` | Sorted order (outside this Day 6 comparison) |
| Need keys sorted by key | Consider `TreeMap<K,V>` | Sorted key order (outside this Day 6 comparison) |

**Rule of thumb:** Start with `ArrayList` for a normal list, `HashSet` for uniqueness, and `HashMap` for key-value lookup. Choose `LinkedList` when its deque operations fit the job—not just because insertion or deletion is mentioned.

---

## 🔍 2. At-a-Glance Comparison

| Feature | `ArrayList` | `LinkedList` | `HashSet` | `HashMap` |
|---|---|---|---|---|
| Main interface | `List` | `List`, `Deque` | `Set` | `Map` |
| Stores | Elements | Elements | Unique elements | Key-value pairs |
| Duplicates | Allowed | Allowed | Duplicate elements rejected | Keys unique; values may repeat |
| Null support | Allows null | Allows null | Allows one null | Allows one null key and null values |
| Order guarantee | Insertion/index order | Insertion order | No iteration-order guarantee | No iteration-order guarantee |
| Index access | Yes, usually O(1) | Yes, O(n) traversal | No | No |
| Search by value/key | O(n) for value search | O(n) for value search | O(1) average membership | O(1) average key lookup |
| Add at end | Amortized O(1) | O(1) at end | O(1) average | O(1) average put |
| Insert/remove middle | Usually O(n) shifts | O(n) to locate node, then O(1) relink | Not index-based | Not index-based |
| Typical use | Ordered collection | Deque / frequent end operations | De-duplication / membership | Frequency counts / lookup table |

**Complexity note:** These are typical/average expectations, not a guarantee for every operation or every input. Hash collections can degrade with collisions; resizing also affects individual operations. `ArrayList` append is *amortized* O(1), while insertion/removal away from the end usually requires shifting elements.

---

## 🧱 3. Understand Each Collection

### A. `ArrayList<E>` — Resizable Array

**Choose it when:** you need an ordered, index-based list and read/access operations are common.

**Strengths**
- Maintains element order and allows duplicates.
- Fast `get(index)` and `set(index, value)`.
- Supports null values.
- Automatically grows as elements are added.

**Trade-offs**
- Inserting/removing near the beginning or middle shifts later elements.
- Searching by value requires a scan.
- Not synchronized by default; concurrent modification needs an appropriate design.

**Examples:** student marks, a sequence of quiz questions, a product list displayed in order.

```java
ArrayList<String> names = new ArrayList<>();
names.add("Aman");
names.add("Riya");
names.add("Aman");          // duplicate is allowed

String first = names.get(0);
names.set(1, "Priya");
names.remove("Aman");       // removes the first matching value
boolean exists = names.contains("Priya");
```

### B. `LinkedList<E>` — Doubly Linked List + Deque

**Choose it when:** you need queue/deque-style operations at both ends, or already have a node position via an iterator and need to relink nearby elements.

**Strengths**
- Maintains list order and allows duplicates.
- Efficient operations at the head/tail.
- Implements both `List<E>` and `Deque<E>`.

**Trade-offs**
- `get(index)` and `set(index, value)` require traversal: O(n).
- Searching is O(n).
- Uses extra memory for node links.
- `remove(index)` is not automatically O(1): finding that index costs O(n).

**Examples:** a simple deque, tasks added/removed at either end, queue-style workflows.

```java
LinkedList<String> tasks = new LinkedList<>();
tasks.add("Study");
tasks.addFirst("Wake up");
tasks.addLast("Practice");

String next = tasks.getFirst();
tasks.removeFirst();
tasks.removeLast();
```

> **Performance tip:** For most everyday list workloads, prefer `ArrayList`. `LinkedList` is not automatically faster for arbitrary insertions/deletions because locating the position can dominate the cost.

### C. `HashSet<E>` — Unique Values

**Choose it when:** duplicates must be eliminated or you need fast average membership checks.

**Strengths**
- Stores each equal element only once.
- Average O(1) `add`, `contains`, and `remove`.
- Allows one null element.
- Does not promise insertion or sorted order.

**Trade-offs**
- No index-based access.
- Iteration order is unspecified; do not rely on it.
- For custom objects, correct `equals()` and `hashCode()` implementations are important.

**Examples:** unique PRNs, visited nodes in graph traversal, checking whether a value has appeared.

```java
HashSet<Integer> ids = new HashSet<>();
ids.add(101);
ids.add(102);
ids.add(101);               // ignored as a duplicate

boolean found = ids.contains(102);
ids.remove(101);
```

### D. `HashMap<K, V>` — Key → Value Lookup

**Choose it when:** each key identifies a value, or you need counts/aggregations.

**Strengths**
- Each key maps to at most one value; putting an existing key replaces its old value.
- Values can repeat.
- Average O(1) `get`, `put`, and `containsKey`.
- Allows one null key and null values.
- Excellent for frequency counting and lookup tables.

**Trade-offs**
- Does not guarantee iteration order.
- No index-based access.
- Custom key classes need correct `equals()` and `hashCode()`.
- `get(key) == null` alone cannot distinguish a missing key from a key mapped to null; use `containsKey(key)` if that distinction matters.

**Examples:** PRN → student name, product ID → product, number → frequency.

```java
HashMap<String, Integer> scores = new HashMap<>();
scores.put("Aman", 85);
scores.put("Riya", 92);
scores.put("Aman", 90);     // replaces Aman’s previous score

int riyaScore = scores.get("Riya");
scores.putIfAbsent("Neha", 0);
scores.merge("Aman", 5, Integer::sum);
```

---

## 🧰 4. Important Methods — Complete Practical Checklist

These are the main methods you should know for this level, including inherited methods and the most useful modern convenience methods. Java classes also inherit methods from their parent interfaces/classes; this is a practical reference, not a list of every method in the entire Java API.

### A. Methods available on all four (where applicable)

| Method | What it does |
|---|---|
| `size()` | Returns the number of elements / mappings |
| `isEmpty()` | Checks whether the collection/map is empty |
| `clear()` | Removes all elements / mappings |
| `toString()` | Returns a readable string representation |
| `equals(Object o)` | Compares for equality according to the type’s contract |
| `hashCode()` | Returns a hash code |
| `forEach(action)` | Performs an action for each element / mapping (where supported) |

### B. `ArrayList<E>` and `LinkedList<E>` — List Methods

| Method | Purpose / example |
|---|---|
| `add(E e)` | Append an element |
| `add(int index, E e)` | Insert at an index |
| `addAll(Collection c)` | Append all items from another collection |
| `addAll(int index, Collection c)` | Insert a collection at an index |
| `get(int index)` | Read an element by index |
| `set(int index, E e)` | Replace the element at an index |
| `remove(int index)` | Remove by index |
| `remove(Object o)` | Remove the first matching value |
| `removeAll(Collection c)` | Remove all elements also present in the supplied collection |
| `retainAll(Collection c)` | Keep only elements present in the supplied collection |
| `contains(Object o)` | Check whether a value exists |
| `containsAll(Collection c)` | Check whether all supplied values exist |
| `indexOf(Object o)` | First matching index, or -1 |
| `lastIndexOf(Object o)` | Last matching index, or -1 |
| `iterator()` | Create an iterator |
| `listIterator()` / `listIterator(int)` | Bidirectional iterator, optionally starting at an index |
| `subList(int from, int to)` | View of the range from inclusive to exclusive |
| `toArray()` / `toArray(T[] a)` | Convert to an array |
| `sort(Comparator c)` | Sort list using the supplied comparator |
| `replaceAll(UnaryOperator op)` | Replace each element using a function |
| `removeIf(Predicate p)` | Remove elements matching a condition |
| `stream()` / `parallelStream()` | Create a stream for processing |
| `spliterator()` | Obtain a spliterator |

**Remember:** `subList()` returns a backed view, not an independent copy. Structural changes to the parent list can affect the view.

### C. Extra `ArrayList<E>` methods

| Method | Purpose |
|---|---|
| `ensureCapacity(int minCapacity)` | Request capacity for expected growth |
| `trimToSize()` | Reduce internal capacity toward current size |
| `clone()` | Shallow copy of the list |

### D. Extra `LinkedList<E>` / `Deque<E>` methods

| Method | Purpose |
|---|---|
| `addFirst(E e)` / `addLast(E e)` | Add at head / tail |
| `offerFirst(E e)` / `offerLast(E e)` | Offer at head / tail |
| `getFirst()` / `getLast()` | Read head / tail; throws if empty |
| `peekFirst()` / `peekLast()` | Read head / tail; returns null if empty |
| `removeFirst()` / `removeLast()` | Remove head / tail; throws if empty |
| `pollFirst()` / `pollLast()` | Remove head / tail; returns null if empty |
| `push(E e)` / `pop()` | Stack-style add/remove at the head |
| `descendingIterator()` | Iterate from tail toward head |
| `offer(E e)` / `poll()` / `peek()` | Queue-style operations |
| `element()` / `remove()` | Queue-style access/removal; throws if empty |

**Empty-case distinction:** `peek/poll` return `null` when empty; `get/remove` variants generally throw when no element is available.

### E. `HashSet<E>` — Set Methods

| Method | Purpose |
|---|---|
| `add(E e)` | Add only if not already present |
| `addAll(Collection c)` | Add all supplied elements, keeping uniqueness |
| `contains(Object o)` | Average fast membership check |
| `remove(Object o)` | Remove a value |
| `removeAll(Collection c)` | Remove all matching values |
| `retainAll(Collection c)` | Keep only values also in the supplied collection |
| `containsAll(Collection c)` | Check if all supplied values exist |
| `iterator()` | Iterate over unique elements |
| `toArray()` / `toArray(T[] a)` | Convert to array |
| `removeIf(Predicate p)` | Remove elements matching a condition |
| `stream()` / `parallelStream()` | Stream-based processing |
| `spliterator()` | Obtain a spliterator |

**Set-specific behavior:** `add(value)` returns `false` when an equal element already exists and `true` when a new element is added.

### F. `HashMap<K, V>` — Map Methods

| Method | Purpose / example |
|---|---|
| `put(K key, V value)` | Add or replace a mapping |
| `putAll(Map m)` | Copy mappings from another map |
| `putIfAbsent(K key, V value)` | Add only if key is absent or mapped to null |
| `get(Object key)` | Get value, or null if no non-null value is mapped |
| `getOrDefault(Object key, V defaultValue)` | Return a fallback when no mapping is found |
| `remove(Object key)` | Remove by key |
| `remove(Object key, Object value)` | Remove only if both key and value match |
| `replace(K key, V value)` | Replace only if key is present |
| `replace(K key, V old, V new)` | Replace only if old value matches |
| `replaceAll(BiFunction f)` | Transform every mapped value |
| `containsKey(Object key)` | Check key existence |
| `containsValue(Object value)` | Check whether a value exists (usually O(n)) |
| `keySet()` | View of keys |
| `values()` | View of values |
| `entrySet()` | View of key-value entries |
| `forEach(BiConsumer action)` | Process each key-value pair |
| `compute(K key, BiFunction f)` | Compute a mapping for a key |
| `computeIfAbsent(K key, Function f)` | Compute a value if absent/null |
| `computeIfPresent(K key, BiFunction f)` | Compute a value if present and non-null |
| `merge(K key, V value, BiFunction f)` | Combine an existing value with a new value |
| `clear()`, `size()`, `isEmpty()` | Basic map operations |

**Important:** `keySet()`, `values()`, and `entrySet()` are backed views of the map. Changes through those views can affect the map. Avoid changing the map structurally while iterating it except through supported iterator operations.

---

## 🧪 5. Common Patterns You’ll Use in DSA

### Remove duplicates while keeping first-seen order
A plain `HashSet` does not preserve order. Use a `LinkedHashSet` when order matters.

```java
List<Integer> values = Arrays.asList(4, 2, 4, 7, 2);
Set<Integer> unique = new LinkedHashSet<>(values);
System.out.println(unique); // [4, 2, 7]
```

### Count frequency of every number

```java
int[] nums = {2, 3, 2, 5, 3, 2};
Map<Integer, Integer> frequency = new HashMap<>();

for (int n : nums) {
    frequency.merge(n, 1, Integer::sum);
}
System.out.println(frequency); // order is not guaranteed
```

### Check whether a value has appeared before

```java
Set<Integer> seen = new HashSet<>();
for (int n : nums) {
    if (!seen.add(n)) {
        System.out.println("Duplicate: " + n);
    }
}
```

### Iterate through a map

```java
for (Map.Entry<String, Integer> entry : scores.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

### Remove matching list values safely

```java
numbers.removeIf(n -> n % 2 == 0); // removes all even numbers
```

---

## ⚠️ 6. Mistakes to Avoid

1. **Expecting `HashSet` or `HashMap` to preserve order.** Their iteration order is not guaranteed.
2. **Using `ArrayList` for fast repeated membership tests on a large collection.** A `HashSet` may be a better fit when uniqueness/order requirements allow it.
3. **Assuming `LinkedList.remove(index)` is O(1).** The position must first be located.
4. **Confusing list overloads:** `remove(1)` on `List<Integer>` removes index 1; `remove(Integer.valueOf(1))` removes the value 1.
5. **Using mutable objects as hash keys/elements.** Changing fields used by `equals()`/`hashCode()` while an object is stored can break lookup behavior.
6. **Assuming `HashMap.get(key) == null` means the key is absent.** A key may be mapped to null; use `containsKey(key)` when needed.
7. **Removing items directly from a list inside enhanced for-each.** Use an iterator’s `remove()` or `removeIf()` to avoid concurrent-modification issues.
8. **Thinking these classes are thread-safe.** The standard classes here are not synchronized for concurrent mutation.

---

## 🎯 7. Final Memory Shortcut

- **ArrayList** → ordered items + index access.
- **LinkedList** → list + deque operations at both ends.
- **HashSet** → unique values + fast average membership.
- **HashMap** → unique keys mapped to values + fast average lookup.

> **Interview answer:** Choose the data structure based on the operation you need most often, the ordering/uniqueness rules, and the expected input size—not on one method name alone.

---

### 📚 Java API
- [ArrayList — Java SE API](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html)
- [LinkedList — Java SE API](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/LinkedList.html)
- [HashSet — Java SE API](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/HashSet.html)
- [HashMap — Java SE API](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/HashMap.html)
- [Collection — Java SE API](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collection.html)
- [Map — Java SE API](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html)
