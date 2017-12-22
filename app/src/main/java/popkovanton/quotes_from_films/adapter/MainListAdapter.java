package popkovanton.quotes_from_films.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import popkovanton.quotes_from_films.R;
import popkovanton.quotes_from_films.data.ModelItemQuotes;

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.ViewHolder> {

    private final int TYPE_ITEM_LEFT = 0;
    private final int TYPE_ITEM_RIGHT = 1;

    private ArrayList<ModelItemQuotes> mDataset;

    public MainListAdapter(ArrayList<ModelItemQuotes> mDataset) {
        this.mDataset = mDataset;
    }


    // Создает новые views (вызывается layout manager-ом)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item_left, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        // Получаем тип айтема в данной позиции для заполнения его данными
        int type = getItemViewType(position);

        switch (type) {
            case TYPE_ITEM_LEFT:
                holder.mTextViewLeft.setText(mDataset.get(position).getQuote());
                break;
            case TYPE_ITEM_RIGHT:
                holder.mTextViewRight.setText(mDataset.get(position).getQuote());
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (mDataset.get(position).getCreatedBy() == 0) {
            return TYPE_ITEM_LEFT;
        } else return TYPE_ITEM_RIGHT;
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    // класс view holder-а с помощью которого мы получаем ссылку на каждый элемент
    // отдельного пункта списка
    public static class ViewHolder extends RecyclerView.ViewHolder {
        //View itemView;
        TextView mTextViewLeft;
        TextView mTextViewRight;

        public ViewHolder(View v) {
            super(v);
            //this.itemView = itemView;
            this.mTextViewLeft = (TextView) itemView.findViewById(R.id.tv_recycler_item_left);
            this.mTextViewRight = (TextView) itemView.findViewById(R.id.tv_recycler_item_right);
        }
    }
}
