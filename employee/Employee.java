package com.mycompany.employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary)throws Exception{
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        if(salary<0){
            throw new Exception("salary<0!!!");
        }
        this.salary=salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return (firstName+" "+lastName);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return (salary*12);
    }
    public int raiseSalary(int percent){
        salary=salary+percent*salary;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name=" + firstName + " "+ lastName +
                ", salary=" + salary +
                ']';
    }
}
