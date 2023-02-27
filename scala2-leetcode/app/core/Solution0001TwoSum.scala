package core

object Solution0001TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val asMap: Map[Int, Int] = nums.zipWithIndex.toMap

    asMap.find { case(value, index) => asMap.contains(target-value) && target-value!=index }
      .map { case(value, index) => Array(index, asMap.get(target-value).get) }
      .getOrElse(Array.empty)
  }
}
