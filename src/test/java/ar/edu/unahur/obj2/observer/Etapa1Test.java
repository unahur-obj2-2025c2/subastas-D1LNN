package ar.edu.unahur.obj2.observer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Etapa1Test {
    private Subastador subastador1 = new Subastador("gonzager");
    private Subastador subastador2 = new Subastador("diazdan");
    private Subastador subastador3 = new Subastador("martomau");
    private ProductoSubastado producto = new ProductoSubastado();


    @BeforeEach
    
    void setUp() {

    producto.reiniciar();

    subastador1.reiniciarUltimaOferta();
    subastador2.reiniciarUltimaOferta();
    subastador3.reiniciarUltimaOferta();

    subastador1.resgistarEnProducto(producto);
    subastador3.resgistarEnProducto(producto);

    subastador3.realizarOferta(producto);
    subastador1.realizarOferta(producto);
    subastador3.realizarOferta(producto);
    }

    @Test

    void 



}
