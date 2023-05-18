// Hackerrank Interview Preparation

/* There is a large pile of socks that must be paired by color.
Given an array of integers representing the color of each sock,
determine how many pairs of socks with matching colors there are.

Function Description
sockMerchant has the following parameter(s):
- int n: the number of socks in the pile
- int ar[n]: the colors of each sock
Returns
- int: the number of pairs */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val list = ar.toList()
    val pairSize = 2
    var pairCount = 0
    for (item in list.distinct()) {
        pairCount += (Collections.frequency(list, item) / pairSize)
    }

    return pairCount
}