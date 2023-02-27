import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /**
     * Aceasta metoda calculeaza suma dintre x ridicat la puterea a-5a si y ridicat la putearea a-7a.
     * @return Returneaza rezultatul calculat.
     * @throws IOException Arunca exceptie daca datele introduse nu au formatul corect.
     */

    //exceptie aruncata
    //denumire metoda
    //reia citirea in cazu valorilor non-numerice
    //metoda separata pt ridicarea la putere
    public double insertVal() throws IOException {
        double result = 0.0;

        try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Tastati valoarea pentru X:");
        double x = Double.parseDouble(reader.readLine());

        System.out.println("Tastati valoarea pentru Y:");
        double y = Double.parseDouble(reader.readLine());

        double rez1 = calculatePower(5,x);

        double rez2 = calculatePower(7,y);

        return rez1+rez2;}
        catch(Exception ex){
            throw new IOException("Ceva ne se citeste bine");
        }
    }

    public double calculatePower(double n, double x) {
        double cv=x;
        for (int i = 1; i < n; i++) {
            cv *= x;
        }
        return cv;
    }
}