package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */

    public static void main(String[] args) throws MalformedURLException, IOException {
        String sURL = "http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources";
        News article = null;
        List<News> articleList = new ArrayList<>();
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();
        JsonArray jsonArray = null;
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        if (root instanceof JsonObject) {
            JsonObject rootObj = root.getAsJsonObject();
        } else if (root instanceof JsonArray) {
            jsonArray = root.getAsJsonArray();
        }
        for (int i = 0; i < jsonArray.size() - 1; i++) {
            try {
                JsonObject jsonobject = jsonArray.get(i).getAsJsonObject();
                jsonobject = jsonobject.getAsJsonObject("data");
                JsonArray jsonarray = jsonobject.getAsJsonArray("Employee Name");
                jsonobject = jsonarray.get(0).getAsJsonObject();
                //you code start here
                String source = jsonobject.get("source").toString();
                String author = jsonobject.get("author").toString();
                String title = jsonobject.get("title").toString();
                String description = jsonobject.get("description").toString();
                String urlLink = jsonobject.get("urlLink").toString();
                String urlToImage = jsonobject.get("urlToImage").toString();
                String publishedAt = jsonobject.get("publishedAt").toString();
                String content = jsonobject.get("content").toString();
                System.out.println(source + " " + author + " " + title + " " + description + " " + url + " " + urlToImage + " "
                        + publishedAt + " " + content);

            } catch (Exception ex) {

            }
        }
        for (News entry : articleList) {
            System.out.println(entry.getSource() + " " + entry.getAuthor() + " " + entry.getTitle() + " " + entry.getDescription() + " " +
                            entry.getUrlLink() + " " + entry.getUrlToImage() + " " + entry.getPublishedAt() + " " + entry.getContent());
        }
    }
}
