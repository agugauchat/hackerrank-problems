// Hackerrank Problem Solving (Basic) Certificate

/* Minimum cost to repair road
Let us assume there is highway.
There are N potholes at points [p1, p2, p3...., pn]
There are equal number of service crew at points [s1, s2, s3...., sn]
One service crew can repair one pothole only.
The cost to send a crew at point pX to repair a pothole at point sX is |pX-sX|

Find the minimum cost to repair the road. */

fun getMinCost(crew_id: Array<Int>, job_id: Array<Int>): Long {
    var distance: Long = 0
    val newCrewId = crew_id.sortedArray()
    val newJobId = job_id.sortedArray()
    val resultArray = (newCrewId.indices).map { (newCrewId[it] - newJobId[it]).absoluteValue }
    resultArray.forEach() {
        distance += it.toLong()
    }

    return distance
}