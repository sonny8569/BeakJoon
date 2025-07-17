class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val (cardMount, target) = reader.readLine().split(" ").map { data -> data.toInt() }
            var maxSum = 0
            val cardList = reader.readLine().split(" ").map { data -> data.toInt() }
            for(firstCard in 0 until cardList.size){
                for(secondCard in firstCard + 1 until cardList.size){
                    for(thirdCard in secondCard +1 until cardList.size){
                        val sum = cardList[firstCard] + cardList[secondCard] + cardList[thirdCard]
                        if (sum <= target && sum > maxSum) {
                            maxSum = sum
                        }
                    }
                }
            }
            println(maxSum)
        }
    }
}
