/**
 * String to Integer Integer StringToNum(String s) s="123" 123
 * 
 * s=['1','2','3'] s[0] ='1', s=[1]='2',s=[2]='3'
 * 
 * for(int i=0; i<s.length; i++){ println(s[i])}; '1'-'0'=49-48= 1
 * '2'-'0'=50-48= 2 '3'-'0'=51-48= 3
 */

class Main {
    public static void main(String[] args) {
        System.out.println("123");
    }

    static int StringToNum(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println("s.charAt(" + i + ") = " + s.charAt(i));
            int num = s.charAt(i) - '0';
            System.out.println("num = " + num);
            n = n * 10 + num;

            System.out.println("n = " + n);
            System.out.println();
        }
        return n;
    }
}