class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val input = reader.readLine()
            val positions = IntArray(26) { -1 }
            for (i in input.indices) {
                val c = input[i]
                val index = c - 'a'
                if (positions[index] == -1) {
                    positions[index] = i
                }
            }
            println(positions.joinToString(" "))
        }

    }
}
