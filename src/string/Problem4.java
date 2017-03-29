package string;

import java.util.Arrays;

/**
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/24.
 * 替换字符串中的空格
 */
public class Problem4 {
    public static void replaceBlank(char String[],int length){
        if(String==null && length<=0){
            return;
        }
        int originalLength=String.length;
        int numberOfBlank=1;
        int i=0;
//        while(String[i]!='\0'){//计算字符串长度和空格数量
//            ++originalLength;
//            if(String[i]==' '){
//                ++numberOfBlank;
//            }
//            ++i;
//        }
        /* originalLength 为旧字符串长度，numberOfBlank为空格的数量*/
        int newLength = originalLength + 2 * numberOfBlank;
//        if(newLength>length){
//            return;
//        }
        int indexOfOriginal = originalLength-1;
        int indexOfNew = newLength-1;
        char newArrayString[]=Arrays.copyOf(String,newLength);
        while (indexOfOriginal >= 0 && indexOfNew > indexOfOriginal) {//字符串未循环完并且空格还没有完全替换完。替换完indexOfNew==indexofOriginal
            if (String[indexOfOriginal] == ' ') {
                newArrayString[indexOfNew--] = '0';
                newArrayString[indexOfNew--] = '2';
                newArrayString[indexOfNew--] = '%';
            } else {
                newArrayString[indexOfNew--] = String[indexOfOriginal];
            }
            --indexOfOriginal;
        }
        System.out.println(newArrayString.toString());
    }

    public static void replaceStr(String input){
        if(input==null){
            return;
        }
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                builder.append("%");
                builder.append("2");
                builder.append("0");
            }else{
                builder.append(input.charAt(i));
            }
        }
        System.out.println(builder.toString());


    }

    public static void main(String[] args){
        char[] str=new char[4];
        str[0]='I';
        str[1]=' ';
        str[2]='a';
        str[3]='d';
        replaceBlank(str,4);

        replaceStr("I am Ok");
    }


}
