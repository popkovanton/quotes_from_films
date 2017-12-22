package popkovanton.quotes_from_films;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import popkovanton.quotes_from_films.adapter.MainListAdapter;
import popkovanton.quotes_from_films.data.ModelItemQuotes;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ModelItemQuotes> myDataset = getDataSet();

        mRecyclerView = (RecyclerView) findViewById(R.id.rvMainList);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MainListAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList getDataSet() {

        ArrayList<ModelItemQuotes> mDataSet = new ArrayList<>();

        mDataSet.add(new ModelItemQuotes(true, 1, "Первая цитата", 0));
        mDataSet.add(new ModelItemQuotes(true, 2, "Вторая цитата", 1));
        mDataSet.add(new ModelItemQuotes(true, 3, "Третья цитата", 0));
        mDataSet.add(new ModelItemQuotes(true, 4, "Четвертая цитата", 1));

        return mDataSet;
    }
}
