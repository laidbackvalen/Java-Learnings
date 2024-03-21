
public class Main {
    public static void main(String[] args) {


        //as string is a data type and a class also we have two ways to declare a variable of string type
        //initialise a variable of string data type these ways

        //one, normal and commonly used
        String a = "valen patel";
        System.out.println(a);


        //another way by instatiating new string
        String b = new String("VALEN");
        System.out.println(b);

        int value = a.length();   //return length of rhe string //in this case it will return 11
        System.out.println(value);

        String low = b.toLowerCase();
        System.out.println(low);

        String up = a.toUpperCase();
        System.out.println(up);
        System.out.println("\n");

        String lowto = ("It is a long established fact that a reader will be distracted by \n" +
                "the readable content of a page when looking at its layout. The point of using\n" +
                " Lorem Ipsum is that it has a more-or-less normal distribution of letters,\n" +
                " as opposed to using 'Content here, content here', making it look like readable\n" +
                " English. Many desktop publishing packages and web page editors now use Lorem\n" +
                " Ipsum as their default model text, and a search for 'lorem ipsum' will uncover \n " +
                "many web sites still in their infancy. \n" +
                "Various versions have evolved over the years, sometimes by accident, sometimes on purpose");

        String touppercase = lowto.toUpperCase();
        System.out.println(touppercase);

        System.out.print("\n");
        System.out.print("\n");




        String c = ("         valen             ");
        System.out.println(c);

        String aftertrimonvariablec = c.trim();                   // all the spaces after and before valen will be removed in variable "c"
        System.out.println(aftertrimonvariablec);


        System.out.println("\n \n");




        System.out.println(a.substring(2) + "\t starting from");     //in string datatype variable a "valen patel" is stored where indexing starts from 0 to so on
                                                         //on index 0 1 2 3 4      v a l e n   is written where v is on index value 0, a is on 1, l is on 2 and so on
                                                        //spaces also takes indexing as index 5 will take the space value between valen and patel
                                                       //total index values of "valen patel" will be like below
                                                      //                        012345678910    --


        System.out.println(a.substring(2,5) + " \t printing substring");   // this will return "len" l is on index 2 and index 5 which is a space will be excluded
        System.out.println(a.substring(1,4)  + " \t printing substring");   // returns "ale"  //start index is included and end index is excluded


        System.out.println("\n \n");





        //the difference is with single inverted commas and double inverted commas   '' ""   single represents character
        //double inverted commas  "" represents string

        System.out.println(a.replace('l','n' ));  //this is used to replace chars
        System.out.println(a.replace("vanen","valen" )); //this is used to replace strings

        System.out.println(a.replace("valen patel","tainsa R"));






        System.out.println("\n \n");





        //starts with property returns boolean value
        System.out.println(b.startsWith("VAL"));
        System.out.println(b.startsWith("val"));

        //string ends with
        System.out.println(b.endsWith("EN"));   //returns true
        System.out.println(b.endsWith("en"));   // returns false


        System.out.println("\n \n");

        //character at index
        System.out.println(a.charAt(0));     //returns v as char 'v' is at index value 0 //value of variable a datatype is "valen patel"
        System.out.println(a.charAt(1));     //a
        System.out.println(a.charAt(2));     //l
        System.out.println(a.charAt(3));     //e
        System.out.println(a.charAt(4));     //n




        System.out.println("\n \n");

    String e = "kavishap";

        // only returns char index not strings
        System.out.println(e.indexOf("av"));  //returns index of 'a' which is 1 only first character, 'a' occurs twice
                                              //so v is included just to show which char 'a' index we want

        System.out.println(e.indexOf("ap"));  //returns 6
        System.out.println(e.indexOf('i'));   //returns 3




        //k is a char and 2 is the index value from where i want to start searching

        System.out.println(e.indexOf("k",2));   //what is the index of k starting from index value 2 // returns -1
                                                             //as at 2, char v is placed than a will be at 0 and k will be at -1
                                                             //taking  char 'v''s index vale 2 as initial index, we are going right to left to check char 'k's index

        System.out.println(e.indexOf("a",2));   //returns 6 //as starting from char 'i' there is only 1 char 'a' positioned at index value 6

        System.out.println(e.indexOf("a",1));   //returns 1 //starting from index value 1 char 'a' occurs twice //but the first char 'a' value will be return
                                                             //placed on index value 1

        System.out.println("\n \n");


        System.out.println(e.lastIndexOf("ap", 5));



        System.out.println("\n \n");


        System.out.println(e.equals("kavishap"));
        System.out.println(e.equals("kavisha"));
        System.out.println(e.equals("kaVIshap"));



        System.out.println(e.equalsIgnoreCase("kaVIshap"));


        System.out.println("what's \"your\" name?");    //when you want to add double quotes or single qoute in your code you
                                                         //have to add    \ backslash sequence character
        System.out.println("\\"); //even when you want to print single backslash you have to do it with a backslash like in given examole

        System.out.println("valen\tpatel");


    }
}