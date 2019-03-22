package offer.Question51_60;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Question59 {
    public int[] wimdowMax(int[] numbers,int length,int size){
        if(numbers==null||length<size)
            return null;

        int[] result=new int[length-size+1];
        int resultIndex=0;   //控制result数组的索引，控制窗口最大值的写入
        //其中存储的是数字在数组中对应的下标,队头元素始终是最大的
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.push(0);
        int end=0;

        while (end!=length){
            //初始的前三个窗口值
            if(end<3){
                if(numbers[end]>arrayDeque.getFirst()){
                    arrayDeque.removeFirst();
                    arrayDeque.push(end);
                }
                if(end==2)
                    result[resultIndex++]=numbers[arrayDeque.getFirst()];
                end++;
            }
            else{
                if((end-arrayDeque.getFirst())>=3){  //队头元素下标超过了窗口值
                    arrayDeque.removeFirst();
                }
                //队列中最多这可能存在两个值
                if(arrayDeque.size()==1)   //队列中只有一个值时，直接加入
                    arrayDeque.addLast(end);
                //有两个值的情况
                else if(numbers[end]>=numbers[arrayDeque.getFirst()]&&numbers[end]>=numbers[arrayDeque.getLast()]){
                    arrayDeque.clear();
                    arrayDeque.addLast(end);
                }
                else{
                    arrayDeque.removeLast();
                    arrayDeque.addLast(end);
                }

                result[resultIndex++]=numbers[arrayDeque.getFirst()];
                end++;
            }
        }
        return result;
    }
}

/*
* 测试函数
*       Question59 question59=new Question59();
        int[] numbers={2,3,4,2,6,2,5,1};
        int[] wimdowMax=question59.wimdowMax(numbers,8,3);
* */
