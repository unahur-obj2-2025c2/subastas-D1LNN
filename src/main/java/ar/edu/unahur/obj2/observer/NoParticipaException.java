package ar.edu.unahur.obj2.observer;

public class NoParticipaException extends RuntimeException {

    public NoParticipaException() {
        super("El subastador no participa en la subasta.");
    }

}
