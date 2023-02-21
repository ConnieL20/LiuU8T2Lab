import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // TEST CODE FOR asciiPrinter
        String[][] ascii = {
                {" ", " ", "_", "_", "_", " ", " "},
                {" ", "(", "o", " ", "o", ")", " "},
                {"(", " ", " ", "V", " ", " ", ")"},
                {" ", "-", "m", "-", "m", "-", " "},
        };
        FunWith2DArrays.asciiPrinter(ascii);

        // TEST CODE FOR average
        int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(FunWith2DArrays.average(testArr1));
        int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.average(testArr2));
        int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.average(testArr3));
        int[][] testArr4 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.average(testArr4));
        int[][] testArr5 = {{4}};
        System.out.println(FunWith2DArrays.average(testArr5));

        // TEST CODE FOR indexFound
        System.out.println("--------------");
        String[][] letters = {{"a", "b", "c"}, {"d", "e", "f"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(letters, "f")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(letters, "d")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(letters, "b")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(letters, "g")));
        System.out.println("--------------");
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "stuff")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "good")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "map")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "cat")));
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "time")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "joy")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "bam")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "cat")));

        // TEST CODE FOR split
        System.out.println("-------test1--------");
        int[][] testArr6 = {{1, 2, 3}, {4, 5, 6}};
        int[][] t1 = FunWith2DArrays.split(testArr6, 1, 1);
        for (int[] row : t1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test2--------");
        int[][] testArr7 = {{10, 11, 12, 13}, {20, 21, 22, 23}, {30, 31, 32, 33}};
        int[][] t2 = FunWith2DArrays.split(testArr7, 2, 1);
        for (int[] row : t2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test3--------");
        int[][] testArr8 = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24}
        };
        int[][] t3 = FunWith2DArrays.split(testArr8, 3, 2);
        for (int[] row : t3) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test4--------");
        int[][] t4 = FunWith2DArrays.split(testArr8, 2, 5);
        for (int[] row : t4) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test5--------");
        int[][] t8 = FunWith2DArrays.split(testArr8, 0, 4);
        for (int[] row : t8) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test6--------");
        int[][] t9 = FunWith2DArrays.split(testArr8, 0, 0);
        for (int[] row : t9) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test7--------");
        int[][] t5 = FunWith2DArrays.split(testArr8, 3, 5);
        for (int[] row : t5) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test8--------");
        int[][] t10 = FunWith2DArrays.split(testArr8, 3, 0);
        for (int[] row : t10) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test9--------");
        int[][] t6 = FunWith2DArrays.split(testArr8, 4, 2);
        for (int[] row : t6) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test10-------");
        int[][] t7 = FunWith2DArrays.split(testArr8, 2, 6);
        for (int[] row : t7) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


        // TEST CODE FOR invert
        System.out.println("---invert test1---");
        int[][] test1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] ts1 = FunWith2DArrays.invert(test1);
        for (int[] row : ts1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("orig array not modified:");
        for (int[] row : test1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("---invert test2---");
        int[][] test2 = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24}
        };
        int[][] ts2 = FunWith2DArrays.invert(test2);
        for (int[] row : ts2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("---invert test3---");
        int[][] test3 = {{10}};
        int[][] ts3 = FunWith2DArrays.invert(test3);
        for (int[] row : ts3) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }




}
