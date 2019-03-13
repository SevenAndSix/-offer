package offer.Question21To30;

public class Question21 {
    public void oddBeforeEvev(int[] numbers){
        if(numbers.length<2)
            return;

        int index1=0;
        int index2=numbers.length-1;
        while (index2>index1) {
            //前奇后偶
            if(isOdd(numbers[index1])&&!isOdd(numbers[index2])){
                index1++;
                index2--;
            }
            //前奇后奇
            if(isOdd(numbers[index1])&&isOdd(numbers[index2]))
                index1++;
            //前偶后奇
            if(!isOdd(numbers[index1])&&isOdd(numbers[index2])){
                int temp=numbers[index2];
                numbers[index2]=numbers[index1];
                numbers[index1]=temp;
                index1++;
                index2--;
            }
            //前偶后偶
            if(!isOdd(numbers[index1])&&!isOdd(numbers[index2]))
                index2--;
        }
    }

    //判断一个数是否为奇数,0是偶数
    public boolean isOdd(int number){
        if((number&1)==1)
            return true;
        else
            return false;
    }
}

/*
*   Question21测试函数
*       int[] numbers={24};
        Question21 question21=new Question21();
        question21.oddBeforeEvev(numbers);
        System.out.println();
* */
