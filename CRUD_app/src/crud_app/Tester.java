package crud_app;

public class Tester {
    public static void main(String[] args){
//        Creating employee object
        Employee emp = new Employee();

//        adding employee details
        emp.insert("Manish", 101, "Intern", 0);
        emp.insert("Bruce", 55, "Batman", 7);

//        Searching for employees using employee number
        String res1 = emp.search(55);
        String res2 = emp.search(101);
//        System.out.println(res1);
//        System.out.println(res2);

//        displaying employee details
//        emp.display();

//        Updating employee details
        emp.update(55, "Bruce", "Developer", 7);

//        emp.display();

//        deleting employee
        emp.delete(101);

//        emp.display();
    }
}
