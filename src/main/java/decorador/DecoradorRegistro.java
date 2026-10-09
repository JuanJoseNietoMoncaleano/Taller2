package decorador;

public class DecoradorRegistro extends DecoradorNotificacion {
    public DecoradorRegistro(Notificacion notificacionEnvuelve) {
        super(notificacionEnvuelve);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("  [REGISTRO/LOG] Bitácora: Enviando notificación...");
        super.enviar(mensaje);
    }
}