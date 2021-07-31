fun main() {
	val (a, b) = readLine()!!.split(" ").map{it.toInt()}
  	when {
    	a == 0 && 0 < b -> print("Silver")
      	b == 0 && 0 < a -> print("Gold")
      	else -> print("Alloy")
    }
}