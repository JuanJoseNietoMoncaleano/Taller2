package model;

import adaptador.AdaptadorPago;
import adaptador.ProcesadorPago;
import adaptador.ServicioPagoExterno;
import decorador.DecoradorCompresion;
import decorador.DecoradorRegistro;
import decorador.Notificacion;
import decorador.NotificacionBasica;
import fachada.FachadaTienda;
import proxy.ProxyInventario;
import proxy.ServicioInventario;

public class Main {
    public static void main(String[] args) {

        ServicioInventario inventario = new ProxyInventario(true);


        ServicioPagoExterno servicioExterno = new ServicioPagoExterno();
        ProcesadorPago procesadorPago = new AdaptadorPago(servicioExterno);


        Notificacion notificacion = new NotificacionBasica();
        notificacion = new DecoradorRegistro(notificacion);
        notificacion = new DecoradorCompresion(notificacion);

        FachadaTienda tienda = new FachadaTienda(inventario, procesadorPago, notificacion);


        tienda.realizarCompra("Balón de Fútbol Profesional", 1, 145000.0);
    }
}
