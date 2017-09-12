package Basic

import scala.util.control.Breaks._
object Break {
  def main(args:Array[String]){
    breakable{
    for(i <- 1 to 10 by 2){
         if(i == 7)
          break
        else
          println(i)
      }
    } // break reach then come out of this block
  }
}