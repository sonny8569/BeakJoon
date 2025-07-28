class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val targetIndex = reader.readLine().toInt()
            val targetData = reader.readLine().split(" ").map { data -> data.toInt() }.associateWith { true }
            val findIndex = reader.readLine().toInt()
            val findData = reader.readLine().split(" ").map { data -> data.toInt() }
            for (data in findData) {
                if(targetData[data] == true) {
                    println("1")
                } else {
                    println("0")
                }
            }
        }
    }
}
