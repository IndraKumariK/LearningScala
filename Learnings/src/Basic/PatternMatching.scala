package Basic

object PatternMatching {
  def main(args:Array[String]){
    var result=hello("Hello")
    println(result)
  }
  def hello(a:Any):Any=a match {
    case 1 => println("1")
    case "Hello" =>{
      println("Found Hello") 
      return "Found Hello"
    }
    case _ => println("default")
  }
}