import scala.collection.mutable.Map

object Solution {
    def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {
        var map = Map[Int, Int]()
        
        for (i <- 0 to nums.length -1){
            if (map.contains(nums(i))){
                var diff = (i - map(nums(i))).abs
                if (diff <= k) return true
                else map(nums(i)) = i
            } else {
                map(nums(i)) = i
            }
        }
        
        return false
    }
}