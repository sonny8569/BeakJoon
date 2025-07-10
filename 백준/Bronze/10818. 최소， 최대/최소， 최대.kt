class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val index = reader.readLine().toInt()
            val input = reader.readLine().split(" ")
            if (input.size != index) {
                return
            }
            val min = getMin(input)
            val max = getMax(input)
            println("$min $max")
        }

        private fun getMin(data: List<String>): Int {
            var min = Integer.MAX_VALUE
            for (integer in data) {
                if (min > integer.toInt()) {
                    min = integer.toInt()
                }
            }
            return min
        }

        private fun getMax(data: List<String>): Int {
            var max = Integer.MIN_VALUE
            for (integer in data) {
                if (max < integer.toInt()) {
                    max = integer.toInt()
                }
            }
            return max
        }
    }
}
