class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val index = reader.readLine().toInt()

            val sb = StringBuilder()
            val arr = BooleanArray(2_000_001)
            for (i in 0 until index) {
                val num = reader.readLine().toInt()
                arr[num + 1_000_000] = true
            }
            for (i in arr.indices) {
                if (arr[i]) {
                    sb.append(i-1_000_000).append('\n')
                }
            }
            println(sb)
        }
    }
}
