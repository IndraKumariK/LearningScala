package Basic
//Yield Exmaple
object Yield {
   def main(args:Array[String]){
    var result = for(a <-1 until 10 ) yield a
    println(result) /// vector[1,2,3,4---]
    for(i<-result){
      println(i)
    }
      
  }
}