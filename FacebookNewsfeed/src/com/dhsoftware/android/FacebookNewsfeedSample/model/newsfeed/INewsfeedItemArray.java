package com.dhsoftware.android.FacebookNewsfeedSample.model.newsfeed;

import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;

public interface INewsfeedItemArray extends GraphObject {

	GraphObjectList<INewsfeedItem> getData();
	
}
