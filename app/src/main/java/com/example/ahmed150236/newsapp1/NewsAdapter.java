package com.example.ahmed150236.newsapp1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ahmed150236 on 22-Feb-18.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_items, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleView.setText(currentNews.getTitle());

        // Find the TextView with view ID information
        TextView informationView = (TextView) listItemView.findViewById(R.id.informations);
        informationView.setText(currentNews.getmInformation());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(currentNews.getDate());

        // Find the TextView with view ID authorName
        TextView authorNameView = (TextView) listItemView.findViewById(R.id.authorName);
        authorNameView.setText(currentNews.getAuthorName());

        return listItemView;

    }
}
