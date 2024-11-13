package Examples;

interface Exam {
    // All variables in an interface is declared FINAL
    // Final variables ALL CAPS
    // Default all variables are FINAL
    // Default all methods are ABSTRACT
    // Allows MI
    int X = 10;
    void perform();
}

interface  Exam2 {
    int Y = 11;
    void perform2();
}

class Inter implements Exam,Exam2{

    public void perform(){
        System.out.println();
    }

    public void perform2(){
        System.out.println();
    }
    
    public static void main(String[] args) {
        
    }
}
