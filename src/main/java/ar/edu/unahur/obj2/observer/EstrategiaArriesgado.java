package ar.edu.unahur.obj2.observer;

public class EstrategiaArriesgado implements EstrategiaDeOferta {

    @Override
    public void crearOferta(Subastador subastador, ProductoSubastado producto) {
        Double valor = (subastador.getUltimaOferta() == null) ? 10.0 : subastador.getUltimaOferta().getValor() + 10.0;
        Oferta nuevaOferta = new Oferta(subastador, valor); 
        producto.agregarOferta(nuevaOferta);
    }

}
