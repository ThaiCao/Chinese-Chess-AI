package com.linhaibin.chessTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.linhaibin.chess.BishopPiece;
import com.linhaibin.chess.KingPiece;
import com.linhaibin.chess.State;
import com.linhaibin.chess.UserMove;

public class KingMoveTest {

	private State state;
	private KingPiece kingPiece;
	@Before
	public void setUp() throws Exception {
		state = new State();
		kingPiece = new KingPiece(16);
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void testGenerateAllSimple() {
		int fromX = 4;
		int fromY = 9;
		List<State> newStateList = kingPiece.generateAllMove(state, fromX, fromY);
		assertEquals(newStateList.size(), 1);
	}

	@Test
	public void testGenerateNumberAllMid() {
		int fromX = 4;
		int fromY = 9;
		int toX = 4;
		int toY = 8;
		
		State midState = UserMove.movePiece(state, fromX, fromY, toX, toY);
		List<State> newStateList = kingPiece.generateAllMove(midState, toX, toY);
		assertEquals(newStateList.size(), 4);
	}
	
}