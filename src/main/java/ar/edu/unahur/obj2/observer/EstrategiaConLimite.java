package ar.edu.unahur.obj2.observer;

public class EstrategiaConLimite implements EstrategiaDeOferta {

    private Double limite;

    public EstrategiaConLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public void crearOferta(Subastador subastador, ProductoSubastado producto) {
        Double valorActual = (subastador.getUltimaOferta() == null) ? 10.0 : subastador.getUltimaOferta().getValor() + 10.0;
        if (valorActual <= limite) {
            Oferta nuevaOferta = new Oferta(subastador, valorActual);
            producto.agregarOferta(nuevaOferta);
        }
    }

}
