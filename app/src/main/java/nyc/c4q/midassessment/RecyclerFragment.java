package nyc.c4q.midassessment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MarckemX on 12/6/17.
 */

public class RecyclerFragment extends Fragment {

    RecyclerView recycler;
    ArrayList<Integer> numberList;
    String bundleKey = "selected";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.the_fragments_layout,container,false);

        numberList = new ArrayList<>();
        recycler = view.findViewById(R.id.my_recycler);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());

        recycler.setLayoutManager(manager);
        numbersForRecycler();

        MyAdapter adapter = new MyAdapter(numberList);
        recycler.setAdapter(adapter);

        return view;
    }

    private void numbersForRecycler(){
        for(int i = 0; i < 11; i++){
            numberList.add(i);
        }
    }

    public void takeToMultiply(View view){
        Bundle bundle = new Bundle();


        bundle.putString(bundleKey,((TextView) view).getText().toString());
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.frag_holder, new RecyclerFragment());
        transaction.commit();
    }
}
