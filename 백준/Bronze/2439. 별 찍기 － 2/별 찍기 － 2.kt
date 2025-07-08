class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val input = reader.readLine().toInt()
            for (i in 1..input) {
                val spaces = " ".repeat(input - i)
                val stars = "*".repeat(i)
                println(spaces + stars)
            }
        }
    }
}