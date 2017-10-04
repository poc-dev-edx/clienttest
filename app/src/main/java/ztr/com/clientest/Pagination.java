package ztr.com.clientest;

import com.google.gson.annotations.SerializedName;


public class Pagination{

	@SerializedName("per_page")
	private int perPage;

	@SerializedName("current_page")
	private int currentPage;

	@SerializedName("total_entries")
	private int totalEntries;

	public void setPerPage(int perPage){
		this.perPage = perPage;
	}

	public int getPerPage(){
		return perPage;
	}

	public void setCurrentPage(int currentPage){
		this.currentPage = currentPage;
	}

	public int getCurrentPage(){
		return currentPage;
	}

	public void setTotalEntries(int totalEntries){
		this.totalEntries = totalEntries;
	}

	public int getTotalEntries(){
		return totalEntries;
	}

	@Override
 	public String toString(){
		return 
			"Pagination{" + 
			"per_page = '" + perPage + '\'' + 
			",current_page = '" + currentPage + '\'' + 
			",total_entries = '" + totalEntries + '\'' + 
			"}";
		}
}