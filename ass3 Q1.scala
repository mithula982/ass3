object PrimeORnot {
 def primeNo(n:Int,i:Int): Boolean=
  {
    if(i==1) true
    else if(n%i==0) false
    else primeNo(n,i-1)
  }

  def main(args:Array[String]): Unit =
  {
    print("Enter the number:");
    var n=scala.io.StdIn.readInt();
    var bool:Boolean=primeNo(n,n/2);
    if(bool==true)
      println("True");
    else
      println("False");
  }
}
