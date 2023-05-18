// Hackerrank Interview Preparation

/* There is a new mobile game that starts with consecutively numbered clouds.
Some of the clouds are thunderheads and others are cumulus.
The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2.
The player must avoid the thunderheads.
Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud.
It is always possible to win the game.

For each game, you will get an array of clouds numbered 0 if they are safe or 1 if they must be avoided. */

fun jumpingOnClouds(c: Array<Int>): Int {
    val cList = c.toList()
    val lastPosition = cList.size-1
    val penultimatePosition = cList.size-2
    var count = 0
    var position = 0
    while (position < lastPosition) {
        if (position == penultimatePosition) {
            position ++
        } else {
            if (cList.elementAt(position+2) == 0) {
                position += 2
            } else {
                position ++
            }
        }
        count ++
    }

    return count
}