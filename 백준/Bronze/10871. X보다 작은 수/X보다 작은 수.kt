class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val br = System.`in`.bufferedReader()
            val data = br.readLine().split(" ")
            val range = data[1].toInt()
            val answer = ArrayList<Int>()
            val input = br.readLine().split(" ")
            for(j in input){
                if(j.toInt() < range){
                    answer.add(j.toInt())
                }
            }
            for(i in answer){
                print("$i ")
            }
        }
    }
}