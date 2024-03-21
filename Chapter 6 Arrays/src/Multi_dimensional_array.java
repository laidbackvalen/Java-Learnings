import java.util.Arrays;

public class Multi_dimensional_array {
    public static void main(String[] args) {


        int[][] flats;  //2D array
        flats = new int[2][3];   //   [row] [column]

        flats[0][0] = 101;        //   [0]   [0]     value = 101
        flats[0][1] = 102;        //   [0]   [1]     value = 101
        flats[0][2] = 103;        //   [0]   [2]     value = 101

        flats[1][0] = 201;        //   [1]   [0]     value = 101
        flats[1][1] = 202;        //   [1]   [1]     value = 101
        flats[1][2] = 203;        //   [1]   [2]     value = 101

        System.out.println(flats[1][0]);

        for (int i = 0; i < flats.length; i++) {
            System.out.println(Arrays.toString(flats[i]));

        }


        String[][][] man = {{{"valen", "3"}, {"4", "rajubhai", "6"}, {"valen", "rajubhai", "patel"}, {"10", "patel", "12"}}};

        for (String[][] element : man) {
            System.out.println(Arrays.deepToString(element));

            for (int i = 0; i < man.length; i++) {
                System.out.println(Arrays.deepToString(man[i]));
            }


        }


    }
    }


