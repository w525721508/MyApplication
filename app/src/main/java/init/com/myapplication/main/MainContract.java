package init.com.myapplication.main;

import init.com.myapplication.BasePresenter;
import init.com.myapplication.BaseView;

/**
 * Created by Administrator on 2017/11/17.
 */

public class MainContract {
    interface View extends BaseView<Presenter> {
        void showView(String data);
    }

    interface Presenter extends BasePresenter {
        void loadData(int condition);
    }
}
