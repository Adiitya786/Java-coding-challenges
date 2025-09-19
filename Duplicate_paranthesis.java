import java.util.*;
public class Duplicate_paranthesis {

    public static boolean isduplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i =0;i<str.length();i++){
              char ch = str.charAt(i);
              // closing
              if(ch==')'){
                int count =0;
                    while(s.peek()!='('){
                        s.pop();
                        count++;

                    }
                    if(count<1){
                        return true;
                    }
                    else{
                        s.pop();
                    }
              }
              else{
                s.push(ch);// opening
              }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 ="((a+b)+(c+d))";
        String str2 ="(((a+b)+(c+d)))";
        System.out.println(isduplicate(str1));
        System.out.println(isduplicate(str2));
    }
}
