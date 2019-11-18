package Life01;

import java.io.IOException;

class Output {
    static void printField(char[][] massiv) throws IOException {

//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                System.out.print(massiv[i][j] + "\t");
            }
            System.out.println();
        }
        // method body


    }
}
