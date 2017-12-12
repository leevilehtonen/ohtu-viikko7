package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KonsoliIO implements IO {

    private Scanner scanner;

    public KonsoliIO() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String nextLine() {
        return scanner.nextLine();
    }
}
