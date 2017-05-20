package lzf.api;

/**
 * Created by Administrator on 2017/5/20 0020.
 */
public interface ViewBinder<T> {
    void bindView(T host,Object object,ViewFinder find);
    void unBindView(T host);
}
