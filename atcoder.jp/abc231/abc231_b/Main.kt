fun main() {
	val n = readLine()!!.toInt()
  	val s = Array(n) { readLine()!! }
  	
  	val list = mutableMapOf<String, Int>()
  	s.forEach {
    	list.putIfAbsent(it, 0)
      	list[it] = list[it]!! + 1
    }
  	print(list.toList().sortedBy{ it.second }.toMap().keys.last())
}