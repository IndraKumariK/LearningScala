package Basic
//Functions example
object Functions {
  def main(args:Array[String]){
 
   var result = functionReturnValue()
   println("Function return String value"+result)
   functionWithoutReturnValue()
   var result1 = paramterFunction(10,20)
   println("paramterFunction"+result1)
   var result2 = recursiveFunction(3,3)
   println("recursiveFunction"+result2)
   var result3 = defaultValueFunction(10)
   println("defaultValueFunction"+result3)
   var result4 = namedParameter(b=10,a=1)
   println("namedParameter"+result4)
  }
  
  def functionReturnValue()={
    var i = "Hi"
    i
   }
 def functionWithoutReturnValue(){
   println("functionWithoutReturnValue"+"Hello")
 }
  def paramterFunction(A:Int,B:Int)={
    A+B
  }
  def recursiveFunction(A:Int,B:Int):Int={
    if(B==0)
      0
    else
      A+recursiveFunction(A,B-1)
  }
  def defaultValueFunction(a:Int=0,b:Int=0):Int={
    a+b
  }
  
  def namedParameter(a:Int,b:Int):Int={
    a+b
  }
  
  
}