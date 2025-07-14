
class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val length = reader.readLine().toInt()
            val answer = ArrayList<String>()
            var answerStr = ""
            for (i in 0..length - 1) {
                val input = reader.readLine().split(" ")
                val repeat = input[0].toInt()
                val data = input[1]
                for (j in data) {
                    for (k in 0..repeat - 1) {
                        answerStr += j
                    }
                }
                answer.add(answerStr)
                answerStr = ""
            }
            for (data in answer) {
                println(data)
            }
        }
    }
}
