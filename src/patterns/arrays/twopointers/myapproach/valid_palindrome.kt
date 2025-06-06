package patterns.arrays.twopointers.myapproach

fun main() {
    val result = find("cxvffdgff")
    print(result)
}

fun find(s: String): Boolean {
    var cleanStr = s.filter { it.isLetterOrDigit() }
    cleanStr = cleanStr.lowercase()

    var start = 0
    var end = cleanStr.length - 1

    while(start<end){
        if(cleanStr[start] != cleanStr[end]) return false
        else {
            start++
            end--
        }
    }
    return true
}