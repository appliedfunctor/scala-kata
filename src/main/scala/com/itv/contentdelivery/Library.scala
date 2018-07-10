package com.itv.contentdelivery

object Library {

  /**
    * implement using a built in method
    * @param input the supplied character
    * @return the supplied character with capitalisation discarded
    */
  def stripCapitalisation(input: Char): Char = input

  /**
    * Check to determine if a character is a space: ' '.
    * You can ignore other spacing characters such as "\t" or "\n"
    * @param input the supplied character
    * @return a boolean: true if a space, false if not
    */
  def isSpacing(input: Char): Boolean = false

  /**
    * A check to determine if a character is punctuation.
    * The only characters you need to check for are:
    * '!','?','“','”','’','.','"',';' and ','
    * @param input the supplied string
    * @return a boolean: true if punctuation, false if not
    */
  def isPunctuation(input: String): Boolean = false

  /**
    * A function that strips out all spacing, punctuation
    * and removes capitalisation. Use filter and map to implement.
    * Extension: be more efficient. Do in one pass using a fold.
    * @param input
    * @return
    */
  def stripAll(input: String): String = input
  /**
    * A function to check if a string is a palindrome
    * It should sanitise the input first using stripAll
    * It should be implemented using recursion
    * @param input the supplied string to check
    * @return a boolean to indicate if the input is (true)
    *         or is not (false) a palindrome
    */
  def isPalindrome(input: String): Boolean = true

  //bonus
  def CapitaliseFirst(input: String): String = ""

  def CapitaliseAll(input: String): String = ""
}
