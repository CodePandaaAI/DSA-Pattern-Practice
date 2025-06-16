package patterns.stack.myapproach

fun main() {
    val s = "hello"
    val revStringStack = Stack<Char>()
    val rev = mutableListOf<Char?>()
    for(char in s){
        revStringStack.push(char)
    }
    for(i in 0..s.length-1){
        rev.add(revStringStack.pop())
    }

    print(rev.toString())
}