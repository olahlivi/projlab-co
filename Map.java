package shokoban;

import java.util.ArrayList;

public class Map {
	ArrayList<TileElement> tiles=new ArrayList<>();
	
	public void AddTileElement(TileElement t)
	{
		System.out.print(">");
        System.out.print("  ");
        System.out.println("[:Map].AddTileElement(t):");

        //fgv t�rzs
        
        //bemegy�nk a fgv-be
        System.out.print("<");
        System.out.print("  ");
        System.out.println("[:Map].AddTileElement(t):");
	}
	public void PlaceWorker(Worker w) 
	{
		  //bemegy�nk a fgv-be
        System.out.print(">");
        System.out.print("  ");
        System.out.println("[:Map].PlaceWorker(w):");

        //fgv t�rzs
        
        //bemegy�nk a fgv-be
        System.out.print("<");
        System.out.print("  ");
        System.out.println("[:Map].PlaceWorker(c):");
	}
	public void PlaceCrate(Crate c) 
	{
		  //bemegy�nk a fgv-be
        System.out.print(">");
        System.out.print("  ");
        System.out.println("[:Map].PlaceCrate(c):");

        //fgv t�rzs
        
        //bemegy�nk a fgv-be
        System.out.print("<");
        System.out.print("  ");
        System.out.println("[:Map].PlaceCrate(c):");
	}
	public void CreateMap() 
	{
		  //bemegy�nk a fgv-be
        System.out.print(">");
        System.out.print("  ");
        System.out.println("[:Map].CreateMap():");

        //fgv t�rzs
        
        //bemegy�nk a fgv-be
        System.out.print("<");
        System.out.print("  ");
        System.out.println("[:Map].CreateMap():");
	}
	
	public ArrayList<TileElement> getTiles() {
		return tiles;
	}
	public void setTiles(ArrayList<TileElement> tiles) {
		this.tiles = tiles;
	}
}

