package prac_mod_1923_ka_dusra;

import prac_mod_1923.A;
import prac_mod_1923.B;
//import prac_mod_1923.C;  //prac_mod_1923.C' is not public in 'prac_mod_1923'. Cannot be accessed from outside package
import prac_mod_1923.ForW;

public class D extends ForW {
    public static void main(String[] args) {
        D d = new D();

        d.freakakpublic();                       //EXTENDING ForW
        d.loseYourSelfprotected();
      //  default and private is not accessible

    }
}
