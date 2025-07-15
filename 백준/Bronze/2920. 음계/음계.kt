
class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val input = reader.readLine().split(" ")
            var range = 0
            var answer=  ""
            for(data in input){
                if(range == 0){
                    range = data.toInt()
                    continue
                }
                if(data.toInt() == range +1){
                    if(answer != "" && answer != "ascending"){
                        println("mixed")
                        return
                    }
                    answer = "ascending"
                    range = data.toInt()
                    continue
                }else if(data.toInt() == range -1){
                    if(answer != "" && answer != "descending"){
                        println("mixed")
                        return
                    }
                    answer = "descending"
                    range = data.toInt()
                    continue
                }else{
                    println("mixed")
                    return
                }
            }
            println(answer)
        }
    }
}
