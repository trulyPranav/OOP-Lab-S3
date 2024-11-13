package Examples;

class InnerStatic {
    // int y;
    static int x = 10;
    InnerStatic(){
    }
    void call(){
        x++;
    }
    static void perfrom(){
        System.out.println("HEllo");
    }

    static {
        System.out.println("Program is Starting");
    }
}

class Static {
    public static void main(String[] args) {
        InnerStatic obj2 = new InnerStatic();
        InnerStatic obj1 = new InnerStatic();
        obj1.call();
        System.out.println(obj1.x);
        System.out.println(InnerStatic.x);

        System.out.println(obj2.x);
        obj2.call();
        System.out.println(obj1.x);
        InnerStatic.perfrom();
    }
}


// Can be accessed through class names instead of Object References
// Common to a class, not to a particular object!
