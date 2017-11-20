package init.com.myapplication.main;

import android.support.annotation.NonNull;

/**
 * Created by Administrator on 2017/11/17.
 */

public class MainPresenter implements MainContract.Presenter {
    MainModel mMainModel;
    MainContract.View mView;

    public MainPresenter(@NonNull MainModel mainModel, @NonNull MainContract.View view) {
        this.mMainModel = mainModel;
        this.mView = view;
        mView.setPresenter(this);
    }

    @Override
    public void loadData(int condition) {
        mView.showView(mMainModel.getData(condition));
    }
}
