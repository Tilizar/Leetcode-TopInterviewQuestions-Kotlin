import utils.TreeNode

fun sortedArrayToBST(nums: IntArray): TreeNode? {

    fun populate(leftIndex: Int, rightIndex: Int): TreeNode? {
        if (leftIndex > rightIndex) return null
        val midIndex = leftIndex + ((rightIndex - leftIndex) / 2)
        return TreeNode(nums[midIndex]).apply {
            left = populate(leftIndex, midIndex - 1)
            right = populate(midIndex + 1, rightIndex)
        }
    }

    return populate(0, nums.lastIndex)
}
