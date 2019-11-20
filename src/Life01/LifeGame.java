package Life01;

import java.io.IOException;
import java.util.Arrays;

// https://ru.wikipedia.org/wiki/%D0%98%D0%B3%D1%80%D0%B0_%C2%AB%D0%96%D0%B8%D0%B7%D0%BD%D1%8C%C2%BB
//в пустой (мёртвой) клетке, рядом с которой ровно три живые клетки, зарождается жизнь;
//если у живой клетки есть две или три живые соседки, то эта клетка продолжает жить;
//в противном случае, если соседей меньше двух или больше трёх, клетка умирает («от одиночества» или «от перенаселённости»)

class LifeGame {
    final private static byte SIZE = 10;
    static private char[][] field = new char[SIZE][SIZE];


    public static void main(String[] args) throws IOException, InterruptedException {

        // set an empty field:
        {
            for (char[] chars : field) {
                Arrays.fill(chars, '-');
            }
        }

        // set a figure:
        {
            field[1][3] = 'X';
            field[2][3] = 'X';
            field[2][1] = 'X';
            field[3][2] = 'X';
            field[3][3] = 'X';
        }

        for (int m = 0; m < 15; m++) {
            System.out.println("\n \n \n \n \n");
            Output.printField(field);
            field = Round.doRound(field);
            Thread.sleep(500);
        }

        Thread.sleep(5000);
        System.out.println("GAME OVER! Bye");

    }
}
