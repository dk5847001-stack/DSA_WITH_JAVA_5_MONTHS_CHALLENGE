# 🏆 Month 1 — Grand Homework Challenge

<p align="center">
  <strong>JAVA FOUNDATIONS · LOOPS · ARRAYS · OOP · COLLECTIONS</strong><br/>
  <em>4 integrated challenges · 4 weeks of learning · 100 marks</em>
</p>

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk)
![Challenges](https://img.shields.io/badge/Challenges-4-2563EB?style=for-the-badge)
![Coverage](https://img.shields.io/badge/Coverage-Month%201-7C3AED?style=for-the-badge)
![Marks](https://img.shields.io/badge/Total-100%20Marks-16A34A?style=for-the-badge)

> [!IMPORTANT]
> **Purpose:** Month 1 ke concepts ko isolated exercises se aage le jaakar real-world style Java programs mein combine karna. Har challenge mein pichhle week ke important concepts apply karne hain.

## 📊 Challenge overview

| Challenge | Week | Project | Difficulty | Marks |
|---|---:|---|---|---:|
| Q1 | 1 | Smart Student Result Management System | Medium | 25 |
| Q2 | 2 | Number Analysis & Pattern Generator | Medium–Hard | 25 |
| Q3 | 3 | Array & Method Based Data Analyzer | Hard | 25 |
| Q4 | 4 | Mini Banking & Account Management System | Hard | 25 |
| **Total** | **4 weeks** | **4 integrated programs** | — | **100** |

## 🧭 Navigation

- [Q1 — Week 1: Student Result System](#q1-4--week-1--smart-student-result-management-system)
- [Q2 — Week 2: Number Analysis Toolkit](#q2-4--week-2--number-analysis--pattern-generator)
- [Q3 — Week 3: Array & Method Data Analyzer](#q3-4--week-3--array--method-based-data-analyzer)
- [Q4 — Week 4: Mini Banking System](#q4-4--week-4--mini-banking--account-management-system)
- [Evaluation rubric](#-evaluation-rubric)
- [Completion tracker](#-completion-tracker)

## 📜 Rules & submission guidelines

1. Har question ka **complete, runnable Java program** khud likhna hai.
2. Har challenge mein us week ke multiple concepts integrate karne hain.
3. Input validation, boundary cases aur invalid input handle karna hai.
4. Code ke saath sample input/output bhi dena hai.
5. Meaningful variable/method names aur readable formatting use karo.
6. Har question submit karne ke baad code review, dry run, complexity analysis aur score milega.
7. **Ek question complete aur review hone ke baad hi next question par jaana hai.**

---

### Q1/4 — Week 1: Smart Student Result Management System
<badge color="success">Week 1 concepts integrated</badge>
**Difficulty:** Medium

Concepts to use:
- Variables and data types
- Primitive and reference types
- Type casting
- Arithmetic and relational operators
- Logical operators
- Increment/decrement
- Scanner input
- if/else, nested conditions, ternary operator
- switch, case, default
Task:

Ek Student Result Management Program banao jo student ka naam, roll number aur 5 subjects ke marks input le.

Program ko:
1. Har subject ke marks validate karne hain (0–100).
2. Total marks aur percentage calculate karna hai.
3. Grade determine karna hai:
   - 90–100: A+
   - 80–89: A
   - 70–79: B
   - 60–69: C
   - 40–59: D
   - Below 40: Fail
4. Agar kisi bhi subject mein 40 se kam marks hain, overall result Fail hona chahiye.
5. switch ka use karke student ka performance remark select karna hai.
6. Ternary operator se Pass/Fail display karna hai.
Extra condition: Percentage decimal mein show honi chahiye. Integer division se percentage calculate mat karna.

### Q2/4 · Week 2 — Number Analysis & Pattern Generator
<badge color="success">Week 2 concepts integrated</badge>
**Difficulty:** Medium–Hard

Concepts to use:
- for, while, do-while
- Digit extraction using % and /
- Reverse number and digit counting
- Prime numbers and factors
- Factorial and Fibonacci
- GCD and LCM
- Nested loops
- Number and star patterns
- Loop optimization
Task:

Ek Number Analysis Toolkit banao jo user se ek positive integer input le aur ye operations perform kare:
1. Number ke digits ka sum calculate karo.
2. Number reverse karo.
3. Digit count find karo.
4. Number palindrome hai ya nahi check karo.
5. Prime number hai ya nahi check karo.
6. Number ke saare factors print karo.
7. Number ka factorial calculate karo (agar number 0–20 ke beech ho).
8. Fibonacci series print karo, jitne terms user specify kare.
9. Do numbers ka GCD aur LCM calculate karo.
10. Nested loops se ek number pattern print karo.
Extra condition: Kam se kam ek operation while, ek do-while aur baaki suitable operations for loop se implement karo.

### Q3/4 · Week 3 — Array & Method Based Data Analyzer
<badge color="success">Week 3 concepts integrated</badge>
**Difficulty:** Hard

Concepts to use:
- Method declaration and calling
- Parameters and return values
- Method overloading
- Pass-by-value
- 1D arrays
- Min/max, sum and average
- Frequency and searching
- Reverse array
- Second largest
- Duplicate detection
- Sorted-array checking
- 2D arrays and matrix operations
Task:

Ek Student Marks Data Analyzer banao.
1. Students ki total number input lo.
2. Har student ke marks ek 1D array mein store karo.
3. Methods bana kar:
   - Total aur average calculate karo.
   - Highest aur lowest marks find karo.
   - Second-largest distinct marks find karo.
   - Duplicate marks identify karo.
   - Marks ki frequency calculate karo.
   - Specific marks search karo.
   - Array reverse karo.
   - Array sorted hai ya nahi check karo.
4. Method overloading use karke average calculate karne ke do methods banao.
5. Pass-by-value demonstrate karne ke liye ek method mein primitive variable change karke original value compare karo.
6. 2D array mein 3 students ke 3 subjects ke marks store karke row-wise total calculate karo.
Extra condition: Har major operation ke liye separate reusable method banao. main() ko unnecessarily lengthy mat banana.

### Q4/4 · Week 4 — Mini Banking & Account Management System
<badge color="success">Week 4 concepts integrated</badge>
**Difficulty:** Hard

Concepts to use:
- Strings and String immutability
- StringBuilder
- Class and Object
- Constructor and this
- Encapsulation
- Inheritance
- Method overriding and polymorphism
- Abstraction and interfaces
- Exception handling
- static, final, access modifiers
- Wrapper classes
- ArrayList, LinkedList, HashSet, HashMap
- Iterator
- Comparable and Comparator
Task:

Ek Mini Banking System banao.

Required functionality:
1. BankAccount class create karo with private account number, holder name aur balance.
2. Constructor aur this keyword use karo.
3. Deposit aur withdrawal methods banao.
4. Invalid withdrawal aur negative deposit par custom exception throw karo.
5. SavingsAccount aur CurrentAccount classes ko BankAccount se inherit karao.
6. Method overriding se dono account types ka alag behavior implement karo.
7. Ek interface TransactionOperations banao.
8. static se total accounts count track karo.
9. final se bank ka fixed name define karo.
10. Multiple accounts ko ArrayList mein store karo.
11. Transaction history ko LinkedList mein maintain karo.
12. Unique account numbers ke liye HashSet use karo.
13. Account number aur account details ke liye HashMap use karo.
14. Iterator se accounts traverse karo.
15. Comparable se account number ke basis par sorting aur Comparator se balance ke basis par sorting karo.
16. StringBuilder se transaction receipt generate karo.
Extra condition: Encapsulation follow karo; private data ko directly access mat karna. Wrapper classes ka meaningful use bhi dikhana.

---

## 🧮 Evaluation rubric

Each question carries **25 marks**.

| Evaluation area | Marks |
|---|---:|
| Correctness & required functionality | 8 |
| Correct use of required concepts | 7 |
| Logic, dry run & explanation | 4 |
| Input validation & edge cases | 3 |
| Code readability & structure | 3 |
| **Total per question** | **25** |

## ✅ Completion tracker

| Challenge | Status | Score |
|---|---|---:|
| Q1 — Week 1 | ⬜ Pending review | — / 25 |
| Q2 — Week 2 | ⬜ Pending | — / 25 |
| Q3 — Week 3 | ⬜ Pending | — / 25 |
| Q4 — Week 4 | ⬜ Pending | — / 25 |
| **Grand total** | **In progress** | **— / 100** |

## 🎓 Month 1 completion milestone

Month 1 Grand Homework Challenge ke all four questions complete hone ke baad:

- Java fundamentals aur conditional logic revise honge.
- Loop-based number algorithms aur patterns consolidate honge.
- Methods, arrays aur matrix operations integrate honge.
- OOP, exception handling aur Java Collections ka practical application hoga.

> **Next step:** Q1 se start karo. Complete Java code, sample output aur short explanation submit karo. Review ke baad hi Q2 unlock hoga.

<p align="center">
  <strong>Consistency builds skill. Practice builds confidence. 💪</strong><br/>
  <sub>DSA_WITH_JAVA · Month 1 Grand Homework</sub>
</p>
