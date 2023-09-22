package main;

public class Empregado {
    // variáveis de instância
    private long nss;
    private String nome;
    private double salario;
    private long[] telefones; // vai conter os contactos do empregado, telefone fixo e telemóvel

    //construtores
    public Empregado() {
        nss = 0;
        nome = "";
        salario = 0.0;
        telefones = new long[2];
    }

    public Empregado(long nss, String nome) {
        this.nss = nss;
        this.nome = nome;
        this.salario = 0.0;
        telefones = new long[2];
    }
    //métodos de instância

    public long getNss() {
        return nss;
    }

    public void setNss(long nss) {
        this.nss = nss;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void subirSalario(double aumento) {
        salario = salario + salario * aumento / 100;
    }

    public long[] getTelefones() {
        return telefones;
    }

    public void setTelefones(long[] telefones) {
        // this.telefones = telefones; // !!!!!!!! Porque não assim?
        for (int i = 0; i < telefones.length; i++) {
            this.telefones[i] = telefones[i];
        }
    }

    public String toString() {
        String s = "Nss = " + nss + " / Nome: " + nome + " / Salário: " + salario + " / Telefones: ";
        for (int i = 0; i < telefones.length; i++) {
            s = s + ", " + telefones[i];
        }
        return s;
    }
}
