package com.example.android.mymusicapp;
        import android.content.Context;
        import android.support.v4.content.ContextCompat;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.ArrayList;

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Song} objects.
 */
public class SongAdapter extends ArrayAdapter<Song>  {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;
    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs is the list of {@link Song}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public SongAdapter(Context context, ArrayList<Song> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID artist_text_view.
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the artist from the currentSong object and set this text on
        // the artist TextView.
        artistTextView.setText(currentSong.getArtist());

        // Find the TextView in the list_item.xml layout with the ID songtitle_text_view.
        TextView songtitleTextView = (TextView) listItemView.findViewById(R.id.songtitle_text_view);
        // Get the default value from the currentSong object and set this text on
        // the default TextView.
        songtitleTextView.setText(currentSong.getSongtitle());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

            // Display the provided image based on the resource ID
            imageView.setImageResource(currentSong.getImageResourceId());
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}