package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
		if (c == 0) 1 else if (r == 0) 0 else pascal(c-1,r-1) + pascal(c,r-1)
  pascal(2,3)
  
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
		if (chars.isEmpty) true
		if (chars.head ==')') false
		def counter(c: List[Char],acc: Int): Int =
			if (c isEmpty) acc
			else if (c.head == '(') counter(c.tail,acc+1)
			else if (c.head == ')' && acc <= 0) -1/*Unopened closed bracket*/
			else if (c.head == ')') counter(c.tail,acc-1)
			else counter (c.tail,acc)
  	counter(chars,0) == 0
  }                                               //: (chars: List[Char])Boolean
  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
  	if (money == 0) 1
  	if (money < 0) 0
  	if (coins isEmpty) 0
  	else/*This is all in the book prescribed*/
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
}
