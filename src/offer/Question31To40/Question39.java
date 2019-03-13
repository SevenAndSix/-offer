package offer.Question31To40;

import java.util.Random;

public class Question39 {
    public int appearMostTimes(int[] numbers,int length){
        int middle=length>>1;
        int start=0;
        int end=length;
        int index=Partition(numbers,start,end);
        while(index!=middle){
            if(index>middle){
                end=index;
                index=Partition(numbers,start,end);
            }
            else{
                start=index+1;
                index=Partition(numbers,start,end);
            }
        }
        int result=numbers[index];

        return result;
    }

    //返回基准值在排好序数组中的下标
    public int Partition(int[] numbers,int start,int end){
        Random random=new Random();
        int radomIndex= random.nextInt(end);
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
        int temp=numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=temp;
    }
}

/*
*   Question39测试函数
*       Question39 question39=new Question39();
        //int[] numbers={1,3,0,2,5};
        int[] numbers={1,2,3,2,2,2,5,4,2};
        question39.appearMostTimes(numbers,9);
* */
