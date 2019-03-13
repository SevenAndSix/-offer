package offer.sortAlgorithm;

import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] array){
        if(array.length<2){
            return array;
        }
        int middle=array.length/2;
        int[] left= Arrays.copyOfRange(array,0,middle);   //第一个索引指的是复制开始的位置，结束位置索引为第二个索引-1
        int[] right=Arrays.copyOfRange(array,middle,array.length);

        return mergeTwoOrderedArray(mergeSort(left),mergeSort(right));
    }

    //合并两个已排序的数组
    public int[] mergeTwoOrderedArray(int[] left,int[] right){
        if(left==null)
            return right;
        if(right==null)
            return left;

        int totalLength=left.length+right.length;
        int[] result=new int[totalLength];
        for(int index=0,i=0,j=0;index<totalLength;index++){
            if(i>=left.length){
                result[index]=right[j++];
            }
            else if(j>=right.length){
                result[index]=left[i++];
            }
            else if(left[i]<right[j]){
                result[index]=left[i++];
            }
            else{
                result[index]=right[j++];
            }
        }

        return result;
    }
}
