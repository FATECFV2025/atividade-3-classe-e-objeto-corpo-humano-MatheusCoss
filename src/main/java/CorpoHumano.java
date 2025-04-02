package main.java;


public class CorpoHumano {
    private double massa;
    private double volume;
    private double densidade;
    private double altura;
    private double peso;
    private double imc;


    public CorpoHumano(double massa, double volume, double altura, double peso){
        this.massa = massa;
        this.volume = volume;
        this.altura = altura;
        this.peso = peso;
        this.densidade = massa / volume;
    }

    public double getMassa(){
        return this.massa;
    }

    public double getVolume(){
        return this.volume;
    }

    public double getDensidade(){
        return this.densidade;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public double getImc(){
        return this.imc;
    }

    public void setMassa(float massa){
        this.massa = massa;
        this.densidade = this.massa / this.volume;

    }

    public void setVolume(double volume){
        this.volume = volume;
        this.densidade = this.volume / this.massa;
    }

    public void setAltura(double altura){
        this.altura = altura;
        this.imc = this.calcularIMC();
    }

    public void setPeso(double peso){
        this.peso = peso;
        this.imc = this.calcularIMC();
    }



    public double calcularIMC(){
        this.imc = this.peso / this.altura;
        return this.imc;
        
    }
}
