package offer.Question11To20;

public class Question17 {
    public void printNumber(char[] number){
        boolean isBeginPrint=false;
        for(int i=0;i<number.length;i++){
            if((!isBeginPrint)&&(number[i]!='0')){
                isBeginPrint=true;
            }
            if(isBeginPrint){
                System.out.print(number[i]);
            }
        }
        System.out.print('\t');
    }

    public void print1ToMaxNDigits(int n){
        if(n<=0)
            return;

        char[] number=new char[n];
        for(int i=0;i<10;i++){
            number[0]=(char)(i+'0');
            print1ToMaxNDigitsRecursively(number,n,0);
        }
    }

    public void print1ToMaxNDigitsRecursively(char[] number,int length,int index){
        if(index==length-1){
            printNumber(number);
            return;
        }

        for(int i=0;i<10;i++){
            number[index+1]=(char)(i+'0');
            print1ToMaxNDigitsRecursively(number,length,index+1);
        }
    }
}

/*
*   Question17测试函数
*       Question17 question17=new Question17();
        question17.print1ToMaxNDigits(2);
* */
