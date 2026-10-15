class Employee {
    /*
     * Q5/5 — Employee Mini Challenge
     * You are ready for the final OOP practice task. As requested, I'll give you
     * hints only, not the complete solution.
     * Create an Employee class with:
     * 1. Private fields: name, id, salary.
     * 2. A parameterized constructor using this.
     * 3. Getters for all three fields.
     * 4. raiseSalary(double amount) — increase salary only if amount > 0.
     * 5. displayDetails() — print employee details using getters.
     * 6. In main(), create two employees, give one a positive raise and try a
     * negative raise for the other, then display both.
     */
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }
    }

    public void displayDetails() {
        System.out.println("Name : " + getName());
        System.out.println("id : " + getId());
        System.out.println("Salary : " + getSalary());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Dilkhush", 121, 10000);
        Employee e2 = new Employee("Roshan", 321, 15000);
        e1.raiseSalary(500);
        e2.raiseSalary(-500);
        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
    }
}
