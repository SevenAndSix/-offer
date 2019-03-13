package offer.sortAlgorithm;

public class HeapSort {
    public int[] heapSort(int[] array){
        for(int i=array.length/2-1;i>=0;i--){
            heapHandle(array,i,array.length);   //array.length/2-1最末尾非叶子节点，从右至左，从下到上
        }
        for(int j=array.length-1;j>0;j--){
            swap(array,0,j);  //将堆顶最大元素与数组最后位置交换
            heapHandle(array,0,j);   //其余子树还满足最大堆，只是新的根结点可能不满足最大堆，调整该节点
        }

        return array;
    }

    public void heapHandle(int[] array,int index,int length){
        int temp=array[index];
        for(int i=index*2+1;i<length;i=i*2+1){
            if(i+1<length&&array[i]<array[i+1]){  //右节点大于左节点则使i指向右节点
                i=i+1;
            }
            if(array[i]>temp){
                array[index]=array[i];  //子节点中大于父节点的值赋值给父节点
                index=i;
            }
            else{
                break;
            }

            array[index]=temp;
        }
    }

    public void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
