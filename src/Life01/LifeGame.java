package Life01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

// https://ru.wikipedia.org/wiki/%D0%98%D0%B3%D1%80%D0%B0_%C2%AB%D0%96%D0%B8%D0%B7%D0%BD%D1%8C%C2%BB
//в пустой (мёртвой) клетке, рядом с которой ровно три живые клетки, зарождается жизнь;
//если у живой клетки есть две или три живые соседки, то эта клетка продолжает жить;
//в противном случае, если соседей меньше двух или больше трёх, клетка умирает («от одиночества» или «от перенаселённости»)

class LifeGame {
    final public static byte SIZE = 10;
    static char[][] field = new char[SIZE][SIZE];


    public static void main(String[] args) throws IOException {

        // set an empty field:
        {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    field[i][j] = '-';
                }
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

        String stopit = null;
        do {
            Output.printField(field);
            field = Round.doRound(field);

            System.out.println("Press any key for next round, 'x' for exit");

            BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
            stopit = rdr.readLine();
        }         while (!stopit.equals("x"));

        System.out.println("GAME OVER! Bye");

    }
}
