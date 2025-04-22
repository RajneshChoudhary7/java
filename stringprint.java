public class stringprint {
    public static void main(String[] args) {
        String str = "hello world";
        String str1 = "hello world";
        System.out.println(str==str1);

        System.out.println(str);
        char [] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("h"));
    }
    
}
