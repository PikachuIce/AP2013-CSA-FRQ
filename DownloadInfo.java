
public class DownloadInfo {
	private String title;
	private int downvotes;
	public DownloadInfo(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void incrementTimesDownloaded() {
		downvotes++;
	}
}
