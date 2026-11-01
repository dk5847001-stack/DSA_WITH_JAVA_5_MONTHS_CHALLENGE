Day 7 — Problem 1/10
Easy
Strings + StringBuilder
Q1. Reverse a String
Task: User se ek string input lo aur uska reverse print karo.

Example:
Input: ApnaAcademy
Output: ymedacAanpA

Conditions:

1. Scanner se input lena hai.
2. StringBuilder ka use karna hai.
3. Built-in reverse() method use kar sakte ho.
4. Original string ko bhi print karna hai.
   Expected output:
   Enter a string: ApnaAcademy

Original String: ApnaAcademy
Reversed String: ymedacAanpA

---------------------------------------------------------------------------------------------
Q2/10 — Remove Duplicate Characters
Easy
 String + StringBuilder + HashSet


Task: Ek string input lo aur usme se duplicate characters remove karo. Character ka first occurrence preserve rehna chahiye.

Example:
Input: programming

Output: progamin


Conditions:
1. Scanner se input lena hai.
2. HashSet use karna hai.
3. StringBuilder use karna hai.
4. Character ka first occurrence preserve karna hai.
5. Case-sensitive behaviour maintain karna hai (A aur a alag hain).
Hint: HashSet.add() ka return value check karo. Agar character pehli baar add hua hai, tabhi StringBuilder mein append karo.

Complete Java program likho. Main tumhara logic, code quality aur output check karunga. 💪
============================================================================================================================
Q3/10 — Character Frequency Counter
Medium
 HashMap + String


Task: User se ek string input lo aur har character kitni baar aaya hai, uski frequency print karo.

Example:
Input: programming

Output:
p = 1
r = 2
o = 1
g = 2
a = 1
m = 2
i = 1
n = 1


Conditions:
1. Scanner se input lena hai.
2. HashMap use karna hai.
3. Character key (Character) aur frequency value (Integer) honi chahiye.
4. getOrDefault() method use karna hai.
5. Case-sensitive behaviour maintain karna hai.
Hint:
map.put(ch, map.getOrDefault(ch, 0) + 1);


getOrDefault(ch, 0) ka matlab: agar character map mein present hai toh uski existing frequency lo, otherwise 0 lo.

Tumhara task: Complete Java program likho. Is baar HashMap ka logic khud implement karna hai. 💪
============================================================================================================================
Q4/10 — Find First Non-Repeating Character
Medium
 HashMap + String


Task: Ek string input lo aur uska first non-repeating character find karo.

Example:
Input: programming

Output:
First non-repeating character: p


Conditions:
1. Scanner se input lena hai.
2. HashMap<Character, Integer> use karna hai.
3. Character frequency calculate karni hai.
4. First non-repeating character find karna hai.
5. Agar koi non-repeating character nahi hai, toh appropriate message print karna hai.
6. Original string ka order preserve karna hai.
Hint: Is problem ko solve karne ke liye two-pass approach use karo:
- First pass: Har character ki frequency calculate karo.
- Second pass: Original string ko dobara traverse karo. Jiski frequency 1 ho, wahi first non-repeating character hai.
Tumhara task: Complete Java program likho. Ismein getOrDefault() use karna. 💪
============================================================================================================================
Q5/10 — Check Anagrams
Medium
 String + HashMap


Task: Do strings input lo aur check karo ki dono anagrams hain ya nahi.

Anagram ka matlab: Dono strings mein same characters same frequency ke saath hone chahiye, bas order different ho sakta hai.

Example 1:
Input:
listen
silent

Output:
Both strings are Anagrams.


Example 2:
Input:
hello
world

Output:
Both strings are NOT Anagrams.


Conditions:
1. Scanner se dono strings input leni hain.
2. HashMap<Character, Integer> use karna hai.
3. Character frequencies compare karni hain.
4. Case-sensitive comparison maintain karna hai.
5. Different lengths hone par directly anagram reject kar sakte ho.
Hint: First string ki frequency increase karo aur second string ke characters ki frequency decrease karo. End mein sab frequencies zero honi chahiye.

Is baar tum khud logic design karna. Complete Java program bhejna, main review karunga. 💪
============================================================================================================================
Q6/10 — Find Duplicate Elements in ArrayList
Medium
 ArrayList + HashSet


Q6 ka question ab solve karo:

Task: Ek ArrayList<Integer> mein duplicate elements find karo. Har duplicate number output mein sirf ek baar print hona chahiye.
Input:
10, 20, 30, 20, 40, 10, 50, 30, 60

Output:
Duplicate elements: [10, 20, 30]


Conditions:
1. ArrayList<Integer> use karna hai.
2. HashSet<Integer> use karna hai.
3. Duplicate elements identify karne hain.
4. Duplicate output mein repeat nahi hone chahiye.
5. Original ArrayList modify nahi honi chahiye.
6. Duplicate detection ka first-occurrence order preserve karna hai.
Hint:
if (!set.add(number)) {
    // Duplicate detected
}


