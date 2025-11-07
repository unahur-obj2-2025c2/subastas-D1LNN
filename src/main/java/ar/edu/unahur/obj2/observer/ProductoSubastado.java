package ar.edu.unahur.obj2.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductoSubastado {
    private List<Oferta> ofertas = new ArrayList<>();
    private Set<Subastador> subastadores = new HashSet<>();

    public void reiniciar() {
        this.subastadores.clear();
        this.ofertas.clear();
    }

    public void registrarSubastador(Subastador subastador) {
        this.subastadores.add(subastador);
    }

    public void agregarOferta(Oferta nuevaOferta) {
        if (! this.subastadores.contains(nuevaOferta.getSubastador())) {
            throw new NoParticipaException();
        }
        else {
            this.ofertas.add(nuevaOferta);
            this.notificarOferta(nuevaOferta);
        }
    
    }

    private void notificarOferta(Oferta nuevaOferta) {
        this.subastadores.stream().forEach(subastador -> subastador.actualizar(nuevaOferta));}

}
