package offer.sortAlgorithm;

import java.util.Random;

public class QuickSort {
    public int[] quickSort(int[] array,int start,int end){
        if(array.length<1||start<0||end>=array.length||start>end)
            return null;

        int index=partition(array,start,end);
        if(index>start)
            quickSort(array,0,index-1);
        if(index<end)
            quickSort(array,index+1,end);

        return array;
    }

    public int partition(int[] array,int begin,int end){
        Random random=new Random();
        int radomIndex=begin+random.nextInt(end-begin+1);
        int flagValue=array[radomIndex];
        swap(array,radomIndex,end);
        int small=begin-1;  //小于标准值的右边界
        for(int i=begin;i<end;i++){
            if(array[i]<flagValue){
                small++;
                if(small!=i){
                    swap(array,small,i);
                }
            }
        }

        small++;
        swap(array,small,end);

        return small;
    }

    public void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
