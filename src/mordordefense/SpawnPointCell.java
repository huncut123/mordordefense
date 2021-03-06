package mordordefense;

import mordordefense.testing.Logging;

public class SpawnPointCell extends RouteCell {
	
	public SpawnPointCell(int x, int y){
		super(x,y);
		Logging.log(">> SpawnPointCell konstruktor hívása, x: "+x+" y: "+y);
	}
	
	public SpawnPointCell() {
		Logging.log(">> SpawnPointCell default konstruktor hívás");
	}

	@Override
	public String getType() {
		return "SpawnPointCell";
	}
	
}
