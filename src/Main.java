import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
        W programie zapisz liczbę całkowitą z nazwą number
        o początkowej wartości 0.
        Dodaj BufferedReader do odczytu danych od uzytkownika.
        Pamiętaj o potencjalnym wyjątku, który musi być obsłużony.
        Stwórz dowolną nieskończoną pętlę.
        W każdej iteracji poproś użytkownika o wpisanie liczby,
        odczytaj informacje od uzytkownika z konsoli za pomocą BufferedReader.
        Jeśli wpisane będzie quit zakończ działanie pętli.
        Aby porównać łańcuchy znaków wykorzystaj metodę equalsIgnoreCase()
        która jest w string
        do zmiennej number. Zaprezentuj aktualną wartość number
        na koniec każdej iteracji.
         */
        String str1 = "quit";
        //System.out.println(str1.equalsIgnoreCase("QU2IT"));
        int number = 0;
        BufferedReader buffReader
                = new BufferedReader(new InputStreamReader(System.in));

        String line;
        System.out.println("Wpisz liczbę lub 'Quit' jeśli chcesz wyjść");
        while ((line = buffReader.readLine()) != null) {
                         if (str1.equalsIgnoreCase(line)) {
                            System.out.println("Wyjście z programu");
                break;
            }
                        int num = number += Integer.valueOf(line);
                        System.out.println("Suma podanych liczb to: " + num);

        }
    }
}