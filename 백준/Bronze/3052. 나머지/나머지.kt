class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val set = mutableSetOf<Int>()
            for(i in 0..9){
                val input = reader.readLine().toInt()
                val data = input % 42
                set.add(data)
            }
            println(set.size)
        }
    }
}
