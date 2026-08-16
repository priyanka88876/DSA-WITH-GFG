//  Implement both the classes here
class Employee
{
    int id;
    int salary;
    public Employee(int id, int salary){
        this.id=id;
        this.salary=salary;
    }
};

class SalesEmployee extends Employee
{
    int sales;

    public SalesEmployee(int id, int salary, int sales){
        super(id, salary);
        this.sales=sales;
    }
};


