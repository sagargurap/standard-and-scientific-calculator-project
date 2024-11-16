package com.crio.qcalc;

public class StandardCalculator {
    private int result;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }
    
    public int getResult(){
     return result;
    }
    public void setResult(int value){
      this.result=value;
    }

   public void add(int num1, int num2){
      int output=num1+num2;
      setResult(output);
   }
  
   
public void clearResult() {

  result = 0;

}


public void printResult(){

  System.out.println("Standard Calculator Result:"+ getResult());

}


public void subtract(int num1, int num2){
  int output=num1-num2;
  setResult(output);
}


public void multiply(int num1, int num2){
  int output=num1*num2;
  setResult(output);
}


public void divide(int num1, int num2){
  int output=num1/num2;
  setResult(output);
}





}
  
