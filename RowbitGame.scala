import Direction._

object Commands extends Enumeration {
	type Commands = Value
	val fwd, right, left = Value
}

def execute(orig: Rowbit, fs: List[(Rowbit) => Rowbit]) : Rowbit = {
	println(orig.toString)
	if (fs.length == 0) return orig;
	execute(fs.head(orig), fs.drop(1))
}

def fwd(orig: Rowbit) : Rowbit = {
	orig.dir match {
		case North => new Rowbit(orig.x, orig.y+1, orig.dir, orig.colorIndex)
		case East => new Rowbit(orig.x+1, orig.y, orig.dir, orig.colorIndex)
		case South => new Rowbit(orig.x, orig.y-1, orig.dir, orig.colorIndex)
		case West => new Rowbit(orig.x-1, orig.y, orig.dir, orig.colorIndex)
	}
}

def right(orig: Rowbit) : Rowbit = {
	orig.dir match {
		case North => new Rowbit(orig.x, orig.y, East, orig.colorIndex)
		case East => new Rowbit(orig.x, orig.y, South, orig.colorIndex)
		case South => new Rowbit(orig.x, orig.y, West, orig.colorIndex)
		case West => new Rowbit(orig.x, orig.y, North, orig.colorIndex)
	}
}

def left(orig: Rowbit) : Rowbit = {
	orig.dir match {
		case North => new Rowbit(orig.x, orig.y, West, orig.colorIndex)
		case East => new Rowbit(orig.x, orig.y, North, orig.colorIndex)
		case South => new Rowbit(orig.x, orig.y, East, orig.colorIndex)
		case West => new Rowbit(orig.x, orig.y, South, orig.colorIndex)
	}
}
