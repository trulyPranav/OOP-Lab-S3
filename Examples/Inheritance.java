package Examples;
// Super : Calls the constructor of just above Parent class!
class A {
    final int x;
    A(int x){
        this.x = x;
    }
    void perfrom(){
        System.out.println("Class A " + x);
    }
}

class B extends A {
    B(int x){
        super(x);
        super.perfrom();
    }
    void perfrom(){
        System.out.println("Class B " + x);
        super.perfrom();
    }
}

class C extends A {
    C(int x){
        super(x);
    }
    void perfromC(){
        System.out.println("Class C " + x);
    }
}

class Inheritance {
    public static void main(String[] args) {
        // B newB = new B();
        // newB.perfrom();
        // newB.perfromB();

        // C newC = new C();
        // newC.perfrom();
        // newC.perfromB();
        // newC.perfromC();

        C ob = new C(50);
        ob.perfromC();
    }
}
