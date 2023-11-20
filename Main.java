import java.util.*;
public class Main {
    public static void main(String[] args) {
        Autopark a = new Autopark();

        a.AddCar("x323qw", "bmw suck my ass", "me");
        a.AddCar("a423xc", "mercedass", "a");
        a.Print();

        a.Sort("currentDrive");
        a.Print();
    }
}