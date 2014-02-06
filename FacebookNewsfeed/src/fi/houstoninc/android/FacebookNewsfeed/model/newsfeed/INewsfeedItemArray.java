package fi.houstoninc.android.FacebookNewsfeed.model.newsfeed;

import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;

public interface INewsfeedItemArray extends GraphObject {

	GraphObjectList<INewsfeedItem> getData();
	
}
