package Inheritance;

abstract class Compartment {
    public abstract void notice();
}

class FirstClass extends Compartment{
    int seats = 120;
    void bookSeat(){
        seats--;
    }
    public void notice(){
        System.out.println("Balance Seats FC: "+ seats);
    }
}

class GeneralClass extends Compartment{
    int seats = 180;
    void bookSeat(){
        seats--;
    }
    public void notice(){
        System.out.println("Balance Seats GC: "+ seats);
    }
}

class Test{
    public static void main(String[] args) {
        GeneralClass gC = new GeneralClass();
        FirstClass fC = new FirstClass();
        //Boolean choice = true;
        gC.bookSeat();
        gC.notice();
        fC.bookSeat();
        fC.notice();
    }
}