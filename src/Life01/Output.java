package Life01;


class Output {
    static void printField(char[][] massiv) {

        for (char[] chars : massiv) {
            for (char aChar : chars) {
                System.out.print(aChar + "\t");
            }
            System.out.println();
        }
        // method body


    }
}
