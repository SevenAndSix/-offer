package offer.sortAlgorithm;

import java.util.ArrayList;

//基数排序
public class RedixSort {
    public int[] redixSort(int[] array){
        if(array==null||array.length<2)
            return array;

        int max=array[0];
        //找到最大数
        for(int i=0;i<array.length;i++){
            if(array[i]>max)
                max=array[i];
        }

        //计算最大数的位数
        int maxBits=0;
        while (max!=0){
            max/=10;
            maxBits++;
        }

        ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<>();
        for(int j=0;j<10;j++){
            arrayLists.add(new ArrayList<>());
        }

        int mod=10,div=1;
        for(int index=0;index<maxBits;index++,mod*=10,div*=10){
            for(int i=0;i<array.length;i++){
                arrayLists.get((array[i]%mod)/div).add(array[i]);
            }

            int arrayIndex=0;
            for(int j=0;j<arrayLists.size();j++){
                for(int k=0;k<arrayLists.get(j).size();k++){
                    array[arrayIndex++]=arrayLists.get(j).get(k);
                }
                arrayLists.get(j).clear();
            }
        }

        return array;
    }
}
