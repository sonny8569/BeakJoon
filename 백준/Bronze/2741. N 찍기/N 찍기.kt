
class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val data = reader.readLine().toInt()
            for(i in 1..data){
                println("$i")
            }
        }
    }
}