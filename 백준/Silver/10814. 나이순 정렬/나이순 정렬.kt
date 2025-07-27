class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val index = reader.readLine().toInt()
            val list = ArrayList<Pair<Int, String>>()
            for (i in 0 until index) {
                val input = reader.readLine().split(" ")
                list.add(Pair(input[0].toInt(), input[1]))
            }
            list.sortBy { data -> data.first }
            for (i in list) {
                println("${i.first} ${i.second}")
            }
        }
    }
}
