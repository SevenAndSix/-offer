package offer.Question11To20;

public class Question15 {
    public int oneCount_Common(int n){
        int count=0;
        int flag=1;
        while(flag<=n){
            if(flag==(n&flag))
                count++;

            flag<<=1;
        }
        return count;
    }

    public int oneCount_Special(int n){
        int count=0;
        while(n>0){
            count++;
            n=(n-1)&n;
        }

        return count;
    }
}

/*
*   Question15测试函数
*       Question15 question15=new Question15();
        System.out.println(question15.oneCount_Common(9));
        System.out.println(question15.oneCount_Special(9));
* */