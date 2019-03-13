package offer.Question11To20;

public class Question14 {
    public int maxProductAfterCut(int ropeLength){
        //这三种情况要么没法剪，要么只有一种剪法
        if(ropeLength<2)
            return 0;
        if(ropeLength==2)
            return 1;
        if(ropeLength==3)
            return 2;

        //计算相应下标长度绳子的最大乘积
        int[] product=new int[ropeLength+1];
        product[0]=0;
        product[1]=1;  // 不剪
        product[2]=2;  // 不剪
        product[3]=3;  // 不剪

        int maxProduct=0;
        for(int i=4;i<=ropeLength;i++){
            maxProduct=i;
            //j<=i/2减少重复计算
            for(int j=1;j<=(i/2);j++){
                if(product[j]*product[(i-j)]>maxProduct){
                    maxProduct=product[j]*product[(i-j)];
                }
            }
            product[i]=maxProduct;
        }
        return product[ropeLength];
    }
}

/*
*   Question14测试函数
*       Question14 question14=new Question14();
        System.out.println(question14.maxProductAfterCut(8));
* */
