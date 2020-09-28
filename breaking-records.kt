// Hackerrank Practice - Algorithms - Implementation - Breaking the Records

// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?h_r=profile

/* Function Description: Complete the breakingRecords function in the editor below.
It must return an integer array containing the numbers of times she broke her records.
Print two space-seperated integers describing the respective numbers of times the best (highest) score increased and the worst (lowest) score decreased.
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var maxValue = scores[0]
    var minValue = scores[0]
    var maxCount = 0
    var minCount = 0
    for (i in 1 until scores.size) {
        if (scores[i] < minValue ) {
            minCount ++
            minValue = scores[i]
        } else if (scores[i] > maxValue) {
            maxCount ++
            maxValue = scores[i]
        }
    }

    return arrayOf(maxCount, minCount)
}