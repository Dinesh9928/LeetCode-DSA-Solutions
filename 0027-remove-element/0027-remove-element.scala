object Solution {
    def removeElement(nums: Array[Int], `val`: Int): Int = {
        var k = 0
        for (n <- nums) {
        if (n != `val`) {
            nums(k) = n
            k += 1
        }
        }
        k
    }
}