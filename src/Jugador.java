import java.util.Date;

public class Jugador extends Persona {
    int dorsal;
    Date nacimiento;
    float altura;
    float peso;
    String equipo;


    public Jugador() {}
    public Jugador(int id, String name, int dorsal,
                   Date nacimiento, String equipo) {

        this.dorsal = dorsal;
        this.nacimiento = nacimiento;
        this.equipo = equipo;

    }

    @Override
    public String toString() {
        return "{Name: " + ", Dorsal: " + dorsal+", País: "+equipo+"}";
    }

    public void correr() {

    }
    public boolean patear(float potencia, String direccion)
    {
        return true;
    }
    public boolean pasar(Jugador receptor, float fuerza)
    {
        return true;
    }

}
