package Oops;

public class intrfce {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();

}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("ups,down,left,right,diagonal(in all dirns)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("ups,down,left,right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("ups,down,left,right,diagonal(by 1 step)");
    }
}
