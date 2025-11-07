package ar.edu.unahur.obj2.observer;

public class Oferta {
    private Subastador subastador;
    private Double valorOfertado;

    public Oferta(Subastador subastador, Double valor) {
        this.subastador = subastador;
        this.valorOfertado = valor;
    }

    public double getValor() {
        return this.valorOfertado;
    }

    public Subastador getSubastador() {
        return this.subastador;
    }

}
