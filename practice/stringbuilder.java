package practice;
public class stringbuilder {
    public static void main(String[] args) {
        // String str="hello";
        // System.out.println(str.concat(" world"));
        // System.out.println(str);
        // str="rajnesh";
        // System.out.println(str);

        StringBuilder str = new StringBuilder(5);
        str.append(" worlder");
        System.out.println(str);
        System.out.println(str.length());
    }
    
}
