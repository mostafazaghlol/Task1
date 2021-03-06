package com.mostafazaghloul.task1.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mostafazaghloul.task1.R;
import com.mostafazaghloul.task1.adpapter.arrayadapter;
import com.mostafazaghloul.task1.model.order;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link cancelledFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class cancelledFragment extends Fragment {
    order[] orders;
    arrayadapter mArrayadapter;
    public cancelledFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment cancelledFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static cancelledFragment newInstance(String param1, String param2) {
        cancelledFragment fragment = new cancelledFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
        orders = new order[]{
                new order(R.drawable.type_food, getString(R.string.fackmessage), getString(R.string.fackTime), getString(R.string.fackPeople), getString(R.string.fackhelp), getString(R.string.facknum), true),
        };
        mArrayadapter = new arrayadapter(getContext(),R.layout.item,orders);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_cancelled, container, false);
        ListView listView = (ListView)v.findViewById(R.id.list_cancel);
        listView.setAdapter(mArrayadapter);
        return v;
    }
}