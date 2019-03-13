package offer.Question41To52;

public class Question48 {
    public int maxLengthString(String str){
        if(str==null||str=="")
            return 0;

        int subStrLength=0;  //子串长度
        String subStr="";   //记录子字符串
        for(int i=0;i<str.length();i++){
            char curChar=str.charAt(i);
            int isExist=charExistLoc(subStr,curChar);
            if(isExist==-1){
                subStr+=curChar;
                subStrLength++;
            }
            else {
                subStr=subStr.substring(isExist+1,subStr.length());
                subStr+=curChar;
                subStrLength=subStr.length();
            }
        }
        System.out.println(subStr);

        return subStrLength;
    }

    //判断字符在子串中是否已存在，存在则返回最右（可能有两个或多个字符重复）存在的的位置下标，不存在返回-1
    public int charExistLoc(String subStr,char curChar){
        int charLoc=-1;
        for(int i=0;i<subStr.length();i++){
            if(curChar==subStr.charAt(i))
                charLoc=i;
        }

        return charLoc;
    }
}

/*
*   Question48测试函数
*       Question48 question48=new Question48();
//        String str="arabcacfr";
//        String str="a";
//        String str="aaaaaaaaa";
        String str="abcdefgh";
        int maxLength=question48.maxLengthString(str);
* */
