object Solution {
  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.length <= 1) {
      return nums.length
    }

    var j = 1
    val n = nums.length

    for (i <- 2 until n) {
      if (nums(j - 1) != nums(i)) {
        j += 1
        nums(j) = nums(i)
      }
    }
    j + 1
  }
}
