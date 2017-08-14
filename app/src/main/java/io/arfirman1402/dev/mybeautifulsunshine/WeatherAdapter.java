package io.arfirman1402.dev.mybeautifulsunshine;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by alodokter-it on 14/08/17 -- WeatherAdapter.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_weather, parent, false);
        return new WeatherViewHolder(contentView);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder {

        public WeatherViewHolder(View itemView) {
            super(itemView);
        }
    }
}
