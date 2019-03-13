package offer.Question11To20;

public class Question16 {
    public double Power(double base,int exponent){
        if(base==0.0&&exponent<0)
            return 0.0;

        int absExponent=exponent;
        if(exponent<0){
            absExponent=(-exponent);
        }

        double result=PowerWithUnsignedExponent(base,absExponent);
        if(exponent<0){
            result=1.0/result;
        }

        return result;
    }

    public double PowerWithUnsignedExponent(double base,int exponent){
        if(exponent==0)
            return 1;
        if(exponent==1)
            return base;

        double result=PowerWithUnsignedExponent(base,exponent>>1);
        result*=result;

        //当指数为奇数时
        if((exponent&0x1)==1){
            result*=base;
        }

        return result;
    }
}

/*
*   Question16测试函数
*       Question16 question16=new Question16();
        System.out.println(question16.Power(-3.0,-3));
* */
