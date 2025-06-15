package finalpractices;
public class que12 {

    public static void main(String[] args) {
        String inp = "rajnesh choudhary";
        int count=0;
        for(char c : inp.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                count++;
            }
        }
        System.out.println("number of Vowels "+count);
    }
}