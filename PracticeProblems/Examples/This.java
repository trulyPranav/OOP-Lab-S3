package Examples;

class ABC {
    int x;
    ABC(int x){
        this.x = x;
    }
    void perform(){
        System.out.println(x);
    }
}

public class This {
    public static void main(String[] args) {
        ABC ob = new ABC(10);
        ob.perform();
    }
}
