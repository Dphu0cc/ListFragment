package com.phuoc.listfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

public class FragmentDanhSach extends ListFragment {
    String[] arrayCity = {"Hai Phong", "Đà Nẵng", "Hà Nội", "Cần Tho", "Quảng Bình"};
    ArrayAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, arrayCity);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_danh_sach, container, false);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        Toast.makeText(getActivity(), arrayCity[position], Toast.LENGTH_SHORT).show();
        super.onListItemClick(l, v, position, id);
    }
}
