class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val br = System.`in`.bufferedReader()
            val data = br.readLine().split(" ")
            println(data[0].toInt() + data[1].toInt())
            println(data[0].toInt() - data[1].toInt())
            println(data[0].toInt() * data[1].toInt())
            println(data[0].toInt() / data[1].toInt())
            println(data[0].toInt() % data[1].toInt())
        }
    }
}