fun main() {
	readLine()
  	val a = readLine()!!
  
  	var c = 0
  	while(true) {
    	if(a[c] == '1')
      		break
      	c++
    }
  
  	print(if(c%2 == 0) "Takahashi" else "Aoki")
}