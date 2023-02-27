import java.io.*;

public class MatrixDataHandler {
    private int[][] matrix;
    private int h;
    private int w;
    private String filename;
    private int verifh;
    private int verifw;

    /**
     *
     * @param h - inaltimea, nr de linii a matricei
     * @param w - lungimea, nr de coloane a matricei
     * @param filename - denumirea fisierului in care scriem si din care citim matricea
     * verifh
     * verifw le folosim pt a verifica daca a fost schimbat fisierul filename
     */


    public MatrixDataHandler(int h, int w, String filename) {
        this.h = h;
        verifh=h; verifw=w;
        this.w = w;
        this.filename = filename;
        matrix = new int[h][];
        for (int i = 0; i < h; i++) {
            matrix[i] = new int[w];
        }
        scriereMatrice(filename);
    }

    public int getValueFromPosition(String filename, int posH, int posW) {
            citireMatrice(filename);
            return matrix[posH][posW];
    }

    public int[][] citireMatrice(String filename){
        try {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        h = Integer.parseInt(line.split(" ")[0]);
        w = Integer.parseInt(line.split(" ")[1]);
            if(h!=verifh || w!=verifw)
                throw new Exception("Cineva a modificat matrix.txt");
            //tre sa tratam exceptia in cazu in care nu avem spatiu
        for (int i = 0; i < h; i++) {
            line = br.readLine();
            for (int j = 0; j < w; j++) {
                matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
            }
        }
        br.close();
        return matrix;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    public void scriereMatrice(String filename){
        try {
        FileWriter fw = new FileWriter(filename);
        fw.write(h + " " + w + "\n");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                fw.write(matrix[i][j] + " ");
            }
            fw.write("\n");
        }
        fw.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void modifyValueAndUpdateFile(String filename, int posH, int posW, int val) {
        try {
            citireMatrice(filename);
            if(posH>=0 && posH<=h-1 && posW>=0 && posW<=w-1){
            matrix[posH][posW] = val;}else{
                throw new Exception("Valorile sunt in afara matricei");
            }
            scriereMatrice(filename);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}//reducem la jumatate

//Ex2:
//-tratare caz in care a fost modificat fisierul
//separare in diferite metode - citire in matrice din fisier - scriere matrice in fisier - alocare spatiu matrice
//tratare exceptii
