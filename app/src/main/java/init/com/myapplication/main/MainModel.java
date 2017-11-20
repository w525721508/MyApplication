package init.com.myapplication.main;

/**
 * Created by Administrator on 2017/11/17.
 */

public class MainModel {
    /**
     * 处理逻辑
     *
     * @param condition 处理条件
     * @return 处理结果
     */
    public String getData(int condition) {
        switch (condition) {
            case 1: {
                return "处理结果为1";
            }
            case 2: {
                return "处理结果为2";
            }
            default: {

            }
            break;
        }
        return "处理结果为:没找到处理条件";
    }
}
