object FibonacciSeries {
def fibonacci(n:Int):Int= n match {
  case 0=>0
  case x if x==1 =>1
  case _ =>fibonacci(n-1)+fibonacci(n-2)
}

  def fibonacciseq(n:Int):Unit={
    if(n>0) fibonacciseq(n-1)
    println(fibonacci(n))
  }

  def main(args:Array[String]): Unit =
  {
    print("Enter the number:");
    var n=scala.io.StdIn.readInt();
    println("First "+n+"Fibonacci numbers:");
    fibonacciseq(n);
  }
}
