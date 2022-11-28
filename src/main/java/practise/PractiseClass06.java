package practise;

public class PractiseClass06 {
    public static void main(String[] args) {
        /* || means "or": If you use "||" between 2 things it means at least 1 of them is enough for you
               For example; "tea || coffee" means just tea, or just coffee, or both
               To get false from || operation all must be false
               true || true ==> true
               true || false ==> true
               false || true ==> true
               false || false ==> false
            Note: "|" checks both conditions.==> true | false ==> true
                     "||" does not check the second condition, if first one is true
                     "||" is faster than "|"*/

        /*  && means "and":  If you use "&&" between 2 things it means you want both.
                For example; "tea && coffee" means I want both, just one of them will not be enough
                To get true from && operation all must be true.
                true && true ==> true
                true && false ==> false
                false && true ==> false
                false && false ==> false
            & means "and":  If you use "&" between 2 things it means you want both.
                For example; "tea & coffee" means I want both, just one of them will not be enough
                To get true from && operation all must be true.
                true & true ==> true
                true & false ==> false
                false & true ==> false
                false & false ==> false
            Note: "&" and "&&" do the same but
                "&&" does not check the second condition if the first condition is false.
                "&" checks both conditions every time.*/
        boolean havingPc = true;
        boolean watchingVideos = false;
        if (havingPc && watchingVideos) {
            System.out.println("I can learn Java");
        } else {
            System.out.println("I cannot learn Java");
        }

        boolean cash = false;
        boolean creditCard = false;
        if (cash || creditCard) {
            System.out.println("I can buy PC");
        } else {
            System.out.println("I cannot buy PC");
        }
    }
}
