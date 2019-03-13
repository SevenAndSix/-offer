package offer.sortAlgorithm;

public class InsertSort {
    public int[] insertSort(int[] array){
        if(array==null)
            return null;
        else if(array.length==1)
            return array;
        else {
            for(int i=1;i<array.length;i++){
                for(int j=i-1;j>=0;j--){
                    if(array[j+1]<array[j]){
                        int temp=array[j+1];
                        array[j+1]=array[j];
                        array[j]=temp;
                    }
                    else {
                        break;
                    }
                }
            }
        }

        return array;
    }
}
