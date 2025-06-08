import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sueldo[] employeds = {
                new Developer("Juan", 25, 2, 21),
                new Diseñador("Carlos", 25, 6, 30),
                new Gerent("Gabriel", 10, 3, 20)
        };

        for (Sueldo e : employeds) {
            System.out.println(e.sueldoTotal());
        }
    }
}