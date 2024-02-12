import scala.collection.mutable.HashMap

object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val h1 = HashMap[Int, Int]()
    val ans = new Array[Int](2)
    for (i <- 0 until nums.length) {
      val value = target - nums(i)
      if (!h1.contains(value)) {
        h1.put(nums(i), i)
      } else {
        ans(0) = i
        ans(1) = h1(value)
        return ans
      }
    }
    ans
  }
}
