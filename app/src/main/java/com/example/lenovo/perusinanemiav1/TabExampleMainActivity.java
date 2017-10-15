package com.example.lenovo.perusinanemiav1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TabExampleMainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_example_activity_main);

        // define TabLayout

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.title_tab0));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.title_tab1));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.title_tab2));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // define ViewPager
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);

        // fake list model... for test
        DummyModel[] listModel0 = createDummyListModel("Dia 1");
        DummyModel[] listModel1 = createDummyListModel("Dia 2");
        DummyModel[] listModel2 = createDummyListModel("Dia 3");


        //  ViewPager need a PagerAdapter
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount(), listModel0, listModel1, listModel2 );

        viewPager.setAdapter(adapter);

        // Listeners
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(getOnTabSelectedListener(viewPager));

    }

    /**
     * Listener for tab selected
     * @param viewPager
     * @return
     */
    @NonNull
    private TabLayout.OnTabSelectedListener getOnTabSelectedListener(final ViewPager viewPager) {
        return new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                Toast.makeText(TabExampleMainActivity.this, "Tab selected " +  tab.getPosition(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // nothing now
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // nothing now
            }
        };
    }


    /**
     * Listener that comunicate fragment / recycler with this activity
     * @param model
     */
    @Override
    public void onListFragmentInteraction(DummyModel model) {
        // the user clicked on this item over the list
        Toast.makeText(TabExampleMainActivity.this, DummyModel.class.getSimpleName() + ":" + model.getId() + " - "  +model.getTitle(), Toast.LENGTH_LONG).show();
    }


    // model for test purpose
    private DummyModel[] createDummyListModel(String msj) {
        List<DummyModel> l = new ArrayList<>();
        for(int i = 0; i < 10; i++  ) {
            l.add(new DummyModel(String.valueOf(i), "Desayuno" +i , "Cantidad de Nutrientes : " +i));
            l.add(new DummyModel(String.valueOf(i), "Almuerzo " +i , "Cantidad de Nutrientes : " +i));
            l.add(new DummyModel(String.valueOf(i), "Cena " +i , "Cantidad de Nutrientes : " +i));
            l.add(new DummyModel(String.valueOf(i), "Desayuno" +i , "Cantidad de Nutrientes : " +i));
            l.add(new DummyModel(String.valueOf(i), "Almuerzo " +i , "Cantidad de Nutrientes : " +i));
            l.add(new DummyModel(String.valueOf(i), "Cena " +i , "Cantidad de Nutrientes : " +i));



        }
        return l.toArray(new DummyModel[l.size()]);
    }

}
