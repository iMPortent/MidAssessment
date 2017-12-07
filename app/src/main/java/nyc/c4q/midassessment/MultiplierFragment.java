package nyc.c4q.midassessment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by MarckemX on 12/6/17.
 */

public class MultiplierFragment extends Fragment {

    TextView multipliedNumber;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.multiplier_layout,container,false);
        Bundle bundle = this.getArguments();
        multipliedNumber = view.findViewById(R.id.multiplied_number);
        multipliedNumber.setText(bundle.toString());
        alterNumber();
        return view;
    }

    public void alterNumber(){
        String numberStr = multipliedNumber.getText().toString();
        multipliedNumber.setText(String.valueOf(Integer.parseInt(numberStr)*10));

    }

}
