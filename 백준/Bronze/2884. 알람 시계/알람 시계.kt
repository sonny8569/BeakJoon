class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val br = System.`in`.bufferedReader()
            val inputData = br.readLine().split(" ")
            var time = inputData[0].toInt()
            var min = inputData[1].toInt()
            min -= 45
            if (min < 0) {
                min += 60
                time -= 1
            }
            if (time < 0) {
                time = 23
            }
            println("$time $min")
        }
    }
}