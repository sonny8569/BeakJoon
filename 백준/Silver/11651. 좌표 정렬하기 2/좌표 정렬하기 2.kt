
class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val index = reader.readLine().toInt()
            var list = ArrayList<Pair<Int, Int>>()
            for (i in 0 until index) {
                val input = reader.readLine().split(" ").map { data -> data.toInt() }
                list.add(Pair(input[0], input[1]))
            }
            val sorted = list.sortedWith(compareBy<Pair<Int, Int>> { it.second }.thenBy { it.first })
            for (pair in sorted) {
                println("${pair.first} ${pair.second}")
            }
        }
    }
}