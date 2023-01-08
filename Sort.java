import java.util.Arrays;

public class Sort {
    public static void main(String[] args){

        String s = "LadySwan";
        char[] nameArr = s.toCharArray();
        
        Arrays.sort(nameArr);

        for(int i=0; i < nameArr.length; i++){
            System.out.println(nameArr[i]);
        }


    }
}
