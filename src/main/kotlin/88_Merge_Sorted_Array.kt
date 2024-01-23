fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var outputCursor = m + n - 1
    var nums1Cursor = m - 1
    var nums2Cursor = n - 1

    while (nums1Cursor >= 0 || nums2Cursor >= 0) {
        val left = if (nums1Cursor < 0) Int.MIN_VALUE else nums1[nums1Cursor]
        val right = if (nums2Cursor < 0) Int.MIN_VALUE else nums2[nums2Cursor]

        nums1[outputCursor] = if (left > right) {
            nums1Cursor--
            left
        } else {
            nums2Cursor--
            right
        }

        outputCursor--
    }
}
