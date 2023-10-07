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
        switch (s.length()) {
            case 0:return false;
            case 1: return s.equals("C");
            case 2: return s.equals("AB")||s.equals("BA")||s.equals("AC");
        }
        return (s.charAt(0)=='A'&&isWord1(s.substring(1)))
                || (s.charAt(0)=='B'&&s.charAt(s.length()-1)=='C'&&isWord1(s.substring(1,s.length()-1)));
    }
    public static void main(String Args[]){

    }
}
