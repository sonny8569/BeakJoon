class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val list = ArrayList<Int>()
            for (i in 0..2) {
                val data = reader.readLine().toInt()
                list.add(data)
            }
            var intAnswer = 0
            intAnswer = list[0] + list[1] - list[2]
            println(intAnswer)
            var strAnswer = ""
            strAnswer = ((list[0].toString() + list[1].toString()).toInt() - list[2]).toString()
            println(strAnswer)
        }
    }
}