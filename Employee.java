package com.company;


public class Employee
{
    public static void main(String[] args) {
        Employee x = new Employee(122345,60000,"samni","mohamed");
        System.out.println(x.getId());
        System.out.print(x.getName());
        System.out.print(x.toString());

    }
    private int id,salary;
    private String firstName,lastName;
    public Employee(int id, int salary, String lastName, String firstName)
    {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;


    }

    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
    public int getAnnualSalary() {
        return salary*12;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName+" "+lastName;
    }
    public int raiseSalary(int percent) {
        return salary+salary*percent/100;
    }

   
    public String toString() {
        return
                "id=" + id +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'';
    }
}
