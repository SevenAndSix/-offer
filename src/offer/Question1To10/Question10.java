package offer.Question1To10;

public class Question10 {
    public int fibFunc(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else {
            int[] fibValue=new int[n];
            fibValue[0]=0;
            fibValue[1]=1;
            for(int i=2;i<n;i++){
                fibValue[i]=fibValue[i-1]+fibValue[i-2];
            }
            return fibValue[n-1];
        }
    }
}

/*
*   Question10测试函数
*       Question10 question10=new Question10();
        int resultFib=question10.fibFunc(13);
        System.out.println(resultFib);
* */
