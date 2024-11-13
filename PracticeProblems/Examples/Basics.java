package Examples;

class InnerBasics {
    // Instance Variables
    int x;
    // default constructor
    InnerBasics (){
        x = 15;
    }
    // parametrizized const
    InnerBasics(int number){
        x = number;
    }
    InnerBasics(int no, int z){

    }
    void accessX(){
        System.out.println(x);
    }
    // function :: methods
    void accessX(int x){
        System.out.println(x);
    }
}

class Basics {
    public static void main(String[] args) {
        InnerBasics ob1 = new InnerBasics(9);
        ob1.accessX(20);
    }
}
