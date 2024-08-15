package daniils.lesson5;

import java.util.Arrays;

public class MultidimensionalArrays {

    public static void main(String[] args) {

        //Правило СКГ
        int[][] intTable = new int[3][2];


        //correct
        int[] ints = {12,3};
        //not applicable
        //intTable[0] = {1,2};
        //applicable
        int[][] array = { {1,2}, {2,3} };

        System.out.println(Arrays.toString(intTable));
        System.out.println(Arrays.deepToString(intTable));


    }

}
