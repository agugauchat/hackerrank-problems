// Hackerrank Problem Solving (Basic) Certificate

// Find the substring k long, with more vowels. In case of a tie, return the first one.

fun findSubstring(s: String, k: Int): String {
    var maxVowels = 0
    var tempVowels: Int
    var result = ""
    val vowels = setOf('a','e','i','o','u')
    var tempResult: String
    s.fold(0)
    for(i in 0..s.length-k) {
        tempResult = s.substring(i, i+k).toLowerCase()
        tempVowels = tempResult.count { c -> vowels.contains(c) }
        if (tempVowels > maxVowels) {
            maxVowels = tempVowels
            result = tempResult
        }
    }

    return if (result == "") {
        "Not found!"
    } else {
        result
    }
}