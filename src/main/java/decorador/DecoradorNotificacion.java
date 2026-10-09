package decorador;

public abstract class DecoradorNotificacion implements Notificacion {
    protected final Notificacion notificacionEnvuelve;

    public DecoradorNotificacion(Notificacion notificacionEnvuelve) {
        this.notificacionEnvuelve = notificacionEnvuelve;
    }

    @Override
    public void enviar(String mensaje) {
        this.notificacionEnvuelve.enviar(mensaje);
    }
}