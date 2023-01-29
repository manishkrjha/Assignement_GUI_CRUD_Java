package crud_app;

public class EmployeeCard {
    String empName;
    int empNo;
    String position;
    int yearOfExperience;

    public EmployeeCard(String empName, int empNo, String position, int yearOfExperience) {
        this.empName = empName;
        this.empNo = empNo;
        this.position = position;
        this.yearOfExperience = yearOfExperience;
    }

    public void employeeDetails(){
        System.out.println(
                "------Employee Detail------" +
                "\nEmployee name: " + empName
                + "\nEmployee no: " + empNo
                + "\nEmployee position: " + position
                + "\nYears of experience: " + yearOfExperience
        );
    }
}
