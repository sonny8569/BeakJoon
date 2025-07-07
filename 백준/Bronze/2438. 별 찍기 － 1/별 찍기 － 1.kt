import java.io.BufferedReader
import java.io.InputStreamReader

class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val index = br.readLine().toInt()
            for (i in 1..index) {
                var start = ""
                for (j in 1..i) {
                    start += "*"
                }
                println(start)
            }
        }
    }
}