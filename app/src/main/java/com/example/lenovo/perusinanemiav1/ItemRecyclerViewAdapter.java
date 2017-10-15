package com.example.lenovo.perusinanemiav1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ItemRecyclerViewAdapter extends RecyclerView.Adapter<ItemRecyclerViewAdapter.ViewHolder> {

    private final DummyModel[] dummyModels;
    private final ItemFragment.OnListFragmentInteractionListener interactionListener;

    public ItemRecyclerViewAdapter(DummyModel[] items, ItemFragment.OnListFragmentInteractionListener listener) {
        dummyModels = items;
        interactionListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        DummyModel dm = dummyModels[position];
        holder.dummyModelItem = dm;
        holder.idView.setText(dm.getId());
        holder.titleView.setText(dm.getTitle());
        holder.detailView.setText(dm.getDetail());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != interactionListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    interactionListener.onListFragmentInteraction(holder.dummyModelItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return dummyModels.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView idView;
        public final TextView titleView;
        public final TextView detailView;
        public DummyModel dummyModelItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            idView = (TextView) view.findViewById(R.id.id);
            titleView = (TextView) view.findViewById(R.id.title);
            detailView = (TextView) view.findViewById(R.id.detail);
        }
    }
}
