                                    // Method Overrinding 

class Appliance{
    void turnOn(){
        System.out.println(" Appliance is turned On ");
    }
} 
class WashingMachine{
    void turnOn(){
        System.out.println(" WashingMachince is turnedOn ");
    }
}
class Refrigenator{
    void turnOn(){
        System.out.println(" Refrigentor is turnedOn ");
    }
}
// Question number 2
class Employee{
    void calculateSalary(){
        System.out.println(" calculating salary of a employee");
    }
}
class Manager extends Employee{
    void  calculateSalary(){
        System.out.println(" caculating salary for manager ");
    }
}
class Devloper extends Employee{
    void calculateSalary(){
        System.out.println(" calculating salarly for devloper ");
    }
}
public class Ques_no10 {
public static void main(String[] args) {
    System.out.println(" Output of Question number 1 ");

    WashingMachine w = new WashingMachine();
    Refrigenator r = new Refrigenator();
     w.turnOn();
     r.turnOn();

     System.out.println(" Output of Question number 2 "); 
     Manager m = new Manager();
     Devloper d = new Devloper();

     m.calculateSalary();
     d.calculateSalary();
}    
}
