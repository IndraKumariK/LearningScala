package Basic

object Range {
  def main(args:Array[String]){
    var r1 = 1 to 10
    var r2 = r1.start until r1.end by r1.step+1
    println(r2)
    println(r2.length)
    println(r2.start)
    r2.foreach(print)
    println(r1.step+1)
  }
}