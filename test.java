public class test {
    public static void main(String[] args) {
        
    }

}



































class parent{
    protected static int a;
    private int b;

    parent(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void display(){
        System.out.println(this.a);
        System.out.println(this.b);
    }
}

class child extends parent{
    private int c;
    private int d;
    private int e;
    private int f;
    child(int c, int d,int e,int f){
        super(c,d);
        this.e =e;
        this.f =f;
    }
    public void display(){
        System.out.println(parent.a);
        System.out.println(this.c);
        System.out.println(this.f);
    }
}
