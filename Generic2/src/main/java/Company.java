import java.util.ArrayList;

public class Company <T extends Department>{

    private String name;

    private ArrayList<Department> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public boolean addEmployees(T department){
        if(employees.contains(department)){

            System.out.println(department.getName() + "is already in this company.");
            return false;

        }else{
            employees.add(department);
            System.out.println(department.getName() + " pick for company " + this.name);
            return true;
        }
    }
    public int runDepartment (){
        return this.employees.size();
    }
}
