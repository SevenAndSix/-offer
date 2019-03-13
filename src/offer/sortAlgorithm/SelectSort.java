package offer.sortAlgorithm;

public class SelectSort {
    public int[] selectSort(int[] array){
        if(array==null)
            return null;

        int curLeastIndex;
        for(int i=0;i<array.length-1;i++){
            curLeastIndex=i;
            for(int j=i+1;j<array.length;j++){
                if(array[curLeastIndex]>array[j]){
                    curLeastIndex=j;
                }
            }

            int temp=array[curLeastIndex];
            array[curLeastIndex]=array[i];
            array[i]=temp;
        }

        return array;
    }
}
