package Principal;

import Reticos.Salud.Persona;

public class inicio {
    public static void main(String[] args) {
        Persona laura = new Persona();
        laura.pedirDatos();
        laura.mostrarPersona();
        laura.calcularImc();
        laura.mayorEdad();
    }
}
