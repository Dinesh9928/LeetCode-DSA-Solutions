object Solution {
  def minSubArrayLen(target: Int, nums: Array[Int]): Int = {
    var total = 0
    var left = 0
    var right = 0
    var res = Int.MaxValue
    val n = nums.length

    while (left <= right && right < n) {
      total += nums(right)
      while (total >= target) {
        res = res.min(right - left + 1)
        total -= nums(left)
        left += 1
      }
      right += 1
    }

    if (res != Int.MaxValue) res else 0
  }
}
