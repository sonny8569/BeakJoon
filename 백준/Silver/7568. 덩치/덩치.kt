class CodingTest {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val br = System.`in`.bufferedReader()
            val length = br.readLine().toInt()
            val points = mutableListOf<Pair<Int, Int>>()
            repeat(length) {
                val input = br.readLine().split(" ").map { data -> data.toInt() }
                points.add(Pair(input[0], input[1]))
            }
            for(i in points.indices){
                var ranks = 1
                for(j in points.indices){
                    if(i == j) continue
                    if(points[j].first > points[i].first && points[j].second > points[i].second) {
                        ranks ++
                    }
                }
                println(ranks)
            }
        }
    }
}