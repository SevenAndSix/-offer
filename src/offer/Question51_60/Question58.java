package offer.Question51_60;

public class Question58 {
    public String reverseStr(String str){
        char[] charArray=str.toCharArray();
        reverse(charArray,0,charArray.length-1);

        int begin=0,end=0;
        while (end!=str.length()){
            if(charArray[begin]==' '){
                begin++;
                end++;
            }
            else if(charArray[end]==' '){
                reverse(charArray,begin,end-1);
                begin=(++end);
            }
            else {
                end++;
            }
        }

        return String.valueOf(charArray);
    }

    private void reverse(char[] charArray,int begin,int end){
        while (begin<end){
            char temp=charArray[begin];
            charArray[begin++]=charArray[end];
            charArray[end--]=temp;
        }
    }
}

/*
* 测试函数
*       Question58 question58=new Question58();
        String str="I am a student.";
        String result=question58.reverseStr(str);
* */
