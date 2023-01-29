package crud_app;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {

    List<EmployeeCard> employees = new ArrayList<EmployeeCard>();

//    Method to insert employee details
    public void insert(String empName, int empNo, String position, int yearOfExperience){
        EmployeeCard emp = new EmployeeCard(empName, empNo, position, yearOfExperience);
        employees.add(emp);
    }

//    Method to display the details of all employees
    public void display(){

        for (EmployeeCard employee : employees) {
            employee.employeeDetails();
//            System.out.println(employee.);
        }
    }

//    Method to search an employee
    public String search(int employeeNo){

        for (EmployeeCard tmp : employees) {
            if (tmp.empNo == employeeNo) {
                return "The employee no:" + employeeNo + " is present in the list";
            }
        }

        return "The employee no:" + employeeNo + " is not present in the list";
    }

//    Method to delete an employee using its employeeNo
    public void delete(int employeeNo){

        //Getting the index of the item to be removed using iterator.
        Iterator<EmployeeCard> itr = employees.iterator();

        int idx = -1;
        int i=0;

        while (itr.hasNext()){
            EmployeeCard tmp = itr.next();
            if(tmp.empNo == employeeNo){
                idx = i;
                break;
            }
            i++;
        }

        employees.remove(idx);
    }

//    Method to update the employee detail
    public void update(int employeeNumber, String newName, String newPosition, int newYearOfExperience){
        //Getting the index of the item to be removed using iterator.
        Iterator<EmployeeCard> itr = employees.iterator();

        int idx = -1;
        int i=0;

        while (itr.hasNext()){
            EmployeeCard tmp = itr.next();
            if(tmp.empNo == employeeNumber){
                idx = i;
                break;
            }
            i++;
        }

        EmployeeCard tmp = new EmployeeCard(newName, employeeNumber, newPosition, newYearOfExperience);

        //updating the employee present at index = idx
        employees.set(idx, tmp);
    }
}
