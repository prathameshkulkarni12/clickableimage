package at.lukle.clickableareasimage;

/**
 * Created by Lukas on 10/22/2015.
 */
public interface OnClickableAreaClickedListener<T,View> {
    void onClickableAreaTouched(T item,View view);
}
