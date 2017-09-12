package Basic

object ForEach {
  def main(args:Array[String]){
    var list = List(1,2,3,4,5,6)
    list.foreach{
      println
    }
    list.foreach(print)
    list.foreach((element:Int)=>println(element))
  }
}