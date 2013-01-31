import Direction._

class Rowbit(pX: Int, pY: Int, pDirection: Direction, pColorIndex: Int) {

	val x = pX
	val y = pY
	val dir = pDirection
	val colorIndex = pColorIndex

	def this(pDirection: Direction) = this(0, 0, pDirection, 0) // default starting position and color index

	override def toString = "x: " + x + " y: " + y + " dir: " + dir.toString + " color: " + colorIndex;
}