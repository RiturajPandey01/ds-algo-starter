package array

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class ValidAnagramTest : StringSpec({
    "isAnagram" {
        forAll(
            row("anagram", "nagaram", true),
            row("rat", "car", false)
        ) { s, t, result ->
            ValidAnagram.isAnagram(s, t) shouldBe result
        }
    }
})