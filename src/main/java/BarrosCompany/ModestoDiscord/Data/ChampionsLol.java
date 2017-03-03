package BarrosCompany.ModestoDiscord.Data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChampionsLol {

	@SerializedName("Champions")
	@Expose
	private List<Champion> champions = null;

	public List<Champion> getChampions() {
		return champions;
	}

	public void setChampions(List<Champion> champions) {
		this.champions = champions;
	}

}