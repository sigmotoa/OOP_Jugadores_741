import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        //j1.id=1;
        //j1.name="Maradona";
        j1.dorsal=10;
        j1.altura=1.65f;
        j1.peso=70.5f;
        j1.equipo="Argentina";
        j1.nacimiento=new Date(
                1960,
                Calendar.OCTOBER,
                30);

        Jugador j2 = new Jugador();
        //j2.id=2;
        //j2.name="Ronaldo";
        j2.dorsal=10;
        j2.altura=1.64f;
        j2.peso=74.5f;
        j2.equipo="Brasil";
        j2.nacimiento=new Date(1976,9,18);

        Jugador j3 = new Jugador(
                3,
                "Kane",
                9,
                new Date(1993,7,28),
                "Inglaterra"
        );

        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);

        Jugador jotas [] = new Jugador[3];
        jotas[0]=j1;
        jotas[1]=j2;
        jotas[2]=j3;

        for (Jugador j : jotas) {
            System.out.println(j);
        }



    }
}