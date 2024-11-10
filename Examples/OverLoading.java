package Examples;

class OverLoading {
    int x;
    final int u;
    OverLoading(int x, int u){
        this.x = x;
        this.u = u;
    }

    void calc(){
        System.out.println(x);
    }

    void calc(int y) {
        System.out.println(x+y);
    }

    void calc(int z, int y){
        System.out.println(x+y+z);
    }

    void calc(double w){
        System.out.println(x+w);
    }

    void calc(double z, double y){
        System.out.println(x+y+z);
    }

    public static void main(String[] args) {
        OverLoading old = new OverLoading(10,10);
        old.calc();
        old.calc(5);
        old.calc(5,10);
        old.calc(10.00);
        old.calc(5.00,10.0);
    }
}

// No of parameters/ parameter datatype different
