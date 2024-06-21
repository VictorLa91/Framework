package utilizacion;

import framework.Accion;

public class AccionDos implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando AccionDos...");
        // Lógica específica de la acción
    }

    @Override
    public String nombreItemMenu() {
        return "Accion 2";
    }

    @Override
    public String descripcionItemMenu() {
        return "Esto trae las primeras diez personas de la BD...";
    }
}
