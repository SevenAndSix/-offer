package offer.Question21To30;

public class Question29 {
    public void printMatrix(int[][] numbers,int raws,int cols){
        int circleCount=0;   //打印的圈数
        while(raws-2*circleCount>0&&cols-2*circleCount>0){
            int circleNumbers=0;   //顺时针一圈所要打印的数字个数
            if(raws-2*circleCount==1)
                circleNumbers=cols;
            else if(cols-2*circleCount==1)
                circleNumbers=raws;
            else{
                circleNumbers=(cols-2*circleCount)*2+(raws-2*circleCount-2)*2;
            }

            int xIndex=circleCount;
            int yIndex=circleCount;
            for(int i=0;i<circleNumbers;i++){
                //矩形上面的那条边
                if(yIndex<cols-circleCount&&xIndex==circleCount){
                    if(i>=circleNumbers)
                        break;

                    System.out.print(numbers[xIndex][yIndex++]+"\t");
                }
                //矩形右边的那条边
                if(yIndex==cols-circleCount&&xIndex<raws-circleCount){
                    if(i>=circleNumbers)
                        break;

                    if(xIndex==circleCount)
                        i++;
                    xIndex++;
                    if(xIndex<raws-circleCount&&xIndex<raws-circleCount){
                        System.out.print(numbers[xIndex][yIndex-1]+"\t");
                    }
                }
                //矩形下面的那条边
                if(xIndex==raws-circleCount&&yIndex>circleCount){
                    if(i>=circleNumbers)
                        break;

                    if(yIndex==cols-circleCount)
                        i++;
                    if(yIndex==cols-circleCount)
                        yIndex--;
                    System.out.print(numbers[xIndex-1][--yIndex]+"\t");
                }
                //矩形左边的那条边
                if(xIndex>circleCount&&yIndex==circleCount){
                    if(i>=circleNumbers)
                        break;

                    if(xIndex==raws-circleCount)
                        xIndex--;
                    System.out.print(numbers[--xIndex][yIndex]+"\t");
                }
            }
            circleCount++;
        }
    }
}

/*
*   Question29测试函数
*       int[][] numbers={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Question29 question29=new Question29();
        question29.printMatrix(numbers,4,4);
* */
