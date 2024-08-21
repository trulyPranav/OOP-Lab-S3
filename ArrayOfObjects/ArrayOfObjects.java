package ArrayOfObjects;
import java.util.Scanner;

class Object{
    String empName;
    int empAge;

    Object(String empName, int empAge){
        this.empName = empName;
        this.empAge = empAge;
    }
}

class ArrayOfObjects {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        Object objs[] = new Object[5];
        int i=0;
        boolean check = true;
        while(check){
            System.out.println("Enter the operation: \n1) Add Employee. \n2) Display all Employees \n3) Exit");
            int n = src.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter the Name of Employee " + (i+1));
                    String name = src.next();
                    System.out.println("Enter the Age of Employee " + (i+1));                    
                    int age = src.nextInt();
                    objs[i] = new Object(name, age);
                    i++;
                    break;
                case 2:
                    for(int j=0; j<5; j++){
                        System.out.println("Employee " + (j+1) + " name is: " + objs[j].empName);
                        System.out.println("Employee " + (j+1) + " age is: " + objs[j].empAge);
                    }
                case 3:
                    check = false;
            }
        }
        src.close();
    }
}
