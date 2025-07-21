
class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val inputData = ArrayList<String>()
            for (i in 0..2) {
                val input = reader.readLine().toString()
                inputData.add(input)
            }
            var answerInteger = 0
            for (i in inputData.indices) {
                val data = inputData[i]
                if (data.toIntOrNull() != null) {
                    answerInteger = data.toInt() + (3 - i)
                }
            }
            println(getAnswer(answerInteger))
        }

        private fun getAnswer(data: Int): String {
            if (data % 3 == 0 && data % 5 == 0) {
                return "FizzBuzz"
            } else if (data % 3 == 0 && data % 5 != 0) {
                return "Fizz"
            } else if (data % 3 != 0 && data % 5 == 0) {
                return "Buzz"
            }
            return data.toString()
        }
    }
}
