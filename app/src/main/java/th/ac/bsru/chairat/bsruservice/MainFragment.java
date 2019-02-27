package th.ac.bsru.chairat.bsruservice;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //  Register Controller
        registerController();

        //5page
        page1();
        page2();
        page3();
        page4();
        page5();
    } //main method

    private void registerController() {
        TextView textView = getView().findViewById(R.id.txtRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
       //    Replace Fragment
            getActivity()
                    .getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.layoutMainFragmant, new RegsiterFragment())
                    .addToBackStack(null)
                    .commit();
            }
        });
    }


    //  workshop

    private void page1() {
        TextView textView = getView().findViewById(R.id.page1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //    Replace Fragment
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.layoutMainFragmant, new oneFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
    private void page2() {
        TextView textView = getView().findViewById(R.id.page2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //    Replace Fragment
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.layoutMainFragmant, new twoFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
    private void page3() {
        TextView textView = getView().findViewById(R.id.page3);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //    Replace Fragment
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.layoutMainFragmant, new threeFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
    private void page4() {
        TextView textView = getView().findViewById(R.id.page4);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //    Replace Fragment
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.layoutMainFragmant, new fourFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
    private void page5() {
        TextView textView = getView().findViewById(R.id.page5);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //    Replace Fragment
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.layoutMainFragmant, new fiveFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

}
