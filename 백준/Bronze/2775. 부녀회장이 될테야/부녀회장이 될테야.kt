
class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val reader = System.`in`.bufferedReader()
            val testCase = reader.readLine().toInt()
            val answer = ArrayList<Int>()
            for (i in 0..testCase - 1) {
                val floor = reader.readLine().toInt()
                val room = reader.readLine().toInt()
                val arr = getMap(floor, room)
                answer.add(arr[floor-1][room] + arr[floor][room-1])
            }
            for(i in answer){
                println(i)
            }
        }

        private fun getMap(floor: Int, room: Int): Array<IntArray> {
            val arr = Array(15) { IntArray(15) { 0 } }
            for (i in 0..floor) {
                for (j in 1..room) {
                    if(j == 1) {
                        arr[i][j] = 1
                        continue
                    }
                    if(i == 0){
                        arr[i][j] = arr[i][j-1] +1
                    }else{
                        arr[i][j]=  arr[i-1][j] + arr[i][j-1]
                    }
                }
            }
            return arr
        }
    }

}
