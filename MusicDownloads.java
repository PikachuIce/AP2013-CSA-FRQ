import java.util.*;

public class MusicDownloads {
	private List<DownloadInfo> downloadList;
	public MusicDownloads() {
		downloadList = new ArrayList<DownloadInfo>();
	}
	public DownloadInfo getDownloadInfo(String title) {
		for(int i = 0; i < downloadList.size(); i++) {
			String temp = downloadList.get(i).getTitle();
			if(temp.equals(title)){
				return downloadList.get(i);
			}
		}
		return null;
	} 
	public void updateDownloads(List<String> titles) {
		for(int i = 0; i < titles.size(); i++) {
			String temp = titles.get(i);
			if(StringCheck(downloadList, temp)){
				downloadList.get(i).incrementTimesDownloaded();
			}else {
				downloadList.add(new DownloadInfo(temp));
				downloadList.get(i).incrementTimesDownloaded();
			}
		}
		
	}
	public boolean StringCheck(List<DownloadInfo> downloadList, String target) {
		for(int i = 0; i < downloadList.size(); i++) {
			String temp = downloadList.get(i).getTitle();
			if(target.equals(temp)) {
				return true;
			}
		}
		return false;
	}
}
