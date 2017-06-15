package com.pls.impl;

import java.util.Arrays;
import java.util.List;



import com.pls.bean.Player;
import com.pls.bean.moves;

public interface TictactoeSystem {
	
	public char[][] createEmptyBoard();
	public List<moves> createList (String movesfile);
	public Player PopulateBoardAndDeclareResult(List<moves> list , char arr[][]);
}
