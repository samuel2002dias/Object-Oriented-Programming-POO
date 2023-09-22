package exemplo;
import java.util.ArrayList;

public class e {
    private int n;
    private String s;
    private int[] listaX;
    private ArrayList<String> listaY;
    private Telefone[] listaT;  
    private ArrayList<Telefone> listaZ;
    
    public e(){
        n = 0;
        s = "";
        listaX = new int[10];
        for(int i=0; i<listaX.length; i++)
            listaX[i] = 0;
        listaY = new ArrayList<String>();
        listaT = new Telefone[3];
        for(int i=0;i<listaT.length; i++)
            listaT[i] = new Telefone();
        listaZ = new ArrayList<Telefone>();
    }
    
    public void setN(int n){
        this.n = n;
    }
    public int getN(){
        return this.n;
    }
    
    public void setS(String s){
        this.s = s;
    }
    public String getS(){
        return this.s;
    }
    
    public void setListaX(int[] lista){
        for(int i=0; i<this.listaX.length; i++)
            this.listaX[i] = lista[i];
    }
    public int[] getListaX(){
        return this.listaX;
    }
    
    public void setListaY(ArrayList<String> lista){
        this.listaY = (ArrayList<String>) lista.clone();
    }
    public ArrayList<String> getListaY(){
        return this.listaY;
    }
    
    public void setListaT(Telefone[] lista){
        for(int i=0; i<lista.length;i++){
            this.listaT[i].setTipo(lista[i].getTipo());
            this.listaT[i].setNumero(lista[i].getNumero());
        }
    }
    public Telefone[] getListaT(){
        return this.listaT;
    }
    
    public void setListaZ(ArrayList<Telefone> lista){
        this.listaZ = (ArrayList<Telefone>) lista;
    }
    public ArrayList<Telefone> getListaZ(){
        return this.listaZ;
    }
    
    public String toString(){
        String s = "N:"+this.n+" S:"+this.s+" ListaX[";
        for(int i=0;i<this.listaX.length;i++){
            if(i != this.listaX.length - 1)
                s = s + this.listaX[i] + ",";
            else
                s = s + this.listaX[i] + "] ";
        }
        s = s + "ListaY"+this.listaY+" ListaT[";
        for(int i=0;i<this.listaT.length;i++){
            if(i != this.listaT.length - 1 && this.listaT[i+1].getNumero()!=0 && !this.listaT[i].getTipo().equals(""))
                s = s + this.listaT[i] + "// ";
            else
                s = s + this.listaT[i] + "] ";
        }
        s = s + "ListaZ"+this.listaZ;
        return s;
    }
    
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && obj.getClass() == this.getClass()){
            e exp = (e) obj;
            ig = ((this.n == exp.n) && (this.s == exp.s));
            for(int i=0; i<this.listaX.length;i++)
                ig = ig && (this.listaX[i] == exp.listaX[i]);
            ig = (ig && (this.listaY.equals(exp.listaY))); 
            for(int i=0; i<this.listaT.length;i++){
                ig = ig && (this.listaT[i].getNumero() == exp.listaT[i].getNumero());
                ig = ig && (this.listaT[i].getTipo() == exp.listaT[i].getTipo());
            }
            ig = ig && (this.listaZ.equals(this.listaZ));
        }
        else
            ig = false;
        return ig;
    }
    
    public Object clone(){
        e copia = new e();
        copia.n = this.n;
        copia.s = this.s;
        
        for(int i=0; i<this.listaX.length;i++)
            copia.listaX[i] = this.listaX[i];
        copia.listaY = (ArrayList<String>)this.listaY.clone();
        for(int i=0; i<this.listaT.length;i++){
            copia.listaT[i].setNumero(this.listaT[i].getNumero());
            copia.listaT[i].setTipo(this.listaT[i].getTipo());
        } 
        copia.listaZ = (ArrayList<Telefone>)this.listaZ.clone();       
        return copia;
    }
}
