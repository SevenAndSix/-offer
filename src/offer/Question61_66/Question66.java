package offer.Question61_66;

public class Question66 {
    public int[] multiArray(int[] A){
        if(A==null)
            return null;

        int[] B=new int[A.length];   //结果数组
        int temp1=1;   //前一个子数组的值

        //从下往上计算后一个子数组的值
        int[] temp2=new int[A.length];
        temp2[A.length-1]=1;
        for(int i=A.length-2;i>=0;i--){
            temp2[i]=temp2[i+1]*A[i+1];
        }

        for(int j=0;j<A.length;j++){
            B[j]=temp1*temp2[j];

            temp1*=A[j];
        }

        return B;
    }
}

/*
* 测试函数
*       Question66 question66=new Question66();
        int[] A={1,-2,3,4,5};
        int[] B=question66.multiArray(A);
* */
