package nyc.c4q.midassessment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by MarckemX on 12/6/17.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView numberView;

    public MyViewHolder(View itemView) {
        super(itemView);
        numberView = itemView.findViewById(R.id.number_item);
    }

    public void onBind(int num){
            numberView.setText(String.valueOf(num));
    }
}

