package lwl;
import lwl.Levenshtein;
import java.util.*;
//main函数
public class test {
    public static void main(String[] args){
        Levenshtein levenshtein = new Levenshtein();
        Scanner s = new Scanner(System.in);
        System.out.print("输入第一个单词:");
        String str1 = s.nextLine();
        System.out.print("输入第二个单词:");
        String str2 = s.nextLine();
        int result = levenshtein.getDistance(str1,str2);
        System.out.println(str1+"和"+str2+"的距离为"+result);
        s.close();
    }
}
