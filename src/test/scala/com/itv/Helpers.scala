package com.itv

import scala.util.Random

trait Helpers {

  val r: Random = Random

  def generatePalindrome: () => String = () => {
    val length = 1 to r.nextInt(25)
    val getChar = (r.nextInt(26) + 65).asInstanceOf[Char]
    val half = length.map(_ => getChar)
    (half ++ half.reverse).mkString
  }

  def generateUnPalindrome: () => String = () => {
    s"A${generatePalindrome()}B"
  }
}
