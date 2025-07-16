class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val answer = ArrayList<String>()
            while (true) {
                val input = reader.readLine().split(" ").map { data -> data.toInt() }
                if (input.size < 3) break
                if (input[0] == 0 && input[1] == 0 && input[2] == 0) break
                val length1 = input[0]
                val length2 = input[1]
                val length3 = input[2]
                if((length1 * length1) + (length2 * length2) == (length3 * length3)){
                    answer.add("right")
                    continue
                }
                else if((length3 * length3) + (length1 * length1) == (length2 * length2)){
                    answer.add("right")
                    continue
                }
                else if((length2 * length2) + (length3 * length3) == (length1 * length1)){
                    answer.add("right")
                    continue
                }
                answer.add("wrong")
            }
            for (data in answer) {
                println(data)
            }
        }
    }
}
