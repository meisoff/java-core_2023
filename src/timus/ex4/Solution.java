package timus.ex4;

import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<Character,Integer> list = new HashMap<Character,Integer>();

    public void initial(){
        list.put('I',1);
        list.put('V',5);
        list.put('X',10);
        list.put('L',50);
        list.put('C',100);
        list.put('D',500);
        list.put('M',1000);
    }

    public int doubleNumber(Character first,Character second){
        if(first=='I'){
            if(second == 'V') return 4;
            if(second == 'X') return 9;
        }
        if(first=='X'){
            if(second == 'L') return 40;
            if(second == 'C') return 90;
        }
        if(first=='C'){
            if(second == 'D') return 400;
            if(second == 'M') return 900;
        }
        return -1;
    }

    public int romanToInt(String s) {
        initial();
        int result = 0;
        for(int i = 0;i<s.length();i++){
            if(i+1<s.length()){
                int value = doubleNumber(s.charAt(i),s.charAt(i+1));
                result+= value != -1 ? value : list.get(s.charAt(i));
                if(value!=-1) i++;
            }else
                result+= list.get(s.charAt(i));
        }
        return result;
    }
}
