object Solution {
  def isHappy(n: Int): Boolean = {
    var temp = n
    while (true) {
      if (temp == 89) {
        return false
      }
      if (temp == 1) {
        return true
      }
      temp = digitSquareSum(temp)
    }
    false // This line will never be reached but Scala needs a return statement here
  }

  def digitSquareSum(n: Int): Int = {
    var sum = 0
    var num = n
    while (num > 0) {
      sum += (num % 10) * (num % 10)
      num /= 10
    }
    sum
  }
}
