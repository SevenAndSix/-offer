package offer.Question61_66;

public class Question65 {
    public int calculateSum(int n1,int n2){
        int xOrResult=0,andResult=0;
        do{
            xOrResult=n1^n2;
            andResult=(n1&n2)<<1;

            n1=xOrResult;
            n2=andResult;
        }while (n2!=0);

        return xOrResult;
    }
}

/*
* 测试函数
*      Question65 question65=new Question65();
        int sum=question65.calculateSum(7,15);
* */
