object Solution {
    def longestConsecutive(nums: Array[Int]): Int = {
        var maxSeq = 0;
        val sequences = scala.collection.mutable.HashSet[Int]()

        for (num <- nums) {
            sequences.add(num);
        }
        for ( num <- nums) {
            var nextInSeq = num + 1
            var prevInSeq = num - 1
            var currentSequence = 1
            while (sequences.remove(prevInSeq)) {
                prevInSeq -=1
                currentSequence += 1
            }
            while (sequences.remove(nextInSeq)) {
                nextInSeq +=1
                currentSequence += 1
            }
            if (currentSequence > maxSeq) {
                maxSeq = currentSequence;
            }
        }
        return maxSeq;
    }
}