Tumhara task: Complete Java program likho. 💪
============================================================================================================================
Q7/10 — Sort an ArrayList
Medium
 ArrayList + Collections


Task: Ek ArrayList<Integer> mein numbers store karo aur unhe ascending order mein sort karo.

Input:
How many numbers: 6
Enter numbers: 50 10 40 20 60 30


Expected Output:
Original ArrayList: [50, 10, 40, 20, 60, 30]
Sorted ArrayList: [10, 20, 30, 40, 50, 60]


Conditions:
1. ArrayList<Integer> use karna hai.
2. User se numbers input lene hain.
3. Collections.sort() use karke ascending order mein sort karna hai.
4. Sorting se pehle original list print karni hai.
5. Sorting ke baad sorted list print karni hai.
Hint:
Collections.sort(num);


Tumhara task: Complete Java program likho aur yahan paste karo. Main code review, dry run, time complexity aur score dunga. 🔥
============================================================================================================================
Q8/10 — Find Common Elements in Two ArrayLists
Medium
 ArrayList + HashSet


Task: Do ArrayList<Integer> banao aur dono lists mein jo common elements hain, unhe find karo. Har common element output mein sirf ek baar aana chahiye.

Input:
First ArrayList: 10 20 30 40 50 20
Second ArrayList: 30 40 60 70 10 40


Expected Output:
First ArrayList: [10, 20, 30, 40, 50, 20]
Second ArrayList: [30, 40, 60, 70, 10, 40]
Common elements: [10, 30, 40]


Conditions:
1. Dono lists ke liye ArrayList<Integer> use karna hai.
2. Common elements identify karne ke liye HashSet<Integer> use karna hai.
3. Common element output mein repeat nahi hona chahiye.
4. First ArrayList ke order ke according common elements print hone chahiye.
5. Original dono ArrayLists modify nahi honi chahiye.
Hint:
HashSet<Integer> secondSet = new HashSet<>(secondList);


Phir first list par loop chalao aur secondSet.contains(number) check karo. Ek additional HashSet se output duplicates avoid kar sakte ho.

Tumhara task: Complete Java program likho aur yahan paste karo. Main code review, dry run, time complexity aur score dunga. 💪
============================================================================================================================
Q9/10 — Sort ArrayList in Descending Order
Medium
 ArrayList + Collections + Comparator


Task: Ek ArrayList<Integer> mein numbers store karo aur unhe descending order (largest to smallest) mein sort karo.

Input:
How many numbers: 7
Enter numbers: 25 10 50 30 5 40 20


Expected Output:
Original ArrayList: [25, 10, 50, 30, 5, 40, 20]
Descending ArrayList: [50, 40, 30, 25, 20, 10, 5]


Conditions:
1. ArrayList<Integer> use karna hai.
2. User se numbers input lene hain.
3. Sorting se pehle original list print karni hai.
4. Collections.sort() ke saath Comparator.reverseOrder() use karna hai.
5. Sorting ke baad descending list print karni hai.
6. Original list ko separately preserve karne ki zaroorat nahi hai; bas sorting se pehle print karna hai.
Hint:
Collections.sort(numbers, Comparator.reverseOrder());


Tumhara task: Complete Java program likho aur yahan paste karo.

Main tumhara code review, dry run, time complexity aur score dunga.

Chalo dost, dekhte hain descending sorting kitni achhi samajh aayi hai! 💪
============================================================================================================================
Q10/10 — Merge Two ArrayLists and Remove Duplicates
Final Challenge
 Medium


Topics: ArrayList + HashSet + LinkedHashSet
Task
Do ArrayList<Integer> banao. Dono lists ke elements ko ek saath merge karo aur duplicate elements remove karo.

Input:
First ArrayList: 10 20 30 40 20
Second ArrayList: 30 50 60 10 70


Expected Output:
First ArrayList: [10, 20, 30, 40, 20]
Second ArrayList: [30, 50, 60, 10, 70]
Merged ArrayList: [10, 20, 30, 40, 50, 60, 70]


Conditions
1. Dono lists ke liye ArrayList<Integer> use karna hai.
2. Dono lists ko merge karna hai.
3. Duplicate elements remove karne hain.
4. First occurrence ka insertion order preserve karna hai.
5. Final result ArrayList<Integer> hona chahiye.
6. Original dono ArrayLists modify nahi honi chahiye.
Hint
LinkedHashSet insertion order preserve karta hai aur duplicate elements automatically remove karta hai.
LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();

uniqueNumbers.addAll(firstNumbers);
uniqueNumbers.addAll(secondNumbers);


Final result ko ArrayList mein convert karne ke liye:
ArrayList<Integer> mergedNumbers =
        new ArrayList<>(uniqueNumbers);


Your challenge 💪
Complete Java program khud likho aur yahan paste karo.

Main check karunga:
- Code correctness
- Dry run
- Time and space complexity
- All 6 conditions
- Final score out of 10
Iske baad tumhare Week 4 ke 10 practice questions complete ho jayenge! 🏆
============================================================================================================================