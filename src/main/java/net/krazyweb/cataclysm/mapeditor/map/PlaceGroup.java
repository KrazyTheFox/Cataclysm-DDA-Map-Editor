package net.krazyweb.cataclysm.mapeditor.map;

public class PlaceGroup {

	public String type;
	public String group;
	public int chance;

	public PlaceGroup() {

	}

	public PlaceGroup(final PlaceGroup placeGroup) {
		this.type = placeGroup.type;
		this.group = placeGroup.group;
		this.chance = placeGroup.chance;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		PlaceGroup that = (PlaceGroup) o;

		if (chance != that.chance) return false;
		if (group != null ? !group.equals(that.group) : that.group != null) return false;
		if (type != null ? !type.equals(that.type) : that.type != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = type != null ? type.hashCode() : 0;
		result = 31 * result + (group != null ? group.hashCode() : 0);
		result = 31 * result + chance;
		return result;
	}

}
