// Hackerrank Interview Preparation

/* An avid hiker keeps meticulous records of their hikes.
During the last hike, for every step it was noted if it was an uphill, U, or a downhill, D step.
Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude.
We define the following terms:
A mountain is a sequence of consecutive steps above sea level,
starting with a step up from sea level and ending with a step down to sea level.
A valley is a sequence of consecutive steps below sea level,
starting with a step down from sea level and ending with a step up to sea level.
Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.

Function Description
countingValleys has the following parameter(s):
- int steps: the number of steps on the hike
- string path: a string describing the path
Returns
- int: the number of valleys traversed */

fun countingValleys(steps: Int, path: String): Int {
    var count = 0
    var level = 0
    path.forEach {
        when (it) {
            'U' -> {
                if (level == -1) {
                    count ++
                }
                level += 1
            }
            'D' -> {
                level -= 1
            }
        }
    }
    return count
}