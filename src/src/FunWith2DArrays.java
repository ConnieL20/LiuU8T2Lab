public class FunWith2DArrays {

    public static void asciiPrinter(String[][] strings){
        for (int row = 0; row < strings.length; row++){
            for (int col = 0; col < strings[row].length; col++){
                System.out.print(strings[row][col]);
            }
            System.out.println();
        }
    }

    public static double average(int[][] ints){
        double sum = 0;
        double total = 0;
        double average = 0;

        for (int row = 0; row < ints.length; row++){
            for (int col = 0; col < ints[row].length; col++){
                sum += ints[row][col];
                total++;
            }
        }
        average = sum/total;
        return average;
    }

    public static int[] indexFound(String[][] str, String target){
        int rowNum = 0;
        int colNum = 0;
        int[] index = new int[2];
        index[0] = -1;
        index[1] = -1;


        for (int row = 0; row < str.length; row++){
            rowNum = row;
            for (int col = 0; col < str[row].length; col++){
                colNum = col;
                if (str[row][col].equals(target)){
                    index[0] = rowNum;
                    index[1] = colNum;
                }
            }
        }
        return index;
    }

    public static int[][] split(int[][] ints, int rowNum, int colNum){

        if (rowNum >= ints.length || colNum >= ints[0].length){
            int[][] splitArray = new int[0][0];
            return splitArray;
        }
        int[][] split2DArray = new int[rowNum + 1][colNum + 1];

        for (int row = 0; row < rowNum + 1; row++){
            for (int col = 0; col < colNum + 1; col++){
                split2DArray[row][col] = ints[row][col];
            }
        }
        return split2DArray;
    }

    public static int[][] invert(int[][] ints){

        int[][] reversed = new int[ints[0].length][ints.length];

        for (int row = 0; row < ints.length; row++){
            for (int col = 0; col < ints[0].length; col++){
                reversed[col][row] = ints[row][col];
            }
        }
        return reversed;
    }
}
