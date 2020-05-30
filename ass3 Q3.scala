object Add {
def add(n:Int):Int={
  if(n==1) 1
  else n+add(n-1)

}

  def main(args:Array[String]): Unit =
  {
    print("enter the value of n:");
    var n=scala.io.StdIn.readInt();
    print("Sum("+n+")=");
    println(add(n));
  }
}
