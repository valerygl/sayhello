package Life01;


class Round {
    static char[][] doRound(char[][] massiv)  {
        int cnt = 0;
        byte sz = (byte) massiv.length;
        // set an empty field:
        char[][] tmpfield = new char[sz][sz];

        {
            for (int i = 0; i < sz; i++) {
                for (int j = 0; j < sz; j++) {
                    tmpfield[i][j] = '-';
                }
            }
        }  // временное поле tmpfield создано

        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                cnt = 0;
                if ((i > 0) && (j > 0) && (massiv[i-1][j-1] == 'X')) {cnt++;} // слева сверху
                if ((i > 0) && (j < sz-1) && (massiv[i-1][j+1] == 'X')) {cnt++;} // справа сверху
                if ((i > 0)  && (massiv[i-1][j] == 'X')) {cnt++;} // сверху

                if ((j < sz-1) && (massiv[i][j+1] == 'X')) {cnt++;} // справа
                if ((j > 0) && (massiv[i][j-1] == 'X')) {cnt++;} // слева

                if ((i < sz-1) && (j < sz-1) && (massiv[i+1][j+1] == 'X')) {cnt++;} // справа внизу
                if ((i < sz-1) && (j > 0) && (massiv[i+1][j-1] == 'X')) {cnt++;} // слева внизу
                if ((i < sz-1) && (massiv[i+1][j] == 'X')) {cnt++;} // внизу

                if ((cnt > 3) || (cnt < 2)) {  tmpfield[i][j] = '-';  }

                else if (cnt == 3) {  tmpfield[i][j] = 'X';  }

                else if ((cnt == 2) & (massiv[i][j] == 'X')) {
//                    tmpfield[i][j] = Character.forDigit(cnt, 10);
                      tmpfield[i][j] = 'X';
                }

                else { tmpfield[i][j] = '-'; }

            }
        }
        return tmpfield;
    }
}
