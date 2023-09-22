
package exemplo;
import java.util.ArrayList;

public class Exemplo {
    private int n;
    private String s;
    private int[] listaX;
    private ArrayList<String> listaY;
    private Telefone[] listaT;
    private ArrayList<Telefone> listaZ;
    
    public Exemplo(){
        n = 0; 
        s = "";
        listaX = new int[10];
        for(int i = 0; i < listaX.length; i++){
            listaX[i] = 0;
        }
        listaY = new ArrayList<String>();
        listaT = new Telefone[5];
        for(int i = 0; i < listaT.length; i++){
            listaT[i] = new Telefone();
        }
        listaZ = new ArrayList<Telefone>();
        
        }
    
    public int getN(){
        return n;
    }
    
    public void setN(int n){
        this.n = n;
    }
    
    public String getS(){
        return s;
    }
    
    public void setS(String s){
        this.s = s;
    }
    
    public int[] getListaX(){
        return listaX;
    }
    
    public void setListaX(int[] listaX){
        for(int i = 0; i < listaX.length; i++){
            this.listaX[i] = listaX[i];
        }
    }
    
    public ArrayList<String> getListaY(){
        return listaY;
    }
    
    public void setListaY(ArrayList<String> listaY){
        this.listaY = (ArrayList<String>) listaY.clone();
    }
    
    public Telefone[] getListaT(){
        return listaT;
    }
    
    public void setListaT(Telefone[] listaT){
        for(int i = 0; i < listaT.length; i++){
            this.listaT[i].setNumero(listaT[i].getNumero());
            this.listaT[i].setTipo(listaT[i].getTipo());
        }
    }
    
    public ArrayList<Telefone> getListaZ(){
        return listaZ;
    }
    
    public void setListaZ(ArrayList<Telefone> listaZ){
        this.listaZ = (ArrayList<Telefone>) listaZ.clone();
    }
    
    public String toString(){
        String s;
        s = "N: " + this.n + " " + "S: " + this.s;
        for(int i = 0; i < listaX.length; i++){
            s = s + " " + "ListaX: " + listaX[i];
        }
        s = s + " "+ "ListaY: " + listaY;
        for(int i = 0; i < listaT.length;i++){
            s = s + " " + "ListaT: " + listaT[i];
        }
        s = s + " ListaZ: " + listaZ;
        return s;
    }
    
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && this.getClass() == obj.getClass()){
            Exemplo e = (Exemplo) obj;
            ig = ((this.n == e.n) && (this.s == e.s));
            for(int i = 0; i < listaX.length; i++){
                ig = ig && (this.listaX[i] == e.listaX[i]); // Adoconei [i]
            }
            /*for(int i = 0; i < listaY.size(); i++){
                ig = ig && this.listaY.get(i).equals(e.listaY.get(i));
            }*/
            ig = (ig && (this.listaY.equals(e.listaY))); 
            for(int i = 0; i < listaT.length; i++){
                ig = ig && (this.listaT[i].getNumero() == e.listaT[i].getNumero());
                ig = ig && (this.listaT[i].getTipo() == e.listaT[i].getTipo());
            }
            /*for(int i = 0; i < listaZ.size(); i++){
                ig = ig && (this.listaZ.get(i).getNumero() == e.listaZ.get(i).getNumero());
                ig = ig && (this.listaZ.get(i).getTipo() == e.listaZ.get(i).getTipo());
            }*/
            ig = ig && (this.listaZ.equals(this.listaZ));
        }
        else{
            return ig;
        }
        return ig;
        
    }
    
    public Object clone(){
        Exemplo e = new Exemplo();
        e.n = this.n;
        e.s = this.s;
        for(int i = 0; i < listaX.length; i++){
            e.listaX[i] = this.listaX[i];
        }
        /*for(int i = 0; i < listaY.size(); i++){
            e.listaY.add(this.listaY.get(i));
        }*/
        e.listaY = (ArrayList<String>)this.listaY.clone();
        for(int i = 0; i < listaT.length; i++){
            e.listaT[i].setNumero(this.listaT[i].getNumero());
            e.listaT[i].setTipo(this.listaT[i].getTipo());
        }
        /*for(int i = 0; i < listaZ.size(); i++){
            e.listaZ.add(this.listaZ.get(i));
        }*/
        e.listaZ = (ArrayList<Telefone>)this.listaZ.clone(); 
        return e;
    
    }
    
    
    

    
    
    
}
