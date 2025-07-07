import java.io.BufferedReader
import java.io.InputStreamReader

class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val datas = br.readLine().split(" ")
            var answer = 0
            for (data in datas){
                answer += data.toInt() * data.toInt()
            }
            println(answer % 10)
        }
    }
}