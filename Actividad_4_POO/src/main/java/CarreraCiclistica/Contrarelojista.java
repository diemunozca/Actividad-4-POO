package CarreraCiclistica;

public class Contrarelojista extends CarreraCiclistica.Ciclista {
    private double velocidadMaxima;

    public Contrarelojista(double velocidadMaxima, int identificador, String nombre) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    protected double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Contrarrelojista{" + "Velocidad maxima=" + velocidadMaxima + '}');
    }

    @Override
    protected String imprimirTipo(){
        return "Es un contrarrelojista";
    }
}
