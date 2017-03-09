


  def solution(a: Array[Int]): Int = {
    var i = 0
    var onesRemained = a.sum
    var total = 0
    while (i < a.length) {
      if (a(i) == 1) onesRemained -= 1
      else total += onesRemained

      if (total > 1000000000) return -1
      i += 1
    }
    total
  }

val a = Array(0,1,0,1,1)
solution(a)

assert(solution(Array(0,0,0,0,0)) == 0)
assert(solution(Array(1,0,0,0,0)) == 0)
assert(solution(Array(1,1,1,0,1)) == 1)
assert(solution(Array(0,1,1,1,1)) == 4)
assert(solution(Array(0,0,1,1,1)) == 6)
assert(solution(Array(0,1,1,0,1)) == 4)

