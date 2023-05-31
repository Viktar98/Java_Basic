package SigmodeEx;

public class SigmoidOne {
    double x, result1, result2, result3, result4;
  public void neg(){
      result1 = x * (-1);
  }
  public void pow(){
      result2 = Math.pow(Math.E, result1);
  }
  public void sum() {
      result3 = 1 + result2;
  }
  public void div(){
      result4 = 1 / result3;
  }

}
