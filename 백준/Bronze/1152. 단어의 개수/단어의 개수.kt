class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val input = reader.readLine().split(" ")
            var index = 0
            for(data in input){
                if(data.isEmpty()) continue
                index ++
            }
            println(index)
        }
    }
}
