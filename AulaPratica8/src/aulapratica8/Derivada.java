package aulapratica8;

public class Derivada extends Base{
    private int a;
    private int c;
    
    public Derivada(Base b, int a, int c){
        super(b.getA(),b.getB());
        this.a = a;
        this.c = c;
    }
    
    public int getA(){
        return this.a;
    }
    public void setA(int a){
        this.a = a;
    }
    
    public int getC(){
        return this.c;
    }
    public void setC(int c){
        this.c = c;
    }
    
    public int getASuper(){
        return super.getA();
    }
    public void setASuper(int a){
        super.setA(a);
    } 
    
    public int getBSuper(){
        return super.getB();
    }
    public void setBSuper(int b){
        super.setB(b);
    } 
    
    public String toString(){
        return "a da Derivada: "+ this.a +" // c da Derivada: " + this.c + " // " + super.toString();
    }
    
    public int soma(){
        int soma;
        soma = this.a + this.c + super.getA() + super.getB();
        return soma;
    }
    
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && this.getClass() == obj.getClass()){
            Derivada e = (Derivada) obj;
            ig = (this.getA() == e.getA()) && (this.getB() == e.getB()) && (super.equals(e));
        }
        else
            ig = false;
        return ig;
    }
    
    public Object clone(){
        Base b = new Base(this.getASuper(), this.getBSuper());
        Derivada copia = new Derivada(b, this.getA(), this.getC());
        return copia;
    }
    
    public static void main(String[] args) {
        Base b = new Base(1, 2);
        Derivada blinha = new Derivada(b, 3, 4);
        
        System.out.println(blinha.getASuper());
        System.out.println(blinha.getBSuper());
        System.out.println(blinha.getA());
        System.out.println(blinha.getC());
        System.out.println(blinha);
        System.out.println(blinha.soma());
        
        Derivada blinha1 = (Derivada) blinha.clone();
        Derivada blinha2 = new Derivada(b, 1, 2);
        
        System.out.println(blinha.equals(blinha1));
        System.out.println(blinha.equals(false));
    }
}
