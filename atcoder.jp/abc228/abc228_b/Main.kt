fun main() {
	val(n, x) = readLine()!!.split(" ").map{ it.toInt() }
  	val a = readLine()!!.split(" ").map{ it.toInt() }

  	val result = BooleanArray(n)
  	var i = x - 1
  	var count = 0
  	while(true) {
    	if(!result[i]) {
        	result[i] = true
          	count++
          	i = a[i] - 1
        } else {
        	print(count)
          	break
        }
    }
}