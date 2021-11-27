fun main() {
	var (s, t, x) = readLine()!!.split(" ").map{ it.toInt() }
  	if(t == 0)
  		t = 24
  	if(s > t) {
    	if(x in s until 24 || x in 0 until t) {
        	print("Yes")
        } else {
        	print("No")
        }
    } else if(x in s until t) {
    	print("Yes")
    } else {
    	print("No")
    }
}