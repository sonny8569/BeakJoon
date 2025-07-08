class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val br = System.`in`.bufferedReader()
            val index = br.readLine().toInt()
            val answer = ArrayList<Int>()
            for(i in 0..index-1){
                val data = br.readLine().split(" ")
                answer.add(data[0].toInt()+data[1].toInt())
            }
            for(i in answer){
                println(i)
            }
        }
    }
}