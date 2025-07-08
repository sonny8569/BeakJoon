class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val length = reader.readLine().toInt()
            val data = reader.readLine()
            if(length != data.length){
                return
            }
            var answer = 0
            for(ch in data){
                answer += ch.digitToInt()
            }
            println(answer)
        }
    }
}