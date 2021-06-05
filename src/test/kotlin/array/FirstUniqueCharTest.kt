package array

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class FirstUniqueCharTest : StringSpec({
    "firstUniqueChar" {
        forAll(
            row("leetcode", 0),
            row("loveleetcode", 2),
            row("aabb", -1),
        ) { s, result ->
            FirstUniqueChar.firstUniqueChar(s) shouldBe result
        }
    }
})