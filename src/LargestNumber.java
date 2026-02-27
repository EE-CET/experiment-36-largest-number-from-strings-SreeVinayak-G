import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                String[] arr = new String[n];
                for(int i=0;i<n;i++){
                        arr[i] = sc.next();
                }
                Arrays.sort(arr, new Comparator<String>(){
                        public int compare(String a, String b){
                                String str1 = a + b;
                                String str2 = b + a;
                                return str2.compareTo(str1);
                        }
                });
                System.out.println(String.join("", arr));
        }
    
}
