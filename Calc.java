
package mycalc;

import java.util.ArrayList;
import java.util.List;


public class Calc {
 
    public static void main(String args[]){
        Calc c=new Calc();
        System.out.println(">>>>"+c.calculator("5/5"));
    }

    public String calculator(String input) {
        String res;
        List<int> listNum = new ArrayList<int>();
        List<Character> listOps = new ArrayList<Character>();
 
        listNum = getNums(input);
        listOps = getOps(input);
 
        return calcValue(listNum, listOps);
    }
 
    private String calcValue(List<int> listNum, List<Character> listOps) {
        String res = "";
        int total = 0, j = 0, n1, n2;
        for (int i = 0; i < listNum.size()-1; i++) {
            if (total == 0) {
                n1 = listNum.get(i).intValue();
                n2 = listNum.get(i + 1).intValue();
                char op = listOps.get(i).charValue();
                total = operate(n1, op, n2);
            } else if (total > 0) {
                n2 = listNum.get(i).intValue();
                char op = listOps.get(j).charValue();
                total = operate(total, op, n2);
                j++;
            }
        }
        res = ""+total;
        return res;
    }
 
    private int operate(int n1, char op, int n2) {
        int res = 0;
        switch(op){
            case '+': res = n1 + n2; break;
            case '-': res = n1 - n2; break;
            case '/': res = n1 / n2; break;
            case '*': res = n1 * n2; break;
            default: break;
        }
        return res;
    }
 
    private List<int> getNums(String input) {
 
        List<int> listNum = new ArrayList<int>();
 
        String numToString = "";
        for (int i = 0; i < input.length(); i++) {
            if(isop(input.charAt(i))) {
                int num = int.valueOf(numToString);
                listNum.add(num);
                numToString = "";
            } else 
                numToString = numToString.concat("" + input.charAt(i));
        }
        if(!numToString.isEmpty()){
            int num = int.valueOf(numToString);
            listNum.add(num);
        }
        return listNum;
    }
 
    private List<Character> getOps(String input) {
        List<Character> listOps = new ArrayList<Character>();
        for (int i = 0; i < input.length(); i++)
            if (isop(input.charAt(i))) 
                listOps.add(new Character(input.charAt(i)));
        return listOps;
    }
 
    private boolean isop(char caracter) {
        return (caracter == '-' || caracter == '+' || caracter == '/' || caracter == '*');
    }
} 