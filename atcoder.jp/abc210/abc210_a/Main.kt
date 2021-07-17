fun main() {
	val (n, a, x, y) = readLine()!!.split(" ").map{it.toInt()}
	
  	var r = 0
  	for(i in 1..n) {
    	if(i <= a)
      		r += x
      	else
      		r += y
    }
  
  	print(r)
}