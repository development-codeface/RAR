package mobileapp.rar.com.rarmobapp.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;


import mobileapp.rar.com.rarmobapp.R;


/**
 * Created by seshadri on 10/06/2016.
 */
public class DropDowns extends FrameLayout {

    private static final String TAG = "DropDowns";
    private int dropDownType = 0; // default dropdown
    private TypedArray dropdownArrts = null;
    private Context mContext = null;


    public DropDowns(Context context, int dropDownType) {
        super(context, null);
        this.mContext = context;
        this.dropdownArrts = dropdownArrts;
    }

    public DropDowns(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;

        this.dropdownArrts = context.obtainStyledAttributes(attrs, R.styleable.DropdownFactory);
        final Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int color = typedValue.data;
//        setBackgroundColor(color);
        this.dropDownType = dropdownArrts.getInteger(R.styleable.DropdownFactory_dropdownType, 1);
       /* com.dbs.sg.iw.api.logger.IWLog.i(TAG, "DropDowns: dropDownType::" + dropDownType);*/
        View v = getDropDownFactory(context, dropDownType);
        if (v != null)
            this.addView(v);
        dropdownArrts.recycle();
    }


    /**
     * factory to create view objects based on type
     *
     * @param context
     * @param dropDownType type of dropdown
     * @return
     */

    private View getDropDownFactory(Context context, int dropDownType) {

     /*   com.dbs.sg.iw.api.logger.IWLog.i(TAG, "DropDowns:getDropDownFactory : dropDownType::" + dropDownType);*/
        View view = null;
        LayoutInflater mLayoutInflater;

        switch (dropDownType) {

         /*   case 1:
                mLayoutInflater = LayoutInflater.from(mContext);
                view = mLayoutInflater.inflate(R.layout.c_view_dropdown_base, null);
                break;*/
            case 2:
                mLayoutInflater = LayoutInflater.from(mContext);
                view = mLayoutInflater.inflate(R.layout.c_view_dropdown_base_no_title, null);
                break;
/*            case 3:
                mLayoutInflater = LayoutInflater.from(mContext);
                view = mLayoutInflater.inflate(R.layout.c_view_dropdown_base_left, null);
                break;
            case 4:
                mLayoutInflater = LayoutInflater.from(mContext);
                view = mLayoutInflater.inflate(R.layout.c_view_dropdown_two_base_title, null);
                break;
            case 5:// trade single dropdown
                mLayoutInflater = LayoutInflater.from(mContext);
                view = mLayoutInflater.inflate(R.layout.c_view_dropdown_base_trade, null);
                break;
            case 6:// trade two dropdown
                mLayoutInflater = LayoutInflater.from(mContext);
                view = mLayoutInflater.inflate(R.layout.c_view_dropdown_two_base_title_trade, null);
                break;
            case 7: // Trade view order today
                mLayoutInflater = LayoutInflater.from(mContext);
                view = mLayoutInflater.inflate(R.layout.c_view_dropdown_base_trade_order_view, null);
                break;
            case 8: // Trade view order history
                mLayoutInflater = LayoutInflater.from(mContext);
                view = mLayoutInflater.inflate(R.layout.c_view_dropdown_two_base_title_trade_history, null);
                break;
            case 9: // Trade view order history
                mLayoutInflater = LayoutInflater.from(mContext);
                view = mLayoutInflater.inflate(R.layout.c_view_dropdownbase_price_alerts, null);
                break;
            case 10:
                mLayoutInflater = LayoutInflater.from(mContext);
                view = mLayoutInflater.inflate(R.layout.c_view_dd_base_pa, null);
                break;
            case 11:
                mLayoutInflater = LayoutInflater.from(mContext);
                view = mLayoutInflater.inflate(R.layout.c_view_dd_base_ca, null);
                break;*/

        }

        return view;
    }


}
