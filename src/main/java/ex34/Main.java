package ex34;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        String removeEmp;

        int numEmp = employees.size();
        System.out.println("There are "+numEmp+ " employees:");
        for(String i: employees)
        {
            System.out.println(i);
        }

        System.out.println("Enter an employee to remove:");
        removeEmp = sc.nextLine();

        removeEmp(employees, removeEmp);
    }
    public static ArrayList<String> removeEmp(ArrayList<String> array, String name)
    {
        array.remove(name);
        System.out.println("There are "+array.size()+" employees:");
        for(String i: array)
        {
            System.out.println(i);
        }
        return array;
    }
}
