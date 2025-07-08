class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val data = reader.readLine().toInt()
            if ((data % 4 == 0 && data % 100 != 0) || (data % 400 == 0)) {
                println("1")
            } else {
                println("0")
            }
        }
    }
}