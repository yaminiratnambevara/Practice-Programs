package com.pls.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;



import java.util.Scanner;

import com.pls.bean.Player;
import com.pls.bean.moves;

public class TictactoeSysImpl implements TictactoeSystem {

	@Override
	public char [][] createEmptyBoard() {
		char arr[][]=new char[3][3];
		return arr;
		
	}

	@Override
	public List<moves> createList(String movesfile) {
		List<moves> list = new ArrayList<moves>();
		Scanner scan = null;
		try {
			scan = new Scanner(new File(movesfile));
			while(scan.hasNext()){
				String t[] = scan.nextLine().split(",");
				int row = Integer.parseInt(t[0].trim());
				int col = Integer.parseInt(t[1].trim());
				Player player = Player.valueOf(t[2].trim());
				list.add(new moves(row, col, player));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public Player PopulateBoardAndDeclareResult(List<moves> list, char[][] arr) {
		for(moves m : list){
			int i = m.getRow();
			int j = m.getCol();
			Player p = m.getPlayer();
			if(p.equals(Player.X)){
				arr[i][j] = 'X';
			}
			else if (p.equals(Player.O)){
				arr[i][j]='O';
			}
		}
		int diag1X =0,diag2X =0 ,row1X=0,row2X=0,row3X=0,col1X=0,col2X=0,col3X=0 ,diag1O =0,diag2O =0 ,row1O=0,row2O=0,row3O=0,col1O=0,col2O=0,col3O=0;
				
		for(int i = 0 ; i<arr.length ; i++){
			for(int j = 0; j<arr.length;j++){
				
				if(i== 0 & arr[i][j]=='X'){
					row1X++;
				}
				if(i== 1 & arr[i][j]=='X'){
					row2X++;
				}
				if(i== 2 & arr[i][j]=='X'){
					row3X++;
				}
				if(j== 0 & arr[i][j]=='X'){
					col1X++;
				}
				if(j== 1 & arr[i][j]=='X'){
					col2X++;
				}
				if(j== 2 & arr[i][j]=='X'){
					col3X++;
				}
				if(i==j && arr[i][j]=='X'){
					diag1X++;
				}
				if((i+j) == 2&& arr[i][j]=='X'){
					diag2X++;
				}
				if(i== 0 & arr[i][j]=='O'){
					row1O++;
				}
				if(i== 1 & arr[i][j]=='O'){
					row2O++;
				}
				if(i== 2 & arr[i][j]=='O'){
					row3O++;
				}
				if(j== 0 & arr[i][j]=='O'){
					col1O++;
				}
				if(j== 1 & arr[i][j]=='O'){
					col2O++;
				}
				if(j== 2 & arr[i][j]=='O'){
					col3O++;
				}
				if(i==j && arr[i][j]=='O'){
					diag1O++;
				}
				if((i+j) == 2&& arr[i][j]=='O'){
					diag2O++;
				}
				
				
			}
			
		}
		
				
		if(diag1X == 3||diag2X ==3||row1X==3||row2X==3||row3X==3||col1X==3||col2X==3||col3X==3 ){
			return Player.X;
		}
		else if(diag1O == 3||diag2O ==3||row1O==3||row2O==3||row3O==3||col1O==3||col2O==3||col3O==3 ){
			return Player.O;
		}
		else{
			System.out.println("its a draw");
			return null;
		}
		
	}

	

}
