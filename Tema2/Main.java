import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        boolean este = false;
            while(!este)
                try {
                    double result = calculator.insertVal();
                    System.out.println("Rezultatul este: " + result);
                    este=true;
                }
                catch(Exception e) {
                    e.printStackTrace();
        }


        //keep it simple
        //do not repeat yourself
        //implementeaza doar atunci cand e nevoie

        MatrixDataHandler mH = new MatrixDataHandler(5, 7, "matrix.txt");
        mH.modifyValueAndUpdateFile("matrix.txt", 3, 4, 12);
        mH.getValueFromPosition("matrix.txt", 3,4);
    }
}
