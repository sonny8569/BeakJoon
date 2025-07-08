
class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            var answer = 0
            var index = 0
            for (i in 0..8) {
                val data = reader.readLine().toInt()
                if (answer < data) {
                    answer = data
                    index = i + 1
                }
            }
            println(answer)
            println(index)
        }
    }
}