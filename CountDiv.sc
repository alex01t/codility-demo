def solution(a: Int, b: Int, k: Int): Int = {
  val c = (b - a) / k
  if (a > 0 && a % k == 0)
    c + 1
  else
    c
}

assert(solution(11, 14, 130) == 0)
assert(solution(0, 0, 2) == 1)
assert(solution(0, 10, 5) == 2)
assert(solution(0, 50, 5) == 10)
assert(solution(4, 59, 5) == 11)
assert(solution(0, 42, 1) == 42)
assert(solution(0, 42, 2) == 21)
assert(solution(0, 2000000000, 2) == 1000000000)
assert(solution(11, 14, 130) == 0)
assert(solution(11, 131, 130) == 1)
assert(solution(11, 130, 130) == 1)
assert(solution(11, 14, 13) == 1)
assert(solution(11, 22, 17) == 1)
assert(solution(11, 345, 17) == 20)
