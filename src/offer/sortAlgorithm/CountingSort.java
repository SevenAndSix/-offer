package offer.sortAlgorithm;

import java.util.Arrays;

public class CountingSort {
    public int[] countingSort(int[] array){
        if(array.length<2)
            return array;

        int min=array[0],max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max)
                max=array[i];
            if(array[i]<min)
                min=array[i];
        }

        int[] bucket=new int[max-min+1];
        Arrays.fill(bucket,0);
        int bias=0-min;   //辅助数组的偏移量，如array[i]为3，数组最小值也为3，他就应该存在辅助数组下标为0的地方
        for(int j=0;j<array.length;j++){
            bucket[array[j]+bias]++;
        }

        int index=0;  //辅助数组的下标
        for(int k=0;k<array.length;){
            if(bucket[index]!=0){   //在最大值和最小值之间可能有些数没有
                array[k]=index-bias;
                bucket[index]--;
                k++;
            }
            else {
                index++;
            }
        }

        return array;
    }
}
