package offer.Question1To10;

public class Question4 {
    //创建新的字符串
    public String replaceWS(String str){
        String resultStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                resultStr+="%20";
            }
            else
                resultStr+=str.charAt(i);
        }
        return resultStr;
    }

    //在原有的字符串上进行修改
    public String replaWS(char[] str){
        int wSpaceCount=0;
        for(int i=0;i<str.length;i++) {
            if (str[i] == ' ')
                wSpaceCount++;
        }
        int indexOfOriginal=str.length;
        int indexOfNew=str.length+wSpaceCount*2;
        while (indexOfOriginal>=0){
            if(str[indexOfOriginal-1]==' '){
                str[indexOfNew-1]='0';
                str[indexOfNew-2]='2';
                str[indexOfNew-3]='%';
            }
            else{
                str[indexOfNew-1]=str[indexOfOriginal-1];
            }
            indexOfOriginal--;
        }
        String resultStr=str.toString();

        return resultStr;
    }
}
