package offer.Question11To20;

public class Question19 {
    public boolean match(String str,String pattern){
        if(str==null||pattern==null)
            return false;
        else
            return matchCore(str,pattern);
    }

    public boolean matchCore(String str,String pattern){
        int length=str.length();
        if(str==""&&pattern=="")
            return true;
        if(str!=""&&pattern=="")
            return false;

        if(pattern.length()>1&&pattern.charAt(1)=='*'){
            if(pattern.charAt(0)==str.charAt(0)||(pattern.charAt(0)=='.'&&str!=""))
                return matchCore(str.substring(1,length),pattern.substring(2,pattern.length()))
                ||matchCore(str.substring(1,length),pattern)
                ||matchCore(str,pattern.substring(2,pattern.length()));

            else
                return matchCore(str,pattern.substring(2,pattern.length()));
        }

        if((pattern.charAt(0)==str.charAt(0)||(pattern.charAt(0)=='.'&&str!=""))&&str.length()>1&&pattern.length()>1)
            return matchCore(str.substring(1,length),pattern.substring(1,pattern.length()));

        if(str.length()==1&&(str.charAt(0)==pattern.charAt(0)||pattern.charAt(0)=='.')&&pattern.length()==1){
            return true;
        }

        return false;
    }
}

/*
*   Question19测试函数
*       String str="aaa";
        String pattern_1="a.a";
        String pattern_2="ab*ac*a";
        String pattern_3="aa.a";
        String pattern_4="ab*a";
        Question19 question19=new Question19();
        System.out.println(question19.match(str,pattern_2));
* */
