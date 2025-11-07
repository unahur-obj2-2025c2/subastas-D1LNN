package ar.edu.unahur.obj2.observer;

public class EstrategiaOfertaUnica implements EstrategiaDeOferta {

    @Override
    public void crearOferta(Subastador subastador, ProductoSubastado producto) {
        if (subastador.getUltimaOferta() == null) {
            Double valor = 10.0;
            Oferta nuevaOferta = new Oferta(subastador, valor); 
            producto.agregarOferta(nuevaOferta);
        }
    }

}
