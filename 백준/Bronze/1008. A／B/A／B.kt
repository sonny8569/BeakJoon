import java.io.BufferedReader
import java.io.InputStreamReader

class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val br = BufferedReader(InputStreamReader(System.`in`))
            val input = br.readLine().split(" ")
            val first = input[0]
            val sec = input[1]
            print(first.toDouble() /  sec.toDouble())
        }
    }
}