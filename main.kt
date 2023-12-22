fun main() {
    countApplesAndOranges(7,10, 4, 12, arrayOf(2, 3, -4), arrayOf(3, -2, -4))
}

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>) {
//    s: house starting point
//    t: house ending point
//    a: location of Apple Tree
//    b: location of Orange Tree
//    apples, oranges: distances at which each apple falls from the tree

    var appleCount = 0
    var orangeCount = 0

    for (i in apples.indices) {
        apples[i] = apples[i] + a
    }
    for (j in oranges.indices) {
        oranges[j] = oranges[j] + b
    }

    for (apple in apples) {
        if (apple in s..t) {
            appleCount++
        }
    }
    for (orange in oranges) {
        if (orange in s..t) {
            orangeCount++
        }
    }

    println(appleCount)
    println(orangeCount)

}