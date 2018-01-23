/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zbaraszewski-n
 */
public class Employee {
    
    //***Constants***
    final private double OVERTIMEHOURS = 40;
    final private double WAGEMULTIPLIER = 1.5;
    
    //***Variables***
    private static int nextID = 1000;
    private int id;
    private double wage;
    private double hours;
    
    
    
    //Constructors
    public Employee (){
        id = nextID++;
        wage = 0;
        hours = 0;
    }
    
    public Employee (double w, double h){
        id = nextID++;
        wage = w;
        hours = h;
    }

    
    
    //Accessors
    public String toString(){
        String Out = "";
        
        Out += "ID: " +this.getID() +"\n";
        Out += "Wage: $" +this.getWage() +" per hour"+"\n";
        Out += "Hours: " +this.getHours() +"\n";
        Out += "Regular pay: $" +this.getNormalPay() +"\n";
        Out += "Overtime pay: $" +this.getOvertimePay() +"\n";
        Out += "Gross pay: $" +this.getGrossPay() +"\n";
        
        return Out;
        
    }
    
    public int getID(){
        return id;
    }

    public double getWage(){
        return wage;
    }
    
    public double getHours(){
        return hours;
    }
    
    //returns the pay given for 40 or less hours worked
    public double getNormalPay(){
        double pay;
        
        if (hours>OVERTIMEHOURS){
            pay = OVERTIMEHOURS*wage;
        } else {
            pay = hours*wage;
        }   
        
        pay = Math.round(pay*100.0)/100.0;
        
        return pay;
    }
    
    //returns the pay given for hours worked past 40
    public double getOvertimePay(){
        double pay;
        
        if (hours<OVERTIMEHOURS){
            pay = 0;
        } else {
            pay = (hours-OVERTIMEHOURS)*(wage*WAGEMULTIPLIER);
        }
        
        pay = Math.round(pay*100.0)/100.0;
        
        return pay;
        
    }
    
    //returns the gross pay, which includes normal and overtime pay
    public double getGrossPay(){
        double pay;
        
        pay = this.getNormalPay()+this.getOvertimePay();
        
        pay = Math.round(pay*100.0)/100.0;
        
        return pay;
        
    }
    
    
    
    //Mutators
    public void setWage(double w){
        wage = w;
    }
    
    public void setHours(double h){
        hours = h;
    }
 
    
}
