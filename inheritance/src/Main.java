public class Main {

    public static void main(String[]args){
    Customer customer=new Customer();
    Employee employee=new Employee();

    customer.age=25;
    employee.salary=2500;

    CustomerManager customerManager=new CustomerManager();
    EmployeeManager employeeManager=new EmployeeManager();

    customerManager.Add();


    }
}
