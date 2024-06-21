package utilizacion;

import framework.Accion;

public class AccionTres implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando AccionDos...");
        // Lógica específica de la acción
    }

    @Override
    public String nombreItemMenu() {
        return "Accion 3";
    }

    @Override
    public String descripcionItemMenu() {
        return "Esto trae las primeras diez personas de la BD...";
    }
}
