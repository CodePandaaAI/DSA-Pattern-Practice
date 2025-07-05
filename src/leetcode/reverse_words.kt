package leetcode

fun main() {
    val s = "a good   example"
    val result = reverseWords(s)
    print(result)
}

fun reverseWords(s: String): String {
    // Step 1: Remove leading/trailing spaces
    val trimmedS = s.trim()

    // Step 2: Manually extract words, handling multiple spaces
    val words = mutableListOf<String>()
    var currentWord = StringBuilder()

    for (char in trimmedS) {
        if (char == ' ') {
            // If we encounter a space and the currentWord is not empty,
            // it means we finished a word. Add it to our list.
            if (currentWord.isNotEmpty()) {
                words.add(currentWord.toString())
                currentWord = StringBuilder() // Reset for the next word
            }
            // If currentWord IS empty, it means we hit multiple spaces,
            // so we just ignore this space and wait for the next non-space character.
        } else {
            // It's a non-space character, append it to the current word
            currentWord.append(char)
        }
    }

    // After the loop, add the last word if it exists
    if (currentWord.isNotEmpty()) {
        words.add(currentWord.toString())
    }

    // At this point, 'words' contains ["a", "good", "example"] for your input

    // Step 3: Manually reverse the list of words
    var start = 0
    var end = words.size - 1
    while (start < end) {
        val temp = words[start]
        words[start] = words[end]
        words[end] = temp
        start++
        end--
    }

    // Step 4: Manually join the words with a single space
    val resultBuilder = StringBuilder()
    for (i in words.indices) {
        resultBuilder.append(words[i])
        if (i < words.size - 1) {
            resultBuilder.append(" ") // Add space between words
        }
    }

    return resultBuilder.toString()
}