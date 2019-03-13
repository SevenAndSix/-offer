package offer.Question31To40;

import java.util.Random;

public class Question40 {
    public void leastKNumbers(int[] numbers,int length,int k){
        if(k<1||k>length||numbers.length!=length||numbers==null)
            return;

        int start=0;
        int end=length;
        int index=Partition(numbers,start,end);
        while(index!=k&&index!=k-1){
            if(index>k){
                end=index;
                index=Partition(numbers,start,end);
            }
            else{
                start=index+1;
                index=Partition(numbers,start,end);
            }
        }

        //循环索引的最大值
        int iMax=(index==k?index:(index+1));
        for(int i=0;i<iMax;i++)
            System.out.print(numbers[i]+"\t");
    }

    //返回基准值在排好序数组中的下标
    public int Partition(int[] numbers,int start,int end){
        Random random=new Random();
        int radomIndex= random.nextInt(end)+start;
        swap(numbers,radomIndex,end-1);
        int small=start-1;    //记录小于基准值的数列的最右位置
        for(int i=start;i<end-1;i++){
            if(numbers[i]<=numbers[end-1]){
                small++;
                if(small!=i)
                    swap(numbers,small,i);
            }
        }
        small++;
        swap(numbers,small,end-1);

        return small;
    }

    //交换数组中的两个元素
    public void swap(int[] numbers,int index1,int index2){
        if(!(index1<numbers.length)||!(index2<numbers.length))
            return;

        int temp=numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=temp;
    }
}

/*
*   Question40测试函数
*       Question40 question40=new Question40();
        int[] numbers={5,5,1,6,2,7,3,8};
        question40.leastKNumbers(numbers,8,4);
* */
