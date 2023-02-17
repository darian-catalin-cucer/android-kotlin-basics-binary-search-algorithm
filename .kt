fun binarySearch(arr: IntArray, x: Int): Int {
    var low = 0
    var high = arr.size - 1
    while (low <= high) {
        val mid = (low + high) / 2
        when {
            arr[mid] < x -> low = mid + 1
            arr[mid] > x -> high = mid - 1
            else -> return mid
        }
    }
    return -1
}

fun main() {
    val arr = intArrayOf(1, 3, 5, 7, 9)
    val x = 5
    val result = binarySearch(arr, x)
    if (result == -1) {
        println("Element not present")
    } else {
        println("Element found at index $result")
    }
}
