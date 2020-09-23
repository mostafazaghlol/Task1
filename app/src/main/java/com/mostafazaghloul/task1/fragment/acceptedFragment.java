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
 * Use the {@link acceptedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class acceptedFragment extends Fragment {
    order[] orders;
    arrayadapter mArrayadapter;
    public acceptedFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static acceptedFragment newInstance(String param1, String param2) {
        acceptedFragment fragment = new acceptedFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        orders = new order[]{
                new order(R.drawable.type_car, getString(R.string.fackmessage), getString(R.string.fackTime), getString(R.string.fackPeople), getString(R.string.fackhelp), getString(R.string.facknum), true),
        };
        mArrayadapter = new arrayadapter(getContext(),R.layout.item,orders);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_accepted, container, false);
        ListView listView = (ListView)v.findViewById(R.id.list_accepted);
        listView.setAdapter(mArrayadapter);
        return v;
    }
}