package offer.Question11To20;

public class Question11 {
    //遍历数组查找最小值
    public int minInOrder(int[] order,int length){
        int result=order[0];
        for(int i=1;i<order.length;i++){
            if(result>order[i]){
                result=order[i];
            }
        }
        return result;
    }

    //二分法查找旋转数组最小值
    public int minDigit(int[] order,int length){
        int index1=0;
        int index2=length-1;
        int indexMid=index1;
        while(index1<index2){
            if(index2-index1==1){
                indexMid=index2;
                break;
            }
            indexMid=(index1+index2)/2;

            if(order[indexMid]>=order[index1]){
                index1=indexMid;
            }
            else{
                index2=indexMid;
            }

            if(order[index1]==order[index2]&&order[index1]==order[indexMid])
                return minInOrder(order,5);
        }

        return order[indexMid];
    }
}

/*
*   Question11测试函数
*       Question11 question11=new Question11();
        //int[] numbers={3,4,5,1,2};
        int[] numbers={1,1,1,0,1};
        System.out.println(question11.minDigit(numbers,5));
* */
