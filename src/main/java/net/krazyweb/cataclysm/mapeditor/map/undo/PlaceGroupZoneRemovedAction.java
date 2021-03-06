package net.krazyweb.cataclysm.mapeditor.map.undo;

import net.krazyweb.cataclysm.mapeditor.map.MapEditor;
import net.krazyweb.cataclysm.mapeditor.map.data.PlaceGroupZone;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlaceGroupZoneRemovedAction implements Action {

	private static Logger log = LogManager.getLogger(PlaceGroupZoneRemovedAction.class);

	private MapEditor map;
	private int index;
	private PlaceGroupZone zone;

	public PlaceGroupZoneRemovedAction(final MapEditor map, final int index, final PlaceGroupZone zone) {
		this.map = map;
		this.index = index;
		this.zone = zone;
	}

	@Override
	public void execute() {
		log.debug("Redoing removal of PlaceGroupZone '" + zone + "' on map '" + map + "'.");
		map.removePlaceGroupZone(zone);
	}

	@Override
	public void undo() {
		log.debug("Undoing removal of PlaceGroupZone '" + zone + "' on map '" + map + "' at index '" + index + "'.");
		map.addPlaceGroupZone(index, zone);
	}

}
