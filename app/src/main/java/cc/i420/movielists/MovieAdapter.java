package cc.i420.movielists;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class MovieAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<Movie> movies;

    public MovieAdapter(Context context, ArrayList<Movie> movie){
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.movies = movie;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return movies.indexOf(getItem(position));
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Movie movie = (Movie) getItem(i);

        @SuppressLint({"ViewHolder", "InflateParams"}) View v = inflater.inflate(R.layout.item_view, null);
        ImageView pic2 = v.findViewById(R.id.iVpicture);
        pic2.setImageResource(movie.pic);
        TextView name = v.findViewById(R.id.tVmovie);
        name.setText(movie.name);
        TextView date = v.findViewById(R.id.tVdate);
        date.setText(movie.date);
        TextView intro = v.findViewById(R.id.tVintro);
        intro.setText(movie.intro);
        return v;
    }
}