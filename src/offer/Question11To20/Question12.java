package offer.Question11To20;

public class Question12 {
    public boolean findPath(char[][] matrix,int raws,int cols,String str){
        boolean[][] isVisited=new boolean[raws][cols];
        int pathLength=0;
        for(int i=0;i<raws;i++){
            for(int j=0;j<cols;j++){
                if(hasPath(matrix,raws,cols,i,j,str,isVisited,pathLength)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasPath(char[][] matrix,int raws,int cols,int raw,int col,String str,boolean[][] isVisited,int pathLength){
        if(pathLength==str.length()){
            return true;
        }

        boolean hasPath=false;
        if(raw>=0&&raw<raws&&col>=0&&col<cols
                &&matrix[raw][col]==str.charAt(pathLength)
                &&!isVisited[raw][col]){
            pathLength++;
            isVisited[raw][col]=true;

            hasPath=hasPath(matrix,raws,cols,raw,col+1,str,isVisited,pathLength)
                    ||hasPath(matrix,raws,cols,raw,col-1,str,isVisited,pathLength)
                    ||hasPath(matrix,raws,cols,raw-1,col,str,isVisited,pathLength)
                    ||hasPath(matrix,raws,cols,raw+1,col,str,isVisited,pathLength);

            if(!hasPath){
                pathLength--;
                isVisited[raw][col]=false;
            }
        }
        return hasPath;
    }
}

/*
*   Question12测试函数
*       Question12 question12=new Question12();
        char[][] matrix={{'a','b','t','g'},{'c','f','c','s'},{'j','d','e','h'}};
        String str_1="bfce";
        String str_2="abfb";
        System.out.println(question12.findPath(matrix,3,4,str_1)+" "+question12.findPath(matrix,3,4,str_2));
* */
