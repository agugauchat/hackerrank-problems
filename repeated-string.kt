// Hackerrank Interview Preparation

/* There is a string s, of lowercase English letters that is repeated infinitely many times.
Given an integer n, find and print the number of letter a's in the first  letters of the infinite string. */

fun repeatedString(s: String, n: Long): Long {
    var count : Long = 0
    val stringSize = s.length
    val aInString = s.count { it == 'a' }
    val sInN : Long = n.div(stringSize)

    count = aInString * sInN

    // a in diff
    val diffSize = (n - (s.length * sInN)).toInt()
    if (diffSize >  0) {
        var difString = s.substring(0, diffSize)
        count += difString.count { it == 'a' }
    }

    return count
}