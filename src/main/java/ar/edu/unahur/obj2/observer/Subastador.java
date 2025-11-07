package ar.edu.unahur.obj2.observer;

public class Subastador implements Observador {
    private String nombre;
    private Oferta ultimaOferta;
    private EstrategiaDeOferta estrategia;

    public Subastador(String nombre) {
        this.nombre = nombre;
        this.ultimaOferta = null;
        this.estrategia = new EstrategiaArriesgado();
    }

    public Subastador(String nombre, EstrategiaDeOferta estrategia) {
        this.nombre = nombre;
        this.ultimaOferta = null;
        this.estrategia = estrategia;
    }

    public Oferta getUltimaOferta() {
        return this.ultimaOferta;
    }

    public EstrategiaDeOferta getEstrategia() {
        return this.estrategia;
    }

    public void setEstrategia(EstrategiaDeOferta estrategia) {
        this.estrategia = estrategia;
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
        this.estrategia.crearOferta(this, producto);
    }

}
