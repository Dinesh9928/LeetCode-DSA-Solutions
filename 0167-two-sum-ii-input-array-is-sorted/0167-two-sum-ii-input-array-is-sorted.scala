object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        var i = 0
        var j = nums.length - 1
        var sum = 0
        var res = Array(0, 0)

        while (i < j) {
          sum = nums(i) + nums(j)
          if (sum == target) {
            res(0) = i + 1
            res(1) = j + 1
            return res
          } else if (sum < target) {
            i += 1
          } else {
            j -= 1
          }
        }
        res
    }
}