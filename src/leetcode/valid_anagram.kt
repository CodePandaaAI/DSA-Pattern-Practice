package leetcode


fun main() {
    isAnagram("anagram", "nagaram")
}
fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length) return false

    val ss = s.toCharArray()
    val tt = t.toCharArray()

    ss.sort()
    tt.sort()
    println(ss)
    println(tt)

    if(ss.contentEquals(tt)) return true
    return false
}