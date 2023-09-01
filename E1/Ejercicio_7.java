package E1;
public class Ejercicio_7 {
    public static void main(String[] args){
        int x=1, y=2, z=3;

        if(++x > y++ || x-- > 0)
            z++;
        else
            z--;
        System.out.println(x + " " + y + " " + z);
    }
}

/***
 * Respuesta:   1 3 4
*/