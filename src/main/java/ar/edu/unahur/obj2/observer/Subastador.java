package ar.edu.unahur.obj2.observer;

public class Subastador implements Observador {
    private String nombre;
    private Oferta ultimaOferta;

    public Subastador(String nombre) {
        this.nombre = nombre;
    }

    public Oferta getUltimaOferta() {
        return this.ultimaOferta;
    }

    @Override
    public void actualizar(Oferta oferta) {
        this.ultimaOferta = oferta;
    }

    public void reiniciarUltimaOferta() {
        this.ultimaOferta = null;
    }

    public void resgistarEnProducto(ProductoSubastado producto) {
        producto.registrarSubastador(this);
        }

    public void realizarOferta(ProductoSubastado producto) {
        Double valor = (this.ultimaOferta == null) ? 10.0 : this.ultimaOferta.getValor() + 10.0;
        Oferta nuevaOferta = new Oferta(this, valor); 
        producto.agregarOferta(nuevaOferta);
    }

}
