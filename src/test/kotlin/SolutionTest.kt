import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class SolutionTest(private val input: Array<Int>, private val expected: Int) {
    private val soln = Solution1()

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun params() = arrayOf(
            arrayOf(arrayOf(3,6,9,1), 3),
            arrayOf(arrayOf(10), 0)
        )
    }

    @Test
    fun test() {
        assertEquals(expected, soln.maximumGap(input))
    }
}