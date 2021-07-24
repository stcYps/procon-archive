fun main() {
	readLine()!!
  	var a = readLine()!!.split(" ").map{it.toInt()}
  	var c = 0
  	while(
    	if(a.any{it%2==1})
      		false
      	else {
       		a = a.map{it/2}
          	true
        }
    ) {
    	c += 1
    }
  
  	print(c)
}