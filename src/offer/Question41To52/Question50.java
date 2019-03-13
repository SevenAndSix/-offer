package offer.Question41To52;

import java.util.HashMap;
import java.util.Map;

public class Question50 {
    public char charAppearOneTime(String str){
        if(str==null||str=="")
            return ' ';

        //存储字符串中的字符以及他出现的次数
        Map<Character,Integer> hashMap=new HashMap<>();

        int charAppearTimes;
        //扫描字符串初始化HashMap的值
        for(int i=0;i<str.length();i++){
            char curChar=str.charAt(i);
            if(hashMap.containsKey(curChar)){
                charAppearTimes=hashMap.get(curChar);
                hashMap.replace(curChar,++charAppearTimes);
            }
            else{
                hashMap.put(curChar,1);
            }

        }

        char earliestAppearChar=' ';
        //第二次扫描字符串，找到最先在HashMap中出现次数为一的字符
        for(int j=0;j<str.length();j++){
            if(hashMap.get(str.charAt(j))==1){
                earliestAppearChar=str.charAt(j);
                break;
            }
        }

        return earliestAppearChar;
    }
}

/*
*   Question50测试函数
*       Question50 question50=new Question50();
        char resultChar=question50.charAppearOneTime("aabbccdeeff");
* */
