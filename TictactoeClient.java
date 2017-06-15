package com.pls.util;

import java.util.List;

import com.pls.bean.Player;
import com.pls.bean.moves;
import com.pls.impl.TictactoeSysImpl;
import com.pls.impl.TictactoeSystem;

public class Client {
	public static void main(String[] args) {
		TictactoeSystem tc = new TictactoeSysImpl();
		char arr[][] = tc.createEmptyBoard();
		List<moves> list = tc.createList("moves.txt");
		for(moves m : list){
			System.out.println(m);
		}
		System.out.println("size of moves = "+list.size());
		System.out.println("\n");
		Player p = tc.PopulateBoardAndDeclareResult(list, arr);

		for(int i = 0 ; i<arr.length ; i++){
			for(int j = 0; j<arr.length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("array length is = "+arr.length);
		System.out.println("winner is "+p);
		System.out.println("----------------");
		String s = "ab" + "12";
		 String t = "ab" + 12;
		 String u = new String("ab12");
		 System.out.println((s==t) + " " + (s==u));
		 System.out.println("-----------------");
		 StringBuffer sb = new StringBuffer("have a nice day");
		 sb.setLength(6);
		 System.out.println(sb);

		 }

}
