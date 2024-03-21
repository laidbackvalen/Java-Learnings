public class Ch2_oprat_preced {
    public static void main(String[] args) {

        int a = 6*5-30/2;

        /*
        * multiplication and divison have the hightest precedence
        * amongst these 2 which ever comes first from left to right will be evaluated first
        *
        * for ex - 6*5-30/2
        *
        *1st  6*5=30
        *2nd  30/2 = 15
        *3rd  30-15 = 15
        * the answer is 15
        * */

        System.out.println(a);

        int b = 60/5-6*5;
        /*
        * here from left to right,
        * division comes first
        * so,
        * 60/5-6*5 will be evaluated like this below
        *
        * 60/5 = 12
        * 6*5 = 30
        * 12-30
        * -18 will be the answer
        * */
        System.out.println(b);

        int d = 40+60/5-6*5+40;
        /*
        * 1st 60/5 = 12      in     40+60/5-6*5+40;
        * 2nd 6*5 = 30       in     40+12-6*5+40, now 40+12-30+40
        * 3rd 40+12   as first + comes from left to right   in     40+12-30+40,  now 52-30+40
        * 4th 52-30     in 52-30+40
        * 5th 22+40 is 62
        *  */
    }
}
