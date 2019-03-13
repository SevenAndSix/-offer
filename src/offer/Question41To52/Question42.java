package offer.Question41To52;

public class Question42 {
    private boolean inValidInput;

    public Question42(){
        this.inValidInput=false;
    }

    public int bigestSubArray(int[] numbers){
        if(numbers==null){
            inValidInput=true;
            return 0;
        }

        int bigSum=numbers[0];
        int possibleArraySun=numbers[0];   //可能的最大值的组合
        for(int i=1;i<numbers.length;i++){
            if(possibleArraySun<0){
                possibleArraySun=numbers[i];
            }
            else{
                possibleArraySun+=numbers[i];
            }
            if(possibleArraySun>bigSum){
                bigSum=possibleArraySun;
            }

        }

        return bigSum;
    }
}

/*
*   Question42测试函数
*       int[] numbers={1,-2,3,10,-4,7,2,-5};
        Question42 question42=new Question42();
        int bigSum=question42.bigestSubArray(numbers);
* */
