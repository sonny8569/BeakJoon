class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val people = reader.readLine().toInt()
            val size = reader.readLine().split(" ").map { data -> data.toInt() }
            val (group, penSize) = reader.readLine().split(" ").map { data -> data.toInt() }
            var tShir = 0
            for (tShirtSize in size) {
                if (tShirtSize == 0) continue
                else if (tShirtSize % group == 0) {
                    tShir += tShirtSize / group
                }else{
                    tShir += tShirtSize /group +1
                }
            }
            println(tShir)
            println("${(people / penSize)} ${(people % penSize)}")
        }
    }
}
