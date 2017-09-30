package scala

import org.scalatest.FunSuite

class MainTest extends FunSuite {
	test("Meaning to life") {
		val answerToLife = 6 * 7
		assert(answerToLife == 42)
	}
}

