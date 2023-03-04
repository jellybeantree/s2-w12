public class Interval{
  private int myLeft;
  private int myRight;

  public Interval(int l, int r){
     myLeft=l;
     myRight=r;
  }
  public int sum(){
    return sumHelper(myLeft, myRight);

  }

  public int sumHelper(int left, int right){
    if(left > right){
        return 0;
    } else {
        return left + sumHelper(left+1, right);
    }
  
  }


}