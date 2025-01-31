package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        Cell exp = Cell.findBy(2, 0);
        BishopBlack bishopBlack = new BishopBlack(exp);
        Cell actual = bishopBlack.position();
        assertEquals(exp, actual);
    }

    @Test
    public void testWay() {
        Cell[] exp = new Cell[]{
                Cell.findBy(1, 1),
                Cell.findBy(2, 2),
                Cell.findBy(3, 3),
        };
        BishopBlack bishopBlack = new BishopBlack(Cell.findBy(0, 0));
        Cell[] actual = bishopBlack.way(Cell.findBy(3, 3));
        List<Cell> e = Arrays.asList(exp);
        List<Cell> a = Arrays.asList(actual);
        assertEquals(e, a);
    }

    @Test
    public void testIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.findBy(0, 0));
        boolean actual = bishopBlack.isDiagonal(Cell.findBy(0, 0), Cell.findBy(2, 2));
        assertTrue(actual);
    }

    @Test
    public void testIsNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.findBy(0, 0));
        boolean actual = bishopBlack.isDiagonal(Cell.findBy(0, 0), Cell.findBy(2, 3));
        assertFalse(actual);
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.findBy(0, 0));
        Cell pos = Cell.findBy(1, 0);
        Figure figure = bishopBlack.copy(pos);
        assertTrue(figure.getClass() == bishopBlack.getClass() && figure.position() == pos);
    }
}