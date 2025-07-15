class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val range = reader.readLine().toInt()
            var plus = 1
            val answerList = ArrayList<Int>()
            for(i in 0..range-1){
                val input = reader.readLine().split("")
                var answer = 0
                for(data in input){
                    if(data =="O"){
                        answer += plus
                        plus++
                    }else{
                        plus = 1
                    }
                }
                answerList.add(answer)
            }
            for(data in answerList){
                println(data)
            }
        }
    }
}
