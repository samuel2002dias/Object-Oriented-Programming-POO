package aulapratica8;

public class Base {
    protected int a;
    protected int b;

    public Base(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int soma() {
        return a + b;
    }

    public int soma(int x) {
        return a + b + x;
    }

    public int getA(){
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public String toString(){
        String s;
        s = "a: " + a + "/ b: "+b;
        return s;
    }

    public boolean equals(Object o){
        boolean ig = false;
        if(o != null && this.getClass() == o.getClass()){
            Base e = (Base) o;
            ig = (this.a == e.a) && (this.b == e.b);
        }
        else
            ig = false;
        return ig;
    }

    public Object clone(){
        Base copia = new Base(0, 0);
        copia.a = this.a;
        copia.b = this.b;
        return copia;
    }
    
    public static void main(String[] args) {
        Base base1 = new Base(1, 2);
        int a = base1.getA();
        int b = base1.getB();
        System.out.println("a="+a+" // b="+b);
        System.out.println(base1);
        base1.setA(3);
        base1.setB(4);
        System.out.println(base1);
        System.out.println(base1.soma());
        System.out.println(base1.soma(5));
        Base base2 = (Base) base1.clone();
        Base base3 = new Base(5, 5);
        System.out.println(base1.equals(base2));
        System.out.println(base1.equals(base3)); 
    }
}
