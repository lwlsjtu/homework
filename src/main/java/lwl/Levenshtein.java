package lwl;
//工具类
public class Levenshtein {

    public int getDistance(String str1,String str2){

        int length1 = str1.length();
        int length2 = str2.length();
        int distanceTable[][]=new int[length1+1][length2+1];

        if(length1==0){
            return length2;
        }

        if(length2==0){
            return  length1;
        }
        //初始化表格
        for(int i=0;i<=length1;i++){
            distanceTable[i][0] = i;
        }
        for(int j=0;j<=length2;j++){
            distanceTable[0][j] = j;
        }

        for(int i=1;i<=length1;i++){
            char str1_temp = str1.charAt(i-1);
            for(int j = 1;j<=length2;j++){
                char str2_temp = str2.charAt(j-1);
                if(str1_temp==str2_temp){
                    distanceTable[i][j]=distanceTable[i-1][j-1];
                }else{
                    distanceTable[i][j] = getMin(distanceTable[i-1][j],distanceTable[i][j-1],distanceTable[i-1][j-1])+1;
                }
            }
        }

        return distanceTable[length1][length2];
    }

    private int getMin(int a,int b,int c){
        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        return min;
    }
}
