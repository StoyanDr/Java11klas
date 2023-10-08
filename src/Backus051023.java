public class Backus051023 {
    public static boolean isWord(String s) {
        switch(s.length()) {
            case 0: return false;
            case 1: return false;
            case 2: return s.equals("AA") || s.equals("AB");}
        return s.charAt(0) == 'A' && (s.charAt(s.length() - 1) == 'B' || s.charAt(s.length() - 1) == 'A') && isWord(s.substring(1,s.length() - 1));
    }
    //<word>::=C|AB|BA|A<word>|B<word>C
    public static boolean isWord1(String s) {
        return switch (s.length()) {
            case 0 -> false;
            case 1 -> s.equals("C");
            case 2 -> s.equals("AB") || s.equals("BA") || s.equals("AC");
            default -> (s.charAt(0) == 'A' && isWord1(s.substring(1)))
                    || (s.charAt(0) == 'B' && s.charAt(s.length() - 1) == 'C' && isWord1(s.substring(1, s.length() - 1)));
        };
    }
    //<word>::=0|11|<word>0|10<word>01
    public static boolean isWord2(String s){
    switch(s.length()){
        case 0: return false;
        case 1: return s.equals("0");
        case 2: return s.equals("11");
    }
    return s.charAt(s.length() - 1) == '0' && isWord2(s.substring(0, s.length() - 1)) ||
           s.charAt(0) == '1' && s.charAt(1) == '0' && s.charAt(s.length() - 1) == '1' && s.charAt(s.length() - 2) == '0'
           && isWord2(s.substring(2,s.length() - 2));
    }
    //<word>::=AB|BC|C<word>|<word>AA
    private static void make(int len, String w){
        if(w.length() > len) return;
        if(w.length() == len){
            System.out.println(w);
            return;
        }
        make(len, w + "AA");
        make(len,"C" +  w);
    }

    public static void make(int len){
        make(len,"AB");
        make(len, "BC");
    }


    //<word1>::=1|<word>1|<word2>0 11 || 01 ||
    //<word2>::=<word1>0|<word2>1 10 || 101
    //<word>::=0|<word>0|<word1>1



    public static void main(String[] Args){
        System.out.println(isWord2("11"));
        make(5);
    }
}
