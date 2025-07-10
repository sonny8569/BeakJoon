class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val count = reader.readLine().toInt()
            val numbers = reader.readLine().split(" ").map { it.toInt() }

            if (numbers.size != count) return

            var min = Int.MAX_VALUE
            var max = Int.MIN_VALUE

            for (num in numbers) {
                if (num < min) min = num
                if (num > max) max = num
            }

            println("$min $max")
        }
    }
}
