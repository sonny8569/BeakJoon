class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val size = reader.readLine().toInt()

            val count = IntArray(10001)

            repeat(size) {
                val input = reader.readLine().toInt()
                count[input]++
            }

            val sb = StringBuilder()
            for (i in 1..10000) {
                repeat(count[i]) {
                    sb.append(i).append('\n')
                }
            }

            print(sb)
        }
    }
}
