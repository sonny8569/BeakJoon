class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val testCase = reader.readLine().toInt()
            val answer = ArrayList<Int>()

            for (i in 0 until testCase) {
                val data = reader.readLine().split(" ")
                val H = data[0].toInt()
                val N = data[2].toInt()
                var floor = N % H
                var room = N / H + 1
                if (floor == 0) {
                    floor = H
                    room -= 1
                }
                answer.add(floor * 100 + room)
            }
            for (res in answer) {
                println(res)
            }
        }
    }
}
