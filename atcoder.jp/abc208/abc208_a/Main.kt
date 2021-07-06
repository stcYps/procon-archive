fun main() {
	val inputNum: List<Int> = readLine()!!.split(" ").map { it.toInt() }
	
	val result = if(inputNum[0] <= inputNum[1] && inputNum[1] <= 6 * inputNum[0]) {
    	"Yes"
    }
	else {
    	"No"
    }
	
	println(result)
}