package decorador;

public class DecoradorCompresion extends DecoradorNotificacion {
    public DecoradorCompresion(Notificacion notificacionEnvuelve) {
        super(notificacionEnvuelve);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("  [COMPRESIÓN] Mensaje comprimido para ahorrar ancho de banda.");
        super.enviar(mensaje);
    }
}