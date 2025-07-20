class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val dataLength = reader.readLine().toInt()
            val data = reader.readLine().toString()
            if (dataLength != data.length) return
            System.out.println(getHashData(data))
        }

        private fun getHashData(s: String): Long {
            val r = 31L
            val m = 1234567891L
            var power = 1L
            var data = 0L
            for (char in s) {
                val charValue = (char - 'a' + 1).toLong()
                data = (data + (charValue * power) % m) % m
                power = (power * r) % m
            }
            return data
        }
    }

}
