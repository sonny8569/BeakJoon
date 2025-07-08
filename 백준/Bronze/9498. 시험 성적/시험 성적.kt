class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val data = reader.readLine().toInt()
            when (data) {
                in 90..100 -> {
                    println("A")
                }

                in 80..89 -> {
                    println("B")
                }

                in 70..79 -> {
                    println("C")
                }

                in 60..69 -> {
                    println("D")
                }

                else -> println("F")
            }
        }
    }
}