package offer.sortAlgorithm;

import java.util.ArrayList;

public class BucketSort {
    public ArrayList<Integer> bucketSort(ArrayList<Integer> array,int bucketSize){
        if(array==null||array.size()<2)
            return array;

        int min=array.get(0),max=array.get(0);
        for(int i=1;i<array.size();i++){
            if(array.get(i)>max)
                max=array.get(i);
            if(array.get(i)<min)
                min=array.get(i);
        }

        //确定桶的个数以及初始化桶
        ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<>();
        int bucketNums=(max-min)/bucketSize+1;
        for(int i=0;i<bucketNums;i++){
            arrayLists.add(new ArrayList<>());
        }

        ArrayList<Integer> resultList=new ArrayList<>();   //结果返回数组

        //将数添加到桶中
        for(int j=0;j<array.size();j++){
            arrayLists.get((array.get(j)-min)/bucketSize).add(array.get(j));
        }

        for(int k=0;k<bucketNums;k++){
            if(bucketSize==1){
                for(int index=0;index<arrayLists.get(k).size();index++)
                    resultList.add(arrayLists.get(k).get(index));
            }
            else {
                //当桶数量为1时要手动减小BucketSize增加下一循环桶的数量，否则会陷入死循环
                if(bucketNums==1)
                    bucketSize--;
                ArrayList<Integer> temp=bucketSort(arrayLists.get(k),bucketSize);
                for(int i=0;i<temp.size();i++){
                    resultList.add(temp.get(i));
                }
            }
        }

        return resultList;
    }
}

/*
*测试函数
    BucketSort bucketSort=new BucketSort();
    ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(3);
                arrayList.add(1);
                arrayList.add(6);
                arrayList.add(9);
                arrayList.add(2);
                arrayList.add(4);
                arrayList.add(5);
                ArrayList<Integer> resultList=bucketSort.bucketSort(arrayList,3);
*/