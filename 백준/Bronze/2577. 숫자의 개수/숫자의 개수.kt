class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            var output = 0
            val map = HashMap<Int, Int>()
            for (i in 0..9) {
                map[i] = 0
            }
            for (i in 0..2) {
                val data = reader.readLine().toInt()
                if (output == 0) {
                    output += data
                    continue
                } else {
                    output *= data
                }
            }
            val outputStr = output.toString()
            for (i in outputStr) {
                val value = map[i.digitToInt()] ?: 0
                map[i.digitToInt()] = value  + 1
            }
            for(i in 0..9){
                println(map[i])
            }
        }
    }
}
