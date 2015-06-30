package week1.Day2;


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Prog7 {
    public static void main(String[] args) {


        String tblName;
        int nosColNames;
        float salaryValue;

        Scanner sc = new Scanner(System.in);
        System.out.print("table name = ");
        tblName = sc.nextLine();

        System.out.print("number of column names = ");
        nosColNames = sc.nextInt();

        List<String> columnNames = new ArrayList<String>();
        for(int i=0; i<nosColNames; i++) {
            System.out.print("column name = ");
            String col_name = sc.next();
            columnNames.add(col_name);
        }

        System.out.print("salary value = ");
        salaryValue = sc.nextFloat();

        System.out.print("SELECT ");
        int lenColNames = columnNames.size();
        for(int i=0; i<lenColNames; i++) {
            System.out.print(columnNames.get(i));
            if(i<lenColNames-1) {
                System.out.print(",");
            }
        }
        System.out.println("\nFROM Customer\nWHERE salary > " + salaryValue);

    }

}
