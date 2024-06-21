package utilizacion;

import framework.Accion;

public class AccionUno implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando AccionUno...");
        // Lógica específica de la acción
    }

    @Override
    public String nombreItemMenu() {
        return "Accion 1";
    }

    @Override
    public String descripcionItemMenu() {
        return "Esto es para traer los twitts de Maradona...";
    }
}
