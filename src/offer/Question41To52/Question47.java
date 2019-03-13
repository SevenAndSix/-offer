package offer.Question41To52;

public class Question47 {
    public int maxValueOfGifts(int[][] valueMatrix){
        if(valueMatrix==null){
            return -1;
        }
        int xLength=valueMatrix.length;
        int yLength=valueMatrix[0].length;

        int result=0;
        try{
            result=recursiveLoc(valueMatrix,xLength,yLength,0,0);
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

    public int recursiveLoc(int[][] valueMatrix,int xLengthMatrix,int yLengthMatrix,int xIndex,int yIndex) throws Exception{
        if(!(xIndex<xLengthMatrix)||!(yIndex<yLengthMatrix)){
            throw new Exception("下标越界");
        }

        int result=0;
        if((xIndex==xLengthMatrix-1)&&(yIndex==yLengthMatrix-1)){
            return valueMatrix[xIndex][yIndex];
        }
        else if(xIndex==xLengthMatrix-1){
            result=valueMatrix[xIndex][yIndex]+recursiveLoc(valueMatrix,xLengthMatrix,yLengthMatrix,xIndex,yIndex+1);
        }
        else if(yIndex==yLengthMatrix-1){
            result=valueMatrix[xIndex][yIndex]+recursiveLoc(valueMatrix,xLengthMatrix,yLengthMatrix,xIndex+1,yIndex);
        }
        else{
                if(recursiveLoc(valueMatrix,xLengthMatrix,yLengthMatrix,xIndex,yIndex+1)>recursiveLoc(valueMatrix,xLengthMatrix,yLengthMatrix,xIndex+1,yIndex)){
                    result=valueMatrix[xIndex][yIndex]+recursiveLoc(valueMatrix,xLengthMatrix,yLengthMatrix,xIndex,yIndex+1);
                }
                else {
                    result=valueMatrix[xIndex][yIndex]+recursiveLoc(valueMatrix,xLengthMatrix,yLengthMatrix,xIndex+1,yIndex);
                }
        }

        return result;
    }
}

/*
*   Question47测试函数
*       int[][] valueMatrix={{1,10,3,8},{12,2,9,6},{5,7,4,11},{3,7,16,5}};
        Question47 question47=new Question47();
        int maxValue=question47.maxValueOfGifts(valueMatrix);
* */
