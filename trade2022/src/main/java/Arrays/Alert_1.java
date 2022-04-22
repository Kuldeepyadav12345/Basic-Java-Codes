package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
class Alert_1{
    public static void main(String args[] ) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cases = Integer.parseInt(br.readLine());                // Reading input from STDIN
 
        while(cases-- > 0){
            Integer number = Integer.parseInt(br.readLine());
 
            if(number==1){
                System.out.println("1");
            }else if(number==2){
                System.out.println("22");
            }else if(number==3){
                System.out.println("123");
            }else{
                System.out.println(solve(number));
            }
        }
    }
    static Integer getRequiredDigit(Integer number){
        Integer mulOfNine=9;
        Integer loop=1;
        Integer possibleValue=1;
        while(possibleValue<number){
            loop++;
            mulOfNine=mulOfNine*9;
            possibleValue = mulOfNine - (loop * 9) + loop;
        }
        return loop;
    }
 
    static String solve(Integer number){
        Integer reqDigit = getRequiredDigit(number);
        Integer totalOneSum = number-reqDigit;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<totalOneSum;i++){
            stringBuilder.append("1");
        }
        int mul=1;
        while(reqDigit>0) {
            Integer getRemainingValue = getRemaining(reqDigit, totalOneSum, mul);
            reqDigit--;
            stringBuilder.append(getRemainingValue + "");
            totalOneSum+=getRemainingValue;
            mul=mul*getRemainingValue;
        }
 
        return stringBuilder.toString();
 
    }
 
    static Integer getRemaining( Integer reqDigit, Integer totalOneSum, Integer mul)
    {
        Integer maxValue = (int)Math.pow(9,reqDigit-1);
        Integer possibleSum =totalOneSum+(reqDigit-1)*9 + 1;
        Integer possibleMul =maxValue*mul;
        int i=2;
 
        if(reqDigit==1){
            maxValue = possibleMul;
        }else{
            maxValue=maxValue*mul;
        }
        
        for (; possibleMul<possibleSum && i<10; i++) {
            possibleSum++;
            possibleMul = maxValue*i;
        }
        return i-1;
    }
 
    static Integer getDigitSum(Integer mid)
    {
        Integer result =0;
        while(mid>0){
            result+=(mid%10);
            mid=mid/10;
        }
        return result;
    }
 
    static Integer getDigitMul(Integer mid)
    {
        Integer result =1;
        while(mid>0){
            result*=(mid%10);
            mid=mid/10;
        }
        return result;
    }
}