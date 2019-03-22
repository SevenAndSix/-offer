package offer.Question61_66;

public class Question64 {
    public int calSum(int n){
        int result=(int) (Math.pow(n,2)+n);

        return result>>1;
    }

    public int Sum_Solution(int n) {
        int res = n;
        boolean flag = (n>0)&&((res+=Sum_Solution(n-1))>0);
        return res;

    }
}

/*
* 测试函数
*       Question64 question64=new Question64();
        int result=question64.calSum(10);
        int newResult=question64.Sum_Solution(10);
* */
