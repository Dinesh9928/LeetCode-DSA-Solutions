object Solution {
    def maxArea(height: Array[Int]): Int = {
        val n = height.length
        var res = 0
        var tempArea = 0
        var l = 0
        var r = n-1

        while(l<r){
            tempArea = Math.min(height(r), height(l))*(r-l);
            res = Math.max(res, tempArea);

            if(height(l)> height(r)){
                r-=1
            }
            else{
                l+=1
            }
        }
        res
    }
}