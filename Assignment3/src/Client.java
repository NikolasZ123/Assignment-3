
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zbaraszewski-n
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        
        //***Variables***
        ArrayList <Employee> employees = new ArrayList<Employee>();
        
        String[] tokens;    
        String delim = "[ ]+";
        
        String temp;
        
        BufferedReader fin = new BufferedReader(new FileReader("Data.txt"));
         
        
        
        //***Processing***
        temp = fin.readLine();
         
        //reading in data from a text file and creating a new employee object for each line
        while (temp != null){
            
            tokens = temp.split(delim);
            
            employees.add(new Employee(Double.parseDouble(tokens[0]),Double.parseDouble(tokens[1])));

            temp = fin.readLine();

        }
        
        
        
        //***Output***
        
        //printing toString for each employee
        for(Employee i: employees){
            System.out.println(i);
        }
        
        
        //printing specific data from the employee object
        System.out.println("ID of employee 1: " +employees.get(0).getID());
        System.out.println("Regular pay of employee 2: $" +employees.get(1).getNormalPay());
        System.out.println("Overtime pay of employee 3: $" +employees.get(2).getOvertimePay());
        System.out.println("Gross pay of employee 4: $" +employees.get(3).getGrossPay());
        System.out.println("Wage and hours worked of employee 5: Wage: $" +employees.get(4).getWage() +" per hour. Hours: " +employees.get(4).getHours());
        
        
        
    }
    
}
