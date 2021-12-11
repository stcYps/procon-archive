fun main() {
	val (n, q) = readLine()!!.split(" ").map{ it.toInt() }
  	var a = readLine()!!.split(" ").map{ it.toInt() }
  	val x = Array(q) { readLine()!!.toInt() }
  
  	a = a.sorted()
  	val result = mutableListOf<Int>()
  	x.forEach {
      	val h = it
    	val i = a.myBinarySearch{ it >= h }
      	if(i < 0) {
        	result.add(0)
        } else {
      		result.add(a.size - i)
        }
    }
  	result.forEach{ println(it) }
}

fun myBinarySearch(begin: Int, end: Int, isOk: (key: Int) -> Boolean): Int {
  var ng = begin
  var ok = end

  while (Math.abs(ok - ng) > 1) {
    val mid = (ok + ng) / 2
    if (isOk(mid)) {
      ok = mid
    } else {
      ng = mid
    }
  }

  return ok
}

fun <T> List<T>.myBinarySearch(isOk: (T) -> Boolean): Int {
  return myBinarySearch(-1, size) { index -> isOk(get(index)) }
}

fun <T> Array<T>.myBinarySearch(isOk: (T) -> Boolean): Int {
  return myBinarySearch(-1, size) { index -> isOk(get(index)) }
}