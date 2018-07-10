package com.itv.solutions

import com.itv.Helpers
import org.scalatest.{FlatSpec, Matchers}

class PalindromeSpec extends FlatSpec with Matchers with Helpers {

  "isPalindrome" should "return true for a palindrome" in {
    "abba" shouldBe true
    Library.isPalindrome(generatePalindrome()) shouldBe true
    Library.isPalindrome(generatePalindrome()) shouldBe true
    Library.isPalindrome(generatePalindrome()) shouldBe true
    Library.isPalindrome(generatePalindrome()) shouldBe true
  }

  it should "return false for anything other than a palindrome" in {
    Library.isPalindrome(generateUnPalindrome()) shouldBe false
    Library.isPalindrome(generateUnPalindrome()) shouldBe false
    Library.isPalindrome(generateUnPalindrome()) shouldBe false
    Library.isPalindrome(generateUnPalindrome()) shouldBe false
  }

  it should "ignore punctuation" in {
    "able was i ere i saw elba." shouldBe true
  }

  it should "ignore spacing" in {
    "A Santa dog lived as a devil God at NASA" shouldBe true
  }

  it should "ignore capitalisation" in {
    "Aibohphobia" shouldBe true
  }

  it should "ignore a combination of punctutation, capitalisation and spacing" in {
    """Are we not pure? “No sir!” Panama’s moody Noriega brags. "It is garbage!" Irony dooms a man; a prisoner up to new era."""
  }

}
