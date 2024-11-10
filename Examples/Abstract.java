package Examples;

abstract class Main{
    int x;
    // Main(int x){
    //     this.x = x;
    // }
    abstract void login();
    void nonAbs(){
        System.out.println("HEYEHEHEHEHE");
    }
}

class Main2 extends Main{

    void login(){
        System.out.println("Logged In");
    }
    void nonAbs(){
        System.out.println("OverRided ");
    }
}

class Main3 extends Main{

    void login(){
        System.out.println("Logged In");
    }
    void nonAbs(){
        System.out.println("OverRided in MAin3 ");
    }
}

class Abstract {
    public static void main(String[] args) {
        Main2 obj = new Main2();
        obj.login();
        obj.nonAbs();
    }
}


// Abstract ==> Cannot be Excecuted/ Objects cannot be made
// Abstract Methods => No Body