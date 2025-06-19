package leetcode

fun main() {
    val s = "leEeetcode"
    val result = makeGood(s)
    print(result)
}

fun makeGood(s: String): String {
    val goodS = s.toMutableList()
    for (i in 0..s.length - 2) {
        if (goodS[i].uppercase() == goodS[i + 1].toString()) {
            goodS.removeAt(i)
            goodS.removeAt(i)
        }
    }
    return goodS.joinToString("")
}