public class Q6_MAXi_element_In_Array {
    public static void main(String[] args) {

        int[] number = new int[]{2, 12, 3, 14, 5, 6, 10, 9, 8};

        int max = number[0];

        for (int i = 0; i < number.length; i++) {

            if (number[i] > max) {    //number[i] = num[0]  = 2  // max = num[0] = 2 //condition if 2>2  //if not than max become 2 and when num[1] = 12// 12>2 becomes true
                                     //max becomes 12 //than num[2] = 3 //3>12? no! //max will remain 12 //when num[3]=14 // condition 14>12 is true // max becomes 14
                                     //loops goes on and it will check if any number in the array after 14 is greater, if not than max = 14 will be printed
                max = number[i];
            }
        }
        System.out.println("The Largest number In Array is : "+max);
    }
}
