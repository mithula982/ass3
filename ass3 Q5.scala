object AddEven {
def sum(num:Int):Int={
  if(num!=0 && num%2==0) num+sum(num-2);
  else 0
}

  def Checknum(x:Int): Int =
  {
   if(x%2==1) x-1
   else x-2

  }

  def main(args:Array[String]): Unit =
  {

    print("Enter the Number:");
    var n=scala.io.StdIn.readInt();
    println("Sum all even numbers less than "+n+":");
    println(sum(Checknum(n)));

  }
}
