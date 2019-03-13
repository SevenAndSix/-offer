package offer.sortAlgorithm;

public class BubbleSort {
    public int[] bubbleSelf(int[] array){
        if(array.length==0)
            return null;

        for(int i=0;i<array.length-1;i++){
            int curDigit=array[0];
            for(int j=1;j<array.length;j++){
                if(curDigit>array[j]){
                    array[j-1]=array[j];
                    array[j]=curDigit;
                }
                else {
                    curDigit=array[j];
                }
            }
        }

        return array;
    }

    public int[] bubbleReference(int[] array){
        if(array.length==0)
            return null;

        for(int i=0;i<array.length;i++){   //i决定末尾已经产生几个已排序好的数字
            for(int j=0;j<array.length-1-i;j++){
                if(array[j+1]<array[j]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        return array;
    }
}
