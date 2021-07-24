fun main() {
	val n = List(4) {readLine()!!}
  	val l = mutableListOf<String>("H", "2B", "3B", "HR")

  	n.forEach {
    	l.remove(it)
    }
  
  	print(if(l.isEmpty()) "Yes" else "No")
}