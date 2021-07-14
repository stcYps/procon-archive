fun main() {
	val (n, x) = readLine()!!.split(" ").map{it.toInt()}
  	val list = readLine()!!.split(" ").map{it.toInt()}
  
  	print(if(list.sum() - n / 2 <= x) "Yes" else "No")
}