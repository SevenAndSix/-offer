package offer.Question31To40;

import java.util.Arrays;

public class Question33 {
    public boolean afterOrderSeq(int[] numbers,int length){
        if(numbers==null||length<=0)
            return false;
        if(length==1)
            return true;

        int rootValue=numbers[numbers.length-1];
        //找到左右子树的分界点
        int i=0;
        for(;i<numbers.length-1;i++){
            if(numbers[i]>rootValue)
                break;
        }

        //判断右子树中的节点是否大于根节点
        int j=i;
        for(;j<length-1;j++){
            if(numbers[j]<rootValue)
                return false;
        }

        //判断左子树是不是二叉搜索树
        boolean left=true;
        if(i>0)
            left=afterOrderSeq(Arrays.copyOfRange(numbers, 0, i),i);

        boolean right=true;
        if(i<length-1)
            right=afterOrderSeq(Arrays.copyOfRange(numbers, i, length-1),length-i-1);

        return left&&right;
    }
}

/*
*   Question33测试函数
*       Question33 question33=new Question33();

        int[] numbers={5,7,6,9,11,10,8};
        //int[] numbers={7,4,6,5};
        boolean result=question33.afterOrderSeq(numbers,7);
* */