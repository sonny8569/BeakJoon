class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val data = reader.readLine().toInt()
            for(i in (data-54).coerceAtLeast(1)..data){
                val sum = getSum(i)
                val isAnswer = i + sum
                if(isAnswer == data){
                    println(i)
                    return
                }
            }
            println(0)
        }
        private fun getSum(number: Int) : Int {
            return number.toString()
                .map { it.digitToInt() }
                .sum()
        }
    }
}
