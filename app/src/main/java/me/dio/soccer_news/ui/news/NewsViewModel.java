package me.dio.soccer_news.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccer_news.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> mNews;

    public NewsViewModel() {
        mNews = new MutableLiveData<>();

        // TODO remove news mock
        List<News> news = new ArrayList<News>();
        news.add(new News("Title 1", "Description 1"));
        news.add(new News("Title 2", "Description 2"));
        news.add(new News("Title 3", "Description 3"));

        mNews.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return mNews;
    }
}