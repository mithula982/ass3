object CheckNum {
def numType(n:Int):Int={
  if(n%2==0) 1
  else 0

}

  def main(args:Array[String]): Unit =
  {
    print("Enter the value of n:");
    var n=scala.io.StdIn.readInt();
    var x:Int=numType(n);
    if(x==1)
      println(n+""+"is even number");
    else
      println(n +"is odd number");
  }
}
