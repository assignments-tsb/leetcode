package core

import org.scalatestplus.play.PlaySpec

class Solution0001TwoSumSpec extends PlaySpec {

  "Solution" must {
    "return the indexes of two numbers whose sum is the target (Example 1)" in {

      val nums = Array(2,7,11,15)
      val target = 9
      val expectedResult = Array(0,1)

      val result = Solution0001TwoSum.twoSum(nums, target)

      result mustBe expectedResult
    }

    "return the indexes of two numbers whose sum is the target (Example 2)" in {

      val nums = Array(3,2,4)
      val target = 6
      val expectedResult = Array(1, 2)

      val result = Solution0001TwoSum.twoSum(nums, target)

      result mustBe expectedResult
    }

    "return the indexes of two numbers whose sum is the target (Example 3)" in {

      val nums = Array(3, 3)
      val target = 6
      val expectedResult = Array(0, 1)

      val result = Solution0001TwoSum.twoSum(nums, target)

      result mustBe expectedResult
    }


  }

}
