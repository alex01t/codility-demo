class Counters(n: Int) {
  val cs = Array.fill(n)(0)
  var m = 0
  var maxvalue = 0

  def incr(x: Int) = {
    if (cs(x - 1) < maxvalue) cs(x - 1) = maxvalue
    cs(x - 1) += 1
    if (m < cs(x - 1)) m = cs(x - 1)
  }

  def maxcs() = maxvalue = m

  def get(): Array[Int] = {
    var i = 0
    while (i < cs.length) {
      if (cs(i) < maxvalue) cs(i) = maxvalue
      i += 1
    }
    cs
  }
}

def solution(n: Int, a: Array[Int]): Array[Int] = {
  val cs = new Counters(n)
  var i = 0
  while (i < a.length) {
    if (a(i) == n + 1)
      cs.maxcs()
    else
      cs.incr(a(i))
    i += 1
  }
  cs.get()
}

solution(5, Array(3, 4, 4, 6, 1, 4, 4)).toList

