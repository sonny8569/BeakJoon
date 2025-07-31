import java.util.ArrayDeque


class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val br = System.`in`.bufferedReader()
            val length = br.readLine().toInt()
            val deque = ArrayDeque<Int>()
            for(i in 1 until length+1) {
                deque.add(i)
            }
           while (deque.size > 1){
               deque.removeFirst()
               val first = deque.removeFirst()
               deque.add(first)
           }
            println(deque.first)
        }
    }
}