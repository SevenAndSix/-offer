package offer.Question51_60;

public class Question53 {
    public int sameDigitsCount(int[] array,int k){
        int number=0;

        if(array!=null&&array.length>0){
            int firstK=getFirstK(array,k,0,array.length-1);
            int lastK=getLastK(array,k,0,array.length-1);

            if(firstK>-1&&lastK>-1){
                number=lastK-firstK+1;
            }
        }

        return number;
    }

    public int getFirstK(int[] array,int k,int start,int end){
        if(start>end)
            return -1;

        int middle=(start+end)/2;
        if(array[middle]!=k){
            if(array[middle]>k){
                return getFirstK(array,k,start,middle-1);
            }
            else {
                return getFirstK(array,k,middle+1,end);
            }
        }
        else{
            if((middle>0&&array[middle-1]!=k)||middle==0){
                return middle;
            }
            else{
                return getFirstK(array,k,start,middle-1);
            }
        }
    }

    public int getLastK(int[] array,int k,int start,int end){
        if(start>end)
            return -1;

        int middle=(start+end)/2;
        int middleData=array[middle];

        if(middleData==k){
            if(((middle<array.length-1)&&array[middle+1]!=k)||middle==array.length-1){
                return middle;
            }
            else {
                start=middle+1;
            }
        }
        else {
            if(middleData>k){
                end=middle-1;
            }
            else {
                start=middle+1;
            }
        }

        return getLastK(array,k,start,end);
    }
}

/*
* 测试函数
*
        Question53 question53=new Question53();
        int[] array={1,2,3,3,3,3,4,5};
        int first=question53.getFirstK(array,3,0,7);
        int last=question53.getLastK(array,3,0,7);
        int sameDigitsCount=question53.sameDigitsCount(array,3);
* */

//    public BinaryTree kthNodeOffer(BinaryTree curNode,int k){
//        BinaryTree targetNode=null;
//
//        if(curNode.getLeftTree()!=null){
//            targetNode=kthNodeOffer(curNode.getLeftTree(),k);
//        }
//
//        if(targetNode==null){
//            if(k==1)
//                targetNode=curNode;
//            k--;
//        }
//
//        if(targetNode==null&&curNode.getRightTree()!=null){
//            targetNode=kthNodeOffer(curNode.getRightTree(),k);
//        }
//
//        return targetNode;
//    }

