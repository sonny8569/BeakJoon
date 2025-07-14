class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val length = reader.readLine().toInt()
            val answer = mutableListOf<String>()

            for (i in 0 until length) {
                val (repeatStr, word) = reader.readLine().split(" ")
                val repeat = repeatStr.toInt()
                val builder = StringBuilder()

                for (char in word) {
                    repeat(repeat) {
                        builder.append(char)
                    }
                }
                answer.add(builder.toString())
            }

            answer.forEach { println(it) }
        }
    }
}
