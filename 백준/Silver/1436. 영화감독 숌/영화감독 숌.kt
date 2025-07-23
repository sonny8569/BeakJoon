class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val endPoint = reader.readLine().toInt()
            var number = 666
            var count = 1
            while (endPoint != count){
                number ++
                if(number.toString().contains("666")) {
                    count ++
                }
            }
            System.out.println(number)
        }
    }
